
public class check_arrayissorted {
	public static void main(String []args) {
		int arr[]= {1,2,3,4,5,6,7,8,9};
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>arr[i+1]) {
				System.out.println("Not Sorted.");
				break;
			}
			else {
				System.out.println("Sorted");
				break;
			}
		}
	}

}
