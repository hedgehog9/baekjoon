package quize.array;
import java.util.*;

public class Q2562 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int cnt = 0,j = 0;
		int arr[] = new int[9] ;
		do {
			arr[cnt++] = sc.nextInt();
		} while (!(cnt==9));
		int max = arr[0];
		for(int i = 0; i<=8;i++) {
			if(max < arr[i]) {
				max = arr[i];
			}
		}
		for(int i = 0; i < 9;i++) {
			if(max == arr[i])
				j=i+1;
		}
		System.out.println(max);
		System.out.println(j);
	}
}
