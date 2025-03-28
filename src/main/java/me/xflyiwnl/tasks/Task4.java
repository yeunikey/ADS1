package me.xflyiwnl.tasks;

import me.xflyiwnl.runner.Task;

import java.util.Scanner;

public class Task4 implements Task {

    private Scanner scanner = new Scanner(System.in);

    @Override
    public void start() {

        int num = scanner.nextInt();

        System.out.println("calculated factorial is " + factorial(num));

    }

    public int factorial(int num) {
        if (num == 0 || num == 1) return 1;
        return num * factorial(num - 1);
    }

}
