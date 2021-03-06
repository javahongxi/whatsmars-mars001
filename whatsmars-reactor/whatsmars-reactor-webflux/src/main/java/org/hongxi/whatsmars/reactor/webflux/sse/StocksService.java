package org.hongxi.whatsmars.reactor.webflux.sse;

import reactor.core.publisher.Flux;

public interface StocksService {

    Flux<StockItem> stream();
}