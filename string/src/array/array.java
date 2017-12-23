package array;
import java.util.Arrays; 

public class array {
	public static void main(String[] args){
		int[] arr1 = {1,7,9,11,13,15,17,19}; 
		int[] arr2 = { 2,4,6,8,10}; 
		int[] arr=new int[arr1.length+arr2.length];
		System.arraycopy(arr1, 0, arr, 0, arr1.length);
		System.arraycopy(arr2, 0, arr, arr1.length, arr2.length);
		Arrays.sort(arr);
		System.out.print("排序后的数组:");
		for(int result:arr)
			System.out.print(" "+result);
	}

}
