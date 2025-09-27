
public class largest_element {
	public static int largest(int arr[]) {
		int large=arr[0];
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>large) {
				large=arr[i];
			}
		}
		return large;
	}

	public static void main(String[] args) {
		int arr[]= {2,4,3,7,5,6,8};
		System.out.println(largest(arr));

	}

}
