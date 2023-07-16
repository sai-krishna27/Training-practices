package com.java3;

import java.util.*;
import java.util.List;

public class LongestIncreasingSubsequence {
    public static void main(String[] args) {
        int[] numbers = {89,54,12,64,48,19,26};
        List<Integer> longestIncreasingSubsequence = findLongestIncreasingSubsequence(numbers);
        
        System.out.println("Longest increasing subsequence in "+Arrays.toString(numbers)+" is " + longestIncreasingSubsequence);
    }
    
    public static List<Integer> findLongestIncreasingSubsequence(int[] numbers) {
    	
        // Store lis of increasing subsequences
        int[] lis = new int[numbers.length]; 
        // Store indices of previous elements in the subsequence
        int[] previousIndices = new int[numbers.length]; 
        
        // Index of the last element of the longest subsequence
        int maxLengthIndex = 0;
     // Length of the longest subsequence
        int maxLength = 1; 
        
        // Initialize the lis and previousIndices arrays
        for (int i = 0; i < numbers.length; i++) {
            lis[i] = 1;
            previousIndices[i] = -1;
        }
        
        // Compute the lis of increasing subsequences
        for (int i = 1; i < numbers.length; i++) {
            for (int j = 0; j < i; j++) {
                if (numbers[i] > numbers[j] && lis[i] < lis[j] + 1) {
                    lis[i] = lis[j] + 1;
                    previousIndices[i] = j;
                }
                
            }

            
            // Update the index and length of the longest subsequence
            if (lis[i] > maxLength) {
                maxLength = lis[i];
                maxLengthIndex = i;
            }

            
        }
        
        // Reconstruct the longest increasing subsequence
        List<Integer> longestIncreasingSubsequence = new ArrayList<>();
        int currentIndex = maxLengthIndex;
        while (currentIndex >= 0) {
            longestIncreasingSubsequence.add(0, numbers[currentIndex]);
            currentIndex = previousIndices[currentIndex];
        }
        
        return longestIncreasingSubsequence;
    }
}

