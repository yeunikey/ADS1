package me.xflyiwnl.runner;

import me.xflyiwnl.tasks.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    private static List<Task> tasks = new ArrayList<>();

    public static void main(String[] args) {
        registerTasks();
        selectTask();
    }

    public static void selectTask() {
        Scanner scanner = new Scanner(System.in);

        int task = 0;
        System.out.print("Select a task (1 - 10): ");

        try {
            task = scanner.nextInt();
        } catch (Exception e) {
            System.out.println("Wrong format");
            selectTask();
            return;
        }

        if (tasks.size() < task || task <= 0) {
            System.out.println("Task not found");
            return;
        }

        run(tasks.get(task - 1));
    }

    public static void registerTasks() {
        registerTask(new Task1());
        registerTask(new Task2());
        registerTask(new Task3());
        registerTask(new Task4());
        registerTask(new Task5());
        registerTask(new Task6());
        registerTask(new Task7());
        registerTask(new Task8());
        registerTask(new Task9());
        registerTask(new Task10());
    }

    public static void registerTask(Task task) {
        tasks.add(task);
    }

    public static void run(Task task) {
        task.start();
    }

}
