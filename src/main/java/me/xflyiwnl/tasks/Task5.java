package me.xflyiwnl.tasks;

import me.xflyiwnl.runner.Task;

import java.util.Scanner;

public class Task5 implements Task {

    private Scanner scanner = new Scanner(System.in);

    @Override
    public void start() {

        int num = scanner.nextInt();

        System.out.println("fibonacci number is " + fibonacci(num));

    }

    public int fibonacci(int num) {
        if (num == 0) return 0;
        if (num == 1) return 1;
        return fibonacci(num - 1) + fibonacci(num - 2);
    }

}
