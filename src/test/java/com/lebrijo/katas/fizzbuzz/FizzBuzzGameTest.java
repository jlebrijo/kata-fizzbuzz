package com.lebrijo.katas.fizzbuzz;

import static org.hamcrest.MatcherAssert.*;
import static org.hamcrest.Matchers.*;

import org.junit.Test;

public class FizzBuzzGameTest {
	FizzBuzzGame game = new FizzBuzzGame();

	@Test
	public void given_a_number_then_return_number() {
		assertThat(game.play(1), is("1"));
		assertThat(game.play(2), is("2"));
	}

	@Test
	public void given_a_number_divisible_by_three_then_return_Fizz() {
		assertThat(game.play(3), is("Fizz"));
		assertThat(game.play(6), is("Fizz"));
	}
	
	@Test
	public void given_a_number_divisible_by_five_then_return_Buzz() {
		assertThat(game.play(5), is("Buzz"));
	}
	
	@Test
	public void given_a_number_divisible_by_both_then_returns_FizzBuzz() {
		assertThat(game.play(15), is("FizzBuzz"));
	}
	
	@Test
	public void given_a_number_which_contains_factors_then_returns_the_word() {
		assertThat(game.play(13), is("Fizz"));
		assertThat(game.play(56), is("Buzz"));
		assertThat(game.play(53), is("FizzBuzz"));
	}

}
