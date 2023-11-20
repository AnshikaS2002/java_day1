import java.util.*;

public class LeapYear {

	boolean isLeapYear(int year) {
		if(year % 400 == 0) return true;
		else if(year % 100 == 0) return false;
		else if(year % 4 == 0) return true;
		return false;
	}

	static boolean isFourDigitNum(int year) {
		int digitCnt = 0;
		int digit = year;

		while(digit > 0) {
			digit = digit/10;
			digitCnt++;
		}

		return (digitCnt == 4);
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a year");
		int year = scanner.nextInt();

		if(!isFourDigitNum(year)) {
			System.out.println("Enter a four digit number");
			return;
		}

		LeapYear lp = new LeapYear();
		if(lp.isLeapYear(year)) System.out.println("Leap Year");
		else System.out.println("Not a Leap Year");
	}
}
