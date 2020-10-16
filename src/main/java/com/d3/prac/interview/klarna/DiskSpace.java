package com.d3.prac.interview.klarna;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class DiskSpace {

    public static boolean isWritable(int blockSize, int fileSize, Set<Integer> occupiedSectors) {
        //base case
        if (fileSize > blockSize) {
            return false;
        }
        if (occupiedSectors.size() == 0) {
            return true;
        }
        if (occupiedSectors.size() == blockSize) {
            return false;
        }
        int[] arr = occupiedSectors.stream().sorted().mapToInt(Integer::intValue).toArray();

        Boolean result = checkBoundaryConditions(blockSize, fileSize, arr);
        for (int i = 0; i < arr.length - 1; i++) {
            if ((arr[i + 1] - arr[i]) >= fileSize) {
                result = true;
                if (result) {
                    return result;
                }
            }
        }
        return result;
    }

    private static Boolean checkBoundaryConditions(int blockSize, int fileSize, int[] arr) {
        Boolean result = null;
        if (arr[0] != 1 && arr[0] > 1) {
            result = arr[0] - 1 >= fileSize;
        }
        if (arr[arr.length - 1] != blockSize && arr[arr.length - 1] < blockSize) {
            result = (blockSize - arr[arr.length - 1] >= fileSize);
        }
        return result;
    }

    public static void main(String[] args) {
        //System.out.println(DiskSpace.isWritable(4,2, new HashSet<>(Arrays.asList(1, 4))));
        //System.out.println(DiskSpace.isWritable(1,1, new HashSet<>(Arrays.asList(1))));
        System.out.println(DiskSpace.isWritable(10, 2, new HashSet<>(Arrays.asList(2, 3, 5, 8, 9))));
    }
}