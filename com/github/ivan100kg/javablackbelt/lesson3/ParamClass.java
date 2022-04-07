package com.github.ivan100kg.javablackbelt.lesson3;

public class ParamClass<T extends Object> {
    private T value;

    ParamClass(T value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "ParamClass{" +
                "value=" + value +
                '}';
    }
}
