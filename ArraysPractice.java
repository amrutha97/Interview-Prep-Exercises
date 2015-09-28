# Interview-Prep-Exercises
Just some preparation for technical interviews. 

import java.util.ArrayList;
import java.util.Arrays;

public class ArraysPractice {
	
	public static void main(String[] args) {
		int[] arr = {1, 2, 3};
		//System.out.println(lastIndexOf(arr, 85));	
		System.out.println(stdev(arr));
	}
	
	public static int lastIndexOf(int[] arr, int num) {
		int value = -1;
		for(int i=0; i<arr.length; i++) {
			if(arr[i] == num) {
				value = i;
			}
		}
		return value;
	}
	
	public static int range(int[] arr) {
		int min = arr[0];
		int max = arr[0];
		
		for(int i=0; i<arr.length; i++) {
			if(arr[i] < min) {
				min = arr[i];
			} 
			if(arr[i] > max) {
				max = arr[i];
			}
		}
		return Math.abs(max - min) + 1;
	}
	
	public static int countInRange(int[] arr, int min, int max) {
		int count = 0;
		
		for(int i=0; i<arr.length; i++) {
			if(arr[i] >= min && arr[i] <= max){
				count++;
			}
		}
		return count;
	}
	
	public static boolean isSorted(double[] arr) {
		for(int i= 0; i<arr.length-1; i++) {
			if(arr[i+1] < arr[i]) {
				return false;
			}
		}
		return true;
	}
	
	public static int mode(int[] arr) {

		
		// [rows][comlumns]
		int[][] tally = new int[arr.length][2];
		
		for(int i=0; i<arr.length; i++) {
			
		}
		
		
		return -1;
	}
	
	public static double stdev(int[] arr) {
		
		double average = findAverage(arr);
		double computedSum = 0;
		
		for(int i=0; i<arr.length; i++) {
			double variance = Math.abs(arr[i] - average); 
			computedSum += Math.pow(variance, 2);
		}
		
		double answer = computedSum / (arr.length - 1);
		
		return Math.sqrt(answer);
	}

	private static double findAverage(int[] arr) {
		int sum = 0;
		
		for(int i=0; i<arr.length; i++) {
			sum += arr[i];
		}
		
		double average = (double) sum / arr.length;
		return average;
	}
	
	public static int kthLargest(int[] arr, int k) {
		Arrays.sort(arr);
		return arr[arr.length-k];
	}
	
}
