package me.xflyiwnl.tasks;

import me.xflyiwnl.runner.Task;

import java.util.Scanner;

public class Task1 implements Task {

    private Scanner scanner = new Scanner(System.in);

    @Override
    public void start() {

        int count = scanner.nextInt();
        int[] nums = new int[count];

        for (int i = 0; i < count; i++) {
            nums[i] = scanner.nextInt();
        }

        System.out.println("finded min element is " + find(nums, count));

    }

    public int find(int[] nums, int num) {

        if (num == 1) {
            return nums[0];
        }

        return Math.min(nums[num - 1], find(nums, num - 1));
    }

}
