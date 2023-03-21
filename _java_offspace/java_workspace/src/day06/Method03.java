package day06;

import java.util.Scanner;

public class Method03 {

	public static void main(String[] args) {
		/* 메서드를 활용하여 계산기를 작성
		 * 
		 * 메서드는 + - * / % 를 작성하여 출력
		 * 두 수를 입력받아서 연산. 연산자를 입력받아 메서드를 활용하여 연산
		 * 3
		 */
		
		
		int num1 = 0, num2=0;
		String operator ;
		int hap =0;
		int cha =0;
		int gop =0;
		double nanugi = 0;
		int nam = 0;
		
		Scanner scan = new Scanner(System.in);
		System.out.println("======계산기=======");
		System.out.println("첫번째 수를 입력해주세요");
		num1= scan.nextInt();
		System.out.println("두번째 수를 입력해주세요");
		num2= scan.nextInt();
		
		System.out.println("연산하고싶은 연산자를 입력해주세요(+,-,*,/,%)");
		operator = scan.next();

			switch(operator){
				case  "+" : 
				hap =sum(num1,num2);
				System.out.print("두수의 합은 : ");
				System.out.println(hap);
				break;
				case "-" :
				cha =imsub(num1,num2);
				System.out.print("두수의 차는 : ");
				System.out.println(cha);
				break;
				case "*" :
				gop =mul(num1,num2);
				System.out.print("두수의 곱은 : ");
				System.out.println(gop);
				break;
				case "/" :
				nanugi =quo(num1,num2);
				System.out.print("두수의 몫은 : ");
				System.out.println(nanugi);
				break;
				case "%" :
				nam =mod(num1,num2);
				System.out.print("두수의 나머지는 : ");
				System.out.println(nam);
				break;
				default :
					System.out.println("연산자를 잘못입력하였습니다");
					
		}
		
		scan.close();
		}
	

	
	public static int sum(int num1,int num2) {
		return num1+num2;
	}
	
	public static int imsub(int num1, int num2) {
		return num1-num2;
	}
	
	public static int mul(int num1, int num2) {
		return num1*num2;
	}
	public static double quo(int num1, int num2) {
		return (double)num1/num2;
	}
	public static int mod(int num1, int num2) {
		return num1/num2;
	}
}
