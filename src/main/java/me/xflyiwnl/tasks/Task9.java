package me.xflyiwnl.tasks;

import me.xflyiwnl.runner.Task;

import java.util.Scanner;

public class Task9 implements Task {

    private Scanner scanner = new Scanner(System.in);

    @Override
    public void start() {

        int n = scanner.nextInt();
        int k = scanner.nextInt();

        System.out.println("binomial coefficient is " + binomial(n, k));

    }

    public int binomial(int n, int k) {
        if (k == 0 || k == n) return 1;
        return binomial(n - 1, k - 1) + binomial(n - 1, k);
    }

}
