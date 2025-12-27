import java.util.*;
public class movezeroes_toend {
	public static void main(String[]args) {
		int arr[]= {0,1,2,3,0,4};int pos=0;
		for(int i=0;i<arr.length;i++) {
			if(!(arr[i]==0)) {
				arr[pos]=arr[i];
				pos++;
			}
		}
		for(int i=pos;i<arr.length;i++) {
			arr[pos]=0;
			pos++;
		}
		for(int i : arr) {
			System.out.println(i);
		}
	}

}
