package diamond;

// @autorLesha

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
    int mybase = enterNumberOfDiamondBase();
	Diamond diamond = new Diamond(mybase);
	System.out.println(diamond.getDiamond());
    }

    public static int enterNumberOfDiamondBase () {
    	int numberOfBase = 0;
		System.out.println("Enter base of diamond > 0 and odd!!");
    	Scanner scanner = new Scanner(System.in);
		String numberOfBaseString = scanner.nextLine();
		try {
			numberOfBase = Integer.valueOf(numberOfBaseString);
		}
		catch (Exception e) {
			System.out.println("Number of diamondbase is not number...");
		}
		if (numberOfBase <= 0 || numberOfBase % 2 == 0) {
			System.out.println("Base of diamond must to be odd and greater the 0");
			return 0;
		}
		return numberOfBase;
	}
}

class Diamond {

	int base;

	Diamond (int base) {
		this.base = base;
		if(base % 2 == 0) {
			base++;
			System.out.println("The base of diamond must to be odd number");
		}
	}

	public String getDiamond () {
		int height = base/2 + 1;
		StringBuilder stringBuilder = new StringBuilder();
		for (int i = 0; i < height; i++) {
			for (int j = 1; j < height - i; j++) {
				stringBuilder.append(" ");
			}
			for (int k = 1; k <= 2 * i + 1; k++) {
				stringBuilder.append("*");
			}
			stringBuilder.append(System.lineSeparator());
		}
		for (int i = height - 2; i >= 0; i--) {
			for (int j = 1; j < height - i; j++) {
				stringBuilder.append(" ");
			}
			for (int k = 1; k <= 2 * i + 1; k++) {
				stringBuilder.append("*");
			}
			stringBuilder.append(System.lineSeparator());
		}
		return stringBuilder.toString();
	}
}