package com.company;

public class Runner extends Thread {

    private int nameNumPlus = 1;
    private int nameNumMinus = 6;

    public Runner(String name) {
        super(name);
    }

    public int getNameNumPlus() {
        return nameNumPlus;
    }

    public void setNameNumPlus(int nameNumPlus) {
        this.nameNumPlus = nameNumPlus;
    }

    public int getNameNumMinus() {
        return nameNumMinus;
    }

    public void setNameNumMinus(int nameNumMinus) {
        this.nameNumMinus = nameNumMinus;
    }

    synchronized public void run() {

        System.out.println(this.getName() + " берет палочку");
        try {
            /*if (getPriority() < 5)
                System.out.println(this.getName() + " бежит к " + (nameNum + 1));*/
            if (getPriority() == 5)
                System.out.println(getName() + " бежит к финишу");

        } catch (Exception e) {
        }
    }
}
