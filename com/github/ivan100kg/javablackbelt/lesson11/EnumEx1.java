package com.github.ivan100kg.javablackbelt.lesson11;

public class EnumEx1 {
    public static void main(String[] args) {
        Today today = new Today(WeekDays.MON);
        today.daysInfo();
    }
}

enum WeekDays {
    MON, TUE, WED, THU, FRI, SAT, SUN
}

class Today {
    WeekDays weekDay;

    public Today(WeekDays weekDay) {
        this.weekDay = weekDay;
    }

    void daysInfo() {
        switch (weekDay) {
            case MON, TUE, WED, THU, FRI -> System.out.println("Go work!");
            case SAT, SUN -> System.out.println("Have a rest!");
        }
    }
}
