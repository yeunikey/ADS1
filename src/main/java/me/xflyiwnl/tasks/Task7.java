package me.xflyiwnl.tasks;

import me.xflyiwnl.runner.Task;

import java.util.Scanner;

public class Task7 implements Task {

    private Scanner scanner = new Scanner(System.in);

    @Override
    public void start() {

        String input = scanner.next();
        permute(input, "");

    }

    public void permute(String str, String prefix) {
        if (str.isEmpty()) {
            System.out.println(prefix);
            return;
        }

        for (int i = 0; i < str.length(); i++) {
            String newStr = str.substring(0, i) + str.substring(i + 1);
            permute(newStr, prefix + str.charAt(i));
        }
    }

}
