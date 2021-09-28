package com.torryHarris.Model;

public class GenericPrint<T> {
    private T obj;

    public GenericPrint(T obj) {
        this.obj = obj;
    }

    public T getObj() {
        return obj;
    }
}
