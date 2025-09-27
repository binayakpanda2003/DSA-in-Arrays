
public class non_repeating {

	public static void main(String[] args) {
		int arr[]= {1,2,1,2,3,4,4,5,5};
		int len=arr.length;
		for(int i=0;i<len;i++) {
			int j;//arr[i}=1
			for(j=0;j<len;j++) {
				if(i!=j && arr[i]==arr[j]) {
					break;
				}
			}
			if(len==j) {
				System.out.println(arr[i]);
		}
		
		}
	}

}
