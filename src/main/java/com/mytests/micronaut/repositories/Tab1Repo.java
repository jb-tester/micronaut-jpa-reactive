package com.mytests.micronaut.repositories;

import com.mytests.micronaut.data.Tab1;
import io.micronaut.core.async.annotation.SingleResult;
import io.micronaut.data.annotation.Repository;
import io.micronaut.data.operations.reactive.ReactiveCapableRepository;
import io.micronaut.data.repository.reactive.ReactiveStreamsCrudRepository;
import org.reactivestreams.Publisher;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import javax.validation.constraints.NotNull;

/**
 * *
 * <p>Created by irina on 08.09.2021.</p>
 * <p>Project: micronaut-jpa-reactive</p>
 * *
 */
@Repository("default")
public interface Tab1Repo extends ReactiveStreamsCrudRepository<Tab1,Integer> {
    
   
    @SingleResult
    Publisher<Tab1> findByForth(boolean forth);
    Publisher<Tab1> findByThirdGreaterThan(Integer arg);

    Publisher<String> findSecondByForth(boolean forth);
    
    Mono<Integer> countBySecondContains(String second);
    Mono<Boolean> existsByFirst(String first);
    Mono<Tab1> getTopByForth(boolean forth);
    
    Flux<Integer> getThirdByForth(boolean forth);
    
    Flux<Tab1> searchByThirdLessThan(int third);
    
}
