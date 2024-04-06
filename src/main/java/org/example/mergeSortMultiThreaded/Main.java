package org.example.mergeSortMultiThreaded;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Main {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        List<Integer> listToSort = Arrays.asList(5, 3, 1, 2, 4, 8, 6, 7);
        ExecutorService executor = Executors.newCachedThreadPool();
        MergeSorter sorter = new MergeSorter(listToSort, executor);


        Future<List<Integer>> sortedListFuture = executor.submit(sorter);
        List<Integer> sortedList = sortedListFuture.get();
        System.out.println("Sorted List: " + sortedList);
        executor.shutdown();
    }
}
