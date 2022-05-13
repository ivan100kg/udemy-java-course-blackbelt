package com.github.ivan100kg.javablackbelt.lesson8;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Exchanger;

public class ExchangerEx {
    public static void main(String[] args) {
        Exchanger<Action> exchanger = new Exchanger<>();
        List<Action> friend1Actions = new ArrayList<>();
        friend1Actions.add(Action.SCISSORS);
        friend1Actions.add(Action.SCISSORS);
        friend1Actions.add(Action.STONE);
        List<Action> friend2Actions = new ArrayList<>();
        friend2Actions.add(Action.PAPER);
        friend2Actions.add(Action.STONE);
        friend2Actions.add(Action.SCISSORS);

        new BestFriend("Ivan", friend1Actions, exchanger);
        new BestFriend("Efim", friend2Actions, exchanger);
    }
}

enum Action {
    STONE, SCISSORS, PAPER
}

class BestFriend extends Thread {
    private String name;
    private List<Action> actions;
    private Exchanger<Action> exchanger;

    public BestFriend(String name, List<Action> actions, Exchanger<Action> exchanger) {
        this.name = name;
        this.actions = actions;
        this.exchanger = exchanger;
        this.start();
    }

    private void whoWins(Action myAction, Action friendsAction) {
        if ((myAction == Action.STONE && friendsAction == Action.SCISSORS)
                || (myAction == Action.SCISSORS && friendsAction == Action.PAPER)
                || (myAction == Action.PAPER && friendsAction == Action.STONE)) {
            System.out.println(name + " wins!!!");
        }
    }

    @Override
    public void run() {
        Action reply;
        for (Action action : actions) {
            try {
                reply = exchanger.exchange(action);
                whoWins(action, reply);
                sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}