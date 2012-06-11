package com.lebrijo.katas.fizzbuzz;

public class FizzBuzzGame {

	private static final String EMPTY_STRING = "";
	private static final int WHEN_BUZZ_FACTOR = 5;
	private static final int WHEN_FIZZ_FACTOR = 3;
	private static final String BUZZ = "Buzz";
	private static final String FIZZ = "Fizz";
	private Number number;
	private String result;

	public String play(int number) {
		this.number = new Number(number);
		this.result = EMPTY_STRING;

		say(FIZZ, WHEN_FIZZ_FACTOR);
		say(BUZZ, WHEN_BUZZ_FACTOR);
		elseSayNumber();

		return result;
	}

	private void elseSayNumber() {
		if (EMPTY_STRING.equals(result))
			result = number.toString();
	}

	private void say(String word, int factor) {
		if (number.isDivisibleBy(factor) 
				|| number.contains(factor))
			result += word;
	}

}
