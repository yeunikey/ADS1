package me.xflyiwnl.tasks;

import me.xflyiwnl.runner.Task;

import java.util.Scanner;

public class Task2 implements Task {

    private Scanner scanner = new Scanner(System.in);

    @Override
    public void start() {

        int count = scanner.nextInt();
        int[] nums = new int[count];

        for (int i = 0; i < count; i++) {
            nums[i] = scanner.nextInt();
        }

        System.out.println("calculated average is " + find(nums, count));

    }

    public double find(int[] nums, int num) {

        if (num == 1) {
            return nums[0];
        }

        return (find(nums, num - 1) * (num - 1) + nums[num - 1]) / (double) num;
    }

}
