package me.xflyiwnl.tasks;

import me.xflyiwnl.runner.Task;

import java.util.Scanner;

public class Task6 implements Task {

    private Scanner scanner = new Scanner(System.in);

    @Override
    public void start() {

        int a = scanner.nextInt();
        int n = scanner.nextInt();

        System.out.println("calculated power is " + power(a, n));

    }

    public int power(int a, int n) {
        if (n == 0) return 1;
        return a * power(a, n - 1);
    }

}
