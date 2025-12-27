import java.util.*;
public class smallest_and_largest_element {
	public static void find(int arr[]) {
		
		int min=arr[0];
		int max=arr[0];
		for(int i=1;i<arr.length;i++) {
			if(arr[i]<min) {
				min=arr[i];
			}
			if(arr[i]>max) {
				max=arr[i];
			}
			
		}
		System.out.println(min);
		System.out.println(max);
       		
	}
	public static void main(String[] args) {
		int arr[]= {5,4,6,1,3,7,8,9};
		find(arr);
		
	}

}
