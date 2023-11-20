import java.lang.*;

public class PrintTable {
	static boolean isValid(int num) {
		return (num >= 0 && num < 31);
	}

	static void table(int num) {
		for(int i = 1; i <= 10; i++) {
			System.out.println(num + " * " + i + " = " + ((long)num * i));
		}
		System.out.println("");
	}

	public static void main(String[] args) {
		int n = Integer.parseInt(args[0]);
		System.out.println(n);
		if(isValid(n) == false) {
			System.out.println("Enter a valid range");
			return;
		}

		for(int i = 1; i <= n; i++) {
			int num = (int)Math.pow(2, i);
			table(num);
		}
	}
}
