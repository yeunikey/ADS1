package me.xflyiwnl.tasks;

import me.xflyiwnl.runner.Task;

import java.util.Scanner;

public class Task10 implements Task {

    private Scanner scanner = new Scanner(System.in);

    @Override
    public void start() {

        int a = scanner.nextInt();
        int b = scanner.nextInt();

        System.out.println("gcd is " + gcd(a, b));

    }

    public int gcd(int a, int b) {
        if (b == 0) return a;
        return gcd(b, a % b);
    }

}
