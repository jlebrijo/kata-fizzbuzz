package com.lebrijo.katas.fizzbuzz;

class Number {
	private int number;

	Number(int number){
		this.number=number;
	}
	boolean contains(int factor) {
		return toString(number).contains(toString(factor));
	}

	boolean isDivisibleBy(int factor) {
		return number % factor == 0;
	}

	String toString(int number) {
		return String.valueOf(number);
	}
	public String toString() {
		return String.valueOf(number);
	}
}
