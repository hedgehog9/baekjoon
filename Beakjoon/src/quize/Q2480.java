package quize;
import java.util.*;

/*
 	1에서부터 6까지의 눈을 가진 3개의 주사위를 던져서 다음과 같은 규칙에 따라 상금을 받는 게임이 있다. 

	-같은 눈이 3개가 나오면 10,000원+(같은 눈)×1,000원의 상금을 받게 된다. 
	같은 눈이 2개만 나오는 경우에는 1,000원+(같은 눈)×100원의 상금을 받게 된다. 
	모두 다른 눈이 나오는 경우에는 (그 중 가장 큰 눈)×100원의 상금을 받게 된다.  
	예를 들어, 3개의 눈 3, 3, 6이 주어지면 상금은 1,000+3×100으로 계산되어 1,300원을 받게 된다. 
	또 3개의 눈이 2, 2, 2로 주어지면 10,000+2×1,000 으로 계산되어 12,000원을 받게 된다. 
	3개의 눈이 6, 2, 5로 주어지면 그중 가장 큰 값이 6이므로 6×100으로 계산되어 600원을 상금으로 받게 된다.
	
	3개 주사위의 나온 눈이 주어질 때, 상금을 계산하는 프로그램을 작성 하시오.
	
	입력 
	첫째 줄에 3개의 눈이 빈칸을 사이에 두고 각각 주어진다. 
	
	출력 
	첫째 줄에 게임의 상금을 출력 한다.
	--------------------------
	예제입력              예제출력
	3 3 6               1300
	--------------------------
 */

public class Q2480 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int num1 = sc.nextInt(); // 0 0 1
		int num2 = sc.nextInt(); // 0 1 0 
		int num3 = sc.nextInt(); // 1 0 0
		int result = 0;
		
		// 세 숫자가 모두 같은경우 
		if(num1 == num2 && num2 == num3) {
			result = 10000+(num1*1000);
		}
		// 두개의 숫자가 같고, 한개가 다른 경우 
		
		 else if((num1 == num2 && num2 != num3)){
			result = 1000+(num1*100);
		}else if(num1 == num3 && num2 != num1){
			result = 1000+(num1*100);
		}else if(num2 == num3 && num1 != num2) {
			result = 1000+(num2*100);
		}
		// 세개의 숫자가 모두 다른경우 
		else if(num1 != num2 && num2 != num3 && num1 != num3) {
			
			// num1이 제일 큰 숫자인경우 
			if(num1> num2 && num1 > num3) {
				result = num1*100;
			}
			// num2가 제일 큰 숫자인경우
			else if(num2 > num1 && num2 > num3) {
				result = num2*100;
			}
			// num3가 제일 큰 숫자인경우
			else if(num3 > num1 && num3 > num2) {
				result = num3*100;
			}
		}
		
		System.out.println(result);
		
		
		
		
	}

}
