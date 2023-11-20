import java.util.Scanner;
import java.util.Random;

public class CoinPercentage {
	float headPercentage(int flipCnt) {
		int head_cnt = 0;
		Random rand = new Random();
		int fc = flipCnt;
		while(fc-- > 0) {
			double random_num = rand.nextDouble();
			//System.out.println(random_num);
			if(random_num < 0.5) head_cnt++;
		}
		return ((float)(head_cnt * 100)/flipCnt);
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the count of flips");
		int flipCnt = scanner.nextInt();
		if(flipCnt <= 0) {
			System.out.println("Enter a positive number");
			return;
		}

		CoinPercentage coinPercentage = new CoinPercentage();
		float headPercent = coinPercentage.headPercentage(flipCnt);
		float tailPercent = 100 - headPercent;
		System.out.println("Head percent is " + headPercent);
		System.out.println("Tail percent is " + tailPercent);
	}
}
