//package prac01_1;
//import java.util.Scanner;
//public class hjh180912 {
//	public static void main(String args[]) {
//		Scanner scan = new Scanner(System.in);
//		System.out.print("What is your score?");
//		int score = scan.nextInt();
//		
//		if(score >= 80)
//			System.out.println("ずせずせ");
//		scan.close();
//	}
//}


//package prac01_1;
//import java.util.Scanner;
//public class hjh180912 {
//	public static void main(String args[]) {
//		Scanner scan = new Scanner(System.in);
//		System.out.print("What is your score?");
//		int score = scan.nextInt();
//		
//		if(score >= 80)
//			System.out.println("ずせずせ");
//		else
//			System.out.println("陥製 奄噺拭");
//		scan.close();
//	}
//}


//package prac01_1;
//import java.util.Scanner;
//public class hjh180912 {
//	public static void main(String args[]) {
//		Scanner scan = new Scanner(System.in);
//		System.out.print("What is your score?");
//		int score = scan.nextInt();
//		
//		if(score >= 80)
//			System.out.println("ずせずせ");
//		else
//			System.out.println("陥製 奄噺拭");
//		
//		String result = score>=80? "pass!" : "fail!";
//		System.out.println(result);
//		System.out.println(score>=80? "pass2!":"fail2!");
//		scan.close();
//	}
//}


//package prac01_1;
//import java.util.Scanner;
//public class hjh180912 {
//	public static void main(String args[]) {
//		Scanner scan = new Scanner(System.in);
//		System.out.print("What is your score?");
//		int score = scan.nextInt();
//		char grade;
//		if(score >= 90)
//			grade = 'A';
//		else if(score >= 80)
//			grade = 'B';
//		else if(score >= 70)
//			grade = 'C';
//		else
//			grade = 'F';
//		
//		System.out.println("Your grade is " + grade);
//		scan.close();
//	}
//}


//package prac01_1;
//import java.util.Scanner;
//public class hjh180912 {
//	public static void main(String args[]) {
//		Scanner scan = new Scanner(System.in);
//		char grade;
//		
//		while(true) {
//			System.out.print("What is your score?");
//			int score = scan.nextInt();
//			
//			if(score == 0) break;
//			if(score >= 90)
//				grade = 'A';
//			else if(score >= 80)
//				grade = 'B';
//			else if(score >= 70)
//				grade = 'C';
//			else
//				grade = 'F';
//			System.out.println("Your grade is " + grade);
//			
//			if((score>=80)&&(score<=100))
//				System.out.println("政俳左鎧捜");
//			else
//				System.out.println("増拭亜");
//		}
//		scan.close();
//	}
//}


//package prac01_1;
//import java.util.Scanner;
//public class hjh180912 {
//	public static void main(String args[]) {
//		Scanner scan = new Scanner(System.in);
//		char grade;
//		while(true) {
//			System.out.print("What is your score?");
//			int score = scan.nextInt();
//			
//			if(score == 0)	break;
//			switch(score/10) {
//			case 10: 
//			case 9: grade='A';	break;
//			case 8: grade='B';	break;
//			case 7: grade='C';	break;
//			default: grade='F';
//			}
//			
//			System.out.println("Your grade is " + grade);
//		}
//		scan.close();
//	}
//}


//package prac01_1;
//import java.util.Scanner;
//public class hjh180912 {		// 112p. 11腰
//	public static void main(String args[]) {
//		Scanner scan = new Scanner(System.in);
//		String grade;
//		
//		System.out.print("護 杉 脊艦猿?");
//		int month = scan.nextInt();
//		
//		if((month>=3) && (month<=5))
//			System.out.println("砂脊艦陥!");
//		else if((month>=6) && (month<=8))
//			System.out.println("食硯脊艦陥!");
//		else if((month>=9) && (month<=11))
//			System.out.println("亜聖脊艦陥!");
//		else if((month==12)||(month==1)||(month==2))
//			System.out.println("移随脊艦陥!");
//		else
//			System.out.println("設公 脊径梅柔艦陥!");
//		
//		scan.close();
//	}
//}

package prac01_1;
import java.util.Scanner;
public class hjh180912 {		// 112p. 11腰
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		String season;
		
		System.out.print("護 杉 脊艦猿?");
		int month = scan.nextInt();
		
		switch(month) {
		case 12: season = "移随脊艦陥";	break;
		case 11:
		case 10:
		case 9: season = "亜聖脊艦陥"; break;
		case 8:
		case 7:
		case 6: season = "食硯脊艦陥";	break;
		case 5:
		case 4:
		case 3: season = "砂脊艦陥";	break;
		case 2:
		case 1: season = "移随脊艦陥";	break;
		default: season = "設公脊径梅柔艦陥!"; break;
		}
		
		System.out.println(season);
		
		scan.close();
	}
}