
public class Smallest_element {
	public static int smallest(int arr[]) {
		int small=arr[0];
		for(int i=0;i<arr.length;i++) {
			if(arr[i]<small) {
				small=arr[i];
			}
		}
		return small;
	}

	public static void main(String[] args) {
		int arr[]= {2,4,3,7,5,6,8};
		System.out.println(smallest(arr));

	}

}
