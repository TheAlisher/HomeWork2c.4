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
            for (int j = 5; j > 0; j--) {
                Runner runner = new Runner("Бегун " + j);

                runner.setNameNumPlus(j - 1);
                runner.setPriority(j);
                runner.start();
                System.out.println("___");
                runner.join();

            }
        } catch (Exception e) { }
    }
}
