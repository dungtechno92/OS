package com.dung.mergesort;

import java.util.concurrent.RecursiveAction;

public class MergeSortTask extends RecursiveAction {
    int[] a;
    private final int l;
    private final int h;

    public MergeSortTask(int[] a, int l, int h) {
        this.a = a;
        this.l = l;
        this.h = h;
    }

    void merge(int arr[], int l, int m, int h)
    {
        // Find sizes of two subarrays to be merged
        int n1 = m - l + 1;
        int n2 = h - m;

        /* Create temp arrays */
        int L[] = new int [n1];
        int R[] = new int [n2];

        /*Copy data to temp arrays*/
        for (int i=0; i<n1; ++i)
            L[i] = arr[l + i];
        for (int j=0; j<n2; ++j)
            R[j] = arr[m + 1+ j];


        /* Merge the temp arrays */

        // Initial indexes of first and second subarrays
        int i = 0, j = 0;

        // Initial index of merged subarry array
        int k = l;
        while (i < n1 && j < n2)
        {
            if (L[i] <= R[j])
            {
                arr[k] = L[i];
                i++;
            }
            else
            {
                arr[k] = R[j];
                j++;
            }
            k++;
        }

        /* Copy remaining elements of L[] if any */
        while (i < n1)
        {
            arr[k] = L[i];
            i++;
            k++;
        }

        /* Copy remaining elements of R[] if any */
        while (j < n2)
        {
            arr[k] = R[j];
            j++;
            k++;
        }
    }

    protected void compute() {
        if (l >= h) {
            return;
        }
        // Find the middle point
        int m = (l + h)/2;

        // Sort first and second halves
        MergeSortTask mergeSortTaskL = new MergeSortTask(a, l, m);
        MergeSortTask mergeSortTaskR = new MergeSortTask(a , m+1, h);
        invokeAll(mergeSortTaskL, mergeSortTaskR);
        // Merge the sorted halves
        merge(a, l, m, h);
    }
}
