package com.github.ivan100kg.javablackbelt.lesson3;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Team<T extends Participant> {
    private String name;
    private List<T> participants = new ArrayList<>();

    public Team(String name) {
        this.name = name;
    }

    public void add(T participant) {
        participants.add(participant);
        System.out.println("New participant " + participant.getName() + " was added to the " + name + " team.");
    }

    public void playWith(Team<?> team) {
        String winnerName;
        Random random = new Random();
        int i = random.nextInt(2);
        if(i == 0) winnerName = this.name;
        else winnerName = team.name;
        System.out.println("Team " + winnerName + " has won");
    }

}
