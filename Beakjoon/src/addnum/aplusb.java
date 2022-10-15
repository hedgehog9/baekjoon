package addnum;

import java.util.Scanner;
// a+b 출력하기
public class aplusb {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		
		while(sc.hasNextInt()){
			
			int a = sc.nextInt();
			int b = sc.nextInt();
			System.out.println(a+b);
		
		}	
		sc.close();
	}

}
