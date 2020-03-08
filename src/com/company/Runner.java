package com.company;

public class Runner extends Thread {

    private int nameNumPlus;

    public Runner(String name) {
        super(name);
    }

    public int getNameNumPlus() {
        return nameNumPlus;
    }

    public void setNameNumPlus(int nameNumPlus) {
        this.nameNumPlus = nameNumPlus;
    }

    synchronized public void run() {

            System.out.println(this.getName() + " берет палочку");

        try {

            if (getPriority() >= 5 ) {
                System.out.println(getName() + " бежит к финишу");
            } else {
                System.out.println(getName() + " бежит к " + "Бегун " + (getNameNumPlus()));
                if (getPriority() == 5)
                    System.out.println(getName() + " бежит к " + "Бегун " + getNameNumPlus());
            }

        } catch (Exception e) { }
    }
}
