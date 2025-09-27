import java.util.Arrays;

public class Medianofarray {
	public static void midean(int arr[],int n) {
		Arrays.sort(arr);
		if(n%2==0) {
			int ind1=arr[(n/2)-1];
			int ind2=arr[(n/2)];
			double median=((double)(ind1+ind2)/2);
			System.out.println(median);
		}else {
			int median=arr[n/2];
			System.out.println(median);
		}
		
	}

	public static void main(String[] args) {
		int arr[]= {1,2,3,4,5,6};
		int n=arr.length;
		midean(arr,n);
	
	}

}
