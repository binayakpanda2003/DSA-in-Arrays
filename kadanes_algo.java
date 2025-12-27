
public class kadanes_algo {
	public static int max_subarray_sum(int arr[]) {
		int result=arr[0];
		int n = arr.length;
		for(int i=0;i<n;i++) {
			int sum=0;
			for(int j=i;j<n;j++) {
				sum=sum+arr[j];
				result=Math.max(sum, result);
			}
		}
		
		return result;
		
	}

	public static void main(String[] args) {
		int arr[]= {4,5,9,8,2,5,7,8,6,1,5};
		System.out.println(max_subarray_sum(arr));

	}

}
