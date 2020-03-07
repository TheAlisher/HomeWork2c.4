package com.company;

public class Main {

    public static void main(String[] args) {

        try {

            for (int i = 1; i < 5; i++) {
                Runner runner = new Runner("Бегун " + i);

                runner.setNameNumPlus(1 + i);
                runner.setPriority(i);
                runner.start();
                System.out.println("___");
                runner.join();

            }
            for (int j = 5; j > 1; j--) {
                Runner runner = new Runner("Бегун " + j);

                runner.setNameNumPlus(j - 1);
                runner.setPriority(j);
                runner.start();
                System.out.println("___");
                runner.join();
                if (runner.getPriority() == 5)
                    System.out.println(runner.getName() + " бежит к " + "Бегун " + runner.getNameNumPlus());
            }
        } catch (Exception e) { }
    }
}
