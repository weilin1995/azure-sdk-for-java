// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.cosmos.benchmark;

import com.azure.cosmos.CosmosPagedFlux;
import com.azure.cosmos.models.FeedOptions;
import com.azure.cosmos.models.FeedResponse;
import com.azure.cosmos.models.PartitionKey;
import reactor.core.publisher.BaseSubscriber;
import reactor.core.scheduler.Schedulers;

class AsyncQuerySinglePartitionMultiple extends AsyncBenchmark<FeedResponse<PojoizedJson>> {

    private static final String SQL_QUERY = "Select * from c where c.pk = \"pk\"";
    private FeedOptions options;
    private int pageCount = 0;

    AsyncQuerySinglePartitionMultiple(Configuration cfg) {
        super(cfg);
        options = new FeedOptions();
        options.setPartitionKey(new PartitionKey("pk"));
        options.setMaxItemCount(10);
    }

    @Override
    protected void onSuccess() {
        pageCount++;
        if (pageCount % 10000 == 0) {
            if (pageCount == 0) {
                return;
            }
            logger.info("total pages so far: {}", pageCount);
        }
    }

    @Override
    protected void performWorkload(BaseSubscriber<FeedResponse<PojoizedJson>> baseSubscriber, long i) throws InterruptedException {
        CosmosPagedFlux<PojoizedJson> obs = cosmosAsyncContainer.queryItems(SQL_QUERY, options, PojoizedJson.class);

        concurrencyControlSemaphore.acquire();

        obs.byPage().subscribeOn(Schedulers.parallel()).subscribe(baseSubscriber);
    }
}
