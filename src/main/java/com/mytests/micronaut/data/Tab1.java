package com.mytests.micronaut.data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * *
 * <p>Created by irina on 08.09.2021.</p>
 * <p>Project: micronaut-jpa-reactive</p>
 * *
 */
@Entity
public class Tab1 {

    @Id
    @GeneratedValue
    private Integer id;
    String first;
    String second;
    int third;
    boolean forth;

    public Tab1() {
    }

    public Tab1(String first, String second, int third, boolean forth) {
        this.first = first;
        this.second = second;
        this.third = third;
        this.forth = forth;
    }
    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public String getFirst() {
        return first;
    }

    public String getSecond() {
        return second;
    }

    public int getThird() {
        return third;
    }

    public boolean isForth() {
        return forth;
    }
}
