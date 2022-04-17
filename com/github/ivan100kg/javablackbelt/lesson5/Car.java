package com.github.ivan100kg.javablackbelt.lesson5;

public class Car {
    String color;
    int doorCount;
    Engine engine;

    public Car(String color, int doorCount, Engine engine) {
        this.color = color;
        this.doorCount = doorCount;
        this.engine = engine;
    }

    public Car(String color, int doorCount, int power) {
        this.color = color;
        this.doorCount = doorCount;
        this.engine = this.new Engine(power);
    }

    @Override
    public String toString() {
        return "Car{" +
                "color='" + color + '\'' +
                ", doorCount=" + doorCount +
                ", engine=" + engine +
                '}';
    }

    // static class
//    public static class Engine{
//        int power;
//
//        public Engine(int power) {
//            this.power = power;
//        }
//
//        @Override
//        public String toString() {
//            return "Engine{" +
//                    "power=" + power +
//                    '}';
//        }
//    }

    // inner class
    public class Engine {
        private int power;

        public Engine(int power) {
            this.power = power;
        }

        @Override
        public String toString() {
            return "Engine{" +
                    "power=" + power +
                    '}';
        }
    }
}

class Test {
    public static void main(String[] args) {
        // static class
//        Car.Engine engine = new Car.Engine(101);
//        System.out.println(engine);
//        Car car = new Car("red", 4, engine);
//        System.out.println(car);

        // inner class
        Car car = new Car("Black", 4, 150);
        System.out.println(car);
    }
}
