package me.xflyiwnl.tasks;

import me.xflyiwnl.runner.Task;

import java.util.Scanner;

public class Task3 implements Task {

    private Scanner scanner = new Scanner(System.in);

    @Override
    public void start() {

        int num = scanner.nextInt();

        if (isPrime(num, 2)) {
            System.out.println("Prime");
        } else {
            System.out.println("Composite");
        }
    }

    public boolean isPrime(int num, int divisor) {
        if (num < 2) return false;
        if (divisor * divisor > num) return true;
        if (num % divisor == 0) return false;
        return isPrime(num, divisor + 1);
    }
}
