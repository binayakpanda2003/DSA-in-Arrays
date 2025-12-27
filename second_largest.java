import java.util.Arrays;

public class second_largest {
	static int seclarge(int []arr ) {
		Arrays.sort(arr);
		int sec_large=arr[0];
		int large = arr[arr.length-1];
		for(int i=arr.length-2;i>0;i--) {
			if(arr[i]<large) {
				sec_large=arr[i];
				break;
			}
		}
		return sec_large;
	}
	public static void main(String []args) {
		int arr[]= {5,5,8,7,8,9,6,4,6,4,53};
		
		System.out.println(seclarge(arr));
		
		
	}

}
