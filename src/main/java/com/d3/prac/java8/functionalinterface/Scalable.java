package com.d3.prac.java8.functionalinterface;

@FunctionalInterface
public interface Scalable {

    String DEFAULT_SCALE = "10";

    public abstract void getScale();

}
