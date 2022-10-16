package quize;

import java.util.Scanner;
public class Q1110 {
	
		public static void main(String[] args) {
			
			Scanner sc = new Scanner(System.in);
				
			int x = sc.nextInt();
			
			int result = x;
			int ten = result/10;
			int one = result%10;
			int hab = x;
			int count = 0;
			
/*
			if(x<10) {
				x*=10;
				count++;
			}
*/			
			do {
				
				ten = result/10;
				one = result%10;
				
				hab = ten+one;
				result = one*10 + hab%10;
				
				count++;
				
			} while (!(x==result));
			/*
			if(x==0) {
				count--;
			}
		*/
			System.out.println(count);
		}

	}

/*
   public static void main(String[] args)  {
      
      Scanner sc = new Scanner(System.in);
      
      int N = sc.nextInt();
      int R = N;
      int a,b;
      int count=0;
      String sum_ab;
      do {
         a = N/10;
         b = N%10;
         
         sum_ab = String.valueOf(b) + String.valueOf((a+b)%10);
         N = Integer.parseInt(sum_ab);
         
         b = (a+b)%10;
         count++;
         
      }while(!(R==N));
      System.out.println(count);
   }

}
 */




