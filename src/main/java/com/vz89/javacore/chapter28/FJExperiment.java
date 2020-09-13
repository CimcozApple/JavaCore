package main.java.com.vz89.javacore.chapter28;

import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.RecursiveAction;

class Transrom extends RecursiveAction {
    int seqTreshold;
    double[] data;
    int start, end;

    public Transrom(int seqTreshold, double[] data, int start, int end) {
        this.seqTreshold = seqTreshold;
        this.data = data;
        this.start = start;
        this.end = end;
    }

    @Override
    protected void compute() {
        if ((end - start) < seqTreshold) {
            for (int i = start; i < end; i++) {
                if ((data[i] % 2) == 0) data[i] = Math.sqrt(data[i]);
                else data[i] = Math.cbrt(data[i]);
            }
        } else {
            int middle = (start + end) / 2;
            invokeAll(new Transrom(seqTreshold, data, start, middle), new Transrom(seqTreshold, data, middle, end));
        }
    }
}

public class FJExperiment {
    public static void main(String[] args) {
        //int pLevel = 6;
        int treshhold = 10000;

        long beginTime, endTime;
        ForkJoinPool forkJoinPool = new ForkJoinPool();
        double[] nums = new double[100000000];
        for (int i = 0; i < nums.length; i++) nums[i] = (double) i;

        beginTime = System.nanoTime();
        forkJoinPool.invoke(new Transrom(treshhold,nums,0,nums.length));
        endTime = System.nanoTime();

        System.out.println("Уровень параллелизма " + forkJoinPool.getParallelism());
        System.out.println("Порог последовательной обработки " + treshhold);
        System.out.println("Истекшее время " + (endTime-beginTime)/1000000 + " миллисек");
        System.out.println();
    }

}
