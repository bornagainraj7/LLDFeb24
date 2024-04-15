package org.example.concurrency.mergeSortMultiThreaded;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;

public class MergeSorter implements Callable<List<Integer>> {
    List<Integer> listToSort;
    ExecutorService executor;


    MergeSorter(List<Integer> listToSort, ExecutorService executor) {
        this.listToSort = listToSort;
        this.executor = executor;
    }

    @Override
    public List<Integer> call() throws Exception {
        // Merge sort logic
        int size = listToSort.size();

        if (size <= 1) {
            return listToSort;
        }

        List<Integer> leftHalf = new ArrayList<>();
        List<Integer> rightHalf = new ArrayList<>();

        for (int i = 0; i < size/2; i++) {
            leftHalf.add(listToSort.get(i));
        }

        for (int i = size/2; i < size; i++) {
            rightHalf.add(listToSort.get(i));
        }

        MergeSorter leftMergeSorter = new MergeSorter(leftHalf, executor);
        MergeSorter rightMergeSorter = new MergeSorter(rightHalf, executor);

//        ExecutorService executor = Executors.newCachedThreadPool();
        Future<List<Integer>> leftSortedListFuture = executor.submit(leftMergeSorter);
        Future<List<Integer>> rightSortedListFuture = executor.submit(rightMergeSorter);

        List<Integer> leftSortedList = leftSortedListFuture.get();
        List<Integer> rightSortedList = rightSortedListFuture.get();

        int i = 0, j = 0;
        List<Integer> sortedList = new ArrayList<>();

        while(i < leftSortedList.size() && j < rightSortedList.size()) {
            if (leftSortedList.get(i) < rightSortedList.get(j)) {
                sortedList.add(leftSortedList.get(i));
                i++;
            } else {
                sortedList.add(rightSortedList.get(j));
                j++;
            }
        }

        while(i < leftSortedList.size()) {
            sortedList.add(leftSortedList.get(i));
            i++;
        }

        while(j < rightSortedList.size()) {
            sortedList.add(rightSortedList.get(j));
            j++;
        }


        return sortedList;
    }
}
