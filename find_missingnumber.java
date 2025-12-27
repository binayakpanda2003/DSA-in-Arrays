
public class find_missingnumber {
	public static void main(String []args) {
		int arr[]= {1,2,3,5};
		int n=5;
		int sum=n*(n+1)/2;
		int actualsum=0;
		for(int i : arr) {
			actualsum+=i;
		}
		System.out.println(sum-actualsum);
	}

}
