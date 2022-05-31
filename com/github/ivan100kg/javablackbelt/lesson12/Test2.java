package com.github.ivan100kg.javablackbelt.lesson12;

import java.lang.annotation.*;

public class Test2 {
    public static void main(String[] args) {
        Class<Xiaomi> xiaomiClass = Xiaomi.class;
        Annotation annotation1 = xiaomiClass.getAnnotation(SmartPhone.class);
        SmartPhone sm1 = (SmartPhone) annotation1;
        System.out.println(sm1.OS());
        System.out.println(sm1.year());

    }
}

@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@interface SmartPhone {
    String OS() default "Android";

    int year() default 2010;
}

@SmartPhone
class Xiaomi {

}

@SmartPhone(OS = "IOS", year = 1976)
class Apple {

}
