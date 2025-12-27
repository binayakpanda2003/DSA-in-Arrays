import java.util.*;
public class duplicate_elements {
	public static void main(String []args) {
		int arr[]= {1,1,2,3,4,4,5,6,8,8,9};
		HashSet <Integer> set = new HashSet<>();
		for(int num : arr) {
			if(!set.add(num)) {
				System.out.println(num);
			}
		}
	}

}
