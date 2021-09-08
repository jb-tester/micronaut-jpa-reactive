package com.mytests.micronaut.controllers;

import com.mytests.micronaut.data.Tab1;
import com.mytests.micronaut.repositories.Tab1Repo;
import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.annotation.PathVariable;
import jakarta.inject.Inject;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

/**
 * *
 * <p>Created by irina on 08.09.2021.</p>
 * <p>Project: micronaut-jpa-reactive</p>
 * *
 */
@Controller("/tab1")
public class Tab1Controller {
    @Inject
    Tab1Repo repo;
    @Get("/all")
    public Flux<Tab1> all() {
        return Flux.from(repo.findAll());
    }

    @Get("/existsByFirst/{fff}")
    public Mono<Boolean> existsByFirst(@PathVariable String fff) {
        return Mono.from(repo.existsByFirst(fff));
    }

    @Get("/byForthAndThird/{ttt}")
    public Flux<Tab1> byForth(@PathVariable String ttt) {
        return Flux.from(repo.findByForth(true)).concatWith(repo.findByThirdGreaterThan(Integer.parseInt(ttt)));
    }

    @Get("/secondsByForth")
    public Flux<String> byThirdGraterThen() {
        return Flux.from(repo.findSecondByForth(true));
    }
    @Get("/byThirdLessThan/{ttt}")
    public Flux<Tab1> byThirdLessThen(@PathVariable String ttt) {
        return repo.searchByThirdLessThan(Integer.parseInt(ttt));
    }
}
