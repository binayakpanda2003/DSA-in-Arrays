
public class Secondsmallest_and_secondlargest {
	static int secondsmallest(int arr[]) {
		int small=Integer.MAX_VALUE;
		int secsmall=Integer.MAX_VALUE;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]<small) {
				secsmall=small;
				small=arr[i];
				
			}else {
				if(arr[i]<secsmall&&arr[i]!=small) {
					secsmall=arr[i];
				}
			}
		}return secsmall;
		
	}
	static int secondlargest(int arr[]) {
		int large=Integer.MIN_VALUE;
		int seclarge=Integer.MIN_VALUE;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>large) {
				seclarge=large;
				large=arr[i];
				
			}else {
				if(arr[i]>seclarge&&arr[i]!=large) {
					seclarge=arr[i];
				}
			}
		}return seclarge;
		
	}

	public static void main(String[] args) {
		int arr[]= {2,4,3,7,5,6,8};
		System.out.println(secondsmallest(arr));
		System.out.println(secondlargest(arr));


	}

}
