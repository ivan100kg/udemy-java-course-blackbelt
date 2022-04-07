package com.github.ivan100kg.javablackbelt.lesson3;

import java.util.List;

public class ParamMethod {
    public static <T> T getFirstElement(List<T> list) {
        return list.get(0);
    }
}
