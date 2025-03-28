package me.xflyiwnl.tasks;

import me.xflyiwnl.runner.Task;

import java.util.Scanner;

public class Task8 implements Task {

    private Scanner scanner = new Scanner(System.in);

    @Override
    public void start() {

        String input = scanner.next();

        System.out.println(isDigitOnly(input) ? "Yes" : "No");

    }

    public boolean isDigitOnly(String str) {
        return str.matches("\\d+");
    }

}
