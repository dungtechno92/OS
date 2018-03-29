package com.dung.mergesort;

import java.util.Date;
import java.util.Random;
import java.util.concurrent.ForkJoinPool;

public class MergeSortTest {
    public static void main(String[] args) {
        int arr[] = new int[100000000];
        Random random = new Random();
        for (int i = 0; i < 100000000; i++) {
            arr[i] = random.nextInt();
        }

        // Sort directly
        long startSort = new Date().getTime();

        MergeSort ob = new MergeSort();
        ob.sort(arr, 0, arr.length-1);

        long endSort = new Date().getTime();
        System.out.println("\nSorted array in: " + (endSort - startSort));


        int arr2[] = new int[100000000];
        for (int i = 0; i < 100000000; i++) {
            arr2[i] = random.nextInt();
        }
        // Sort with fork join framework
        startSort = new Date().getTime();
        ForkJoinPool forkJoinPool = new ForkJoinPool(4);
        MergeSortTask mergeSortTask = new MergeSortTask(arr2, 0, arr2.length - 1);
        forkJoinPool.invoke(mergeSortTask);
        endSort = new Date().getTime();
        System.out.println("\nSorted array in: " + (endSort - startSort));
    }
}
