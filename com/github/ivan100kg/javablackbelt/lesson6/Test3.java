package com.github.ivan100kg.javablackbelt.lesson6;

import java.util.ArrayList;
import java.util.function.Supplier;
import java.util.function.Consumer;

public class Test3 {
    public static ArrayList<Car> createThreeCars(Supplier<Car> carSupplier) {
        ArrayList<Car> cars = new ArrayList<>();
        for (int i = 0; i < 3; i++) {
            cars.add(carSupplier.get());
        }
        return cars;
    }

    public static void changeCar(Car car, Consumer<Car> carConsumer) {
        carConsumer.accept(car);
    }

    public static void main(String[] args) {
        ArrayList<Car> arrayList = createThreeCars(() -> new Car("Nissan", "black", 225.0));
        System.out.println(arrayList);
        MySup(() -> "Hello");
        changeCar(arrayList.get(0), car -> car.engine/=2);
        System.out.println(arrayList);
    }

    public static void MySup(Supplier<String> stringSupplier) {
        System.out.println(stringSupplier.get());
    }
}

class Car {
    String model;
    String color;
    Double engine;

    public Car(String model, String color, Double engine) {
        this.model = model;
        this.color = color;
        this.engine = engine;
    }

    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                ", color='" + color + '\'' +
                ", engine=" + engine +
                '}';
    }
}