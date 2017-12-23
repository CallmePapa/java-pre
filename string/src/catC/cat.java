package catC;
import java.util.Arrays; 
import java.util.Comparator; 
  

public class cat {

	public static void main(String[] args){
		int[] arr1 = {1,7,9,11,13,15,17,19}; 
		int[] arr2 = { 2,4,6,8,10}; 
		String temp = Arrays.toString (arr1) + Arrays.toString (arr2); 
		temp = temp.replaceAll ("\\]\\[", ",").replaceAll ("\\s", "").replaceAll ("[\\[\\]]", ""); 
		String[] result = temp.split ("\\,"); 
		System.out.println (Arrays.toString (result)); 
		Arrays.sort (result, new Comparator<String> () 
		{ 
		public int compare ( String o1, String o2 ) 
		{ 
		int a = Integer.parseInt (o1), b = Integer.parseInt (o2); 
		if (a > b) 
		{ 
		return 1; 
		} 
		else if (a < b) 
		{ 
		return -1; 
		} 
		else 
		{ 
		return 0; 
		} 
		} 
		}); 
		System.out.println (Arrays.toString (result)); 
		} 

	}

