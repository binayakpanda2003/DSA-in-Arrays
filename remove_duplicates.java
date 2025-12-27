
public class remove_duplicates {
	//using two pointer :
	public static int remove_duplicates(int arr[]) {
		if (arr.length == 0) return 0;

        int j = 0;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] != arr[j]) {
                j++;
                arr[j] = arr[i];
            }
        }
        return j + 1;
	}
	
	
	
	public static void main(String[]args) {
		 int[] arr = {1, 1, 2, 2, 3, 4, 4, 5};
	        int n = remove_duplicates(arr);

	        for (int i = 0; i < n; i++) {
	            System.out.print(arr[i] + " ");
		}
	}

}
