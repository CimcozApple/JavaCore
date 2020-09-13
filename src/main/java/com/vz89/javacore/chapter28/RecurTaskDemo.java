package main.java.com.vz89.javacore.chapter28;

import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.RecursiveTask;

class SumDouble extends RecursiveTask<Double> {
    final int seqThresHold = 500;
    double[] data;
    int start, end;

    public SumDouble(double[] data, int start, int end) {
        this.data = data;
        this.start = start;
        this.end = end;
    }

    @Override
    protected Double compute() {
        double sum = 0;
        if ((end - start) < seqThresHold) {
            for (int i = start; i < end; i++) sum += data[i];
        } else {
            int middle = (start + end) / 2;
            SumDouble subTaskA = new SumDouble(data, start, middle);
            SumDouble subTaskB = new SumDouble(data, start, middle);

            subTaskA.fork();
            subTaskB.fork();

            sum = subTaskA.join() + subTaskB.join();
        }
        return sum;
    }
}

public class RecurTaskDemo {
    public static void main(String[] args) {
        ForkJoinPool forkJoinPool = new ForkJoinPool();
        double[] nums = new double[5000];

        for (int i = 0; i < nums.length; i++)
            nums[i] = (double) (((i % 2) == 0) ? i : -i);

        SumDouble task = new SumDouble(nums, 0, nums.length);

        double summation = forkJoinPool.invoke(task);
        System.out.println(summation);
    }
}
