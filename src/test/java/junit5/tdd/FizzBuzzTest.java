package junit5.tdd;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FizzBuzzTest {

    @Test
    void should_return_1_when_count_off_given_1() {
        //given
        FizzBuzz fizzBuzz = new FizzBuzz();

        //when
        String res = fizzBuzz.play(1);

        //then
        assertEquals("1", res);

    }

    @Test
    void should_return_fizz_when_count_off_given_3() {
        //given
        FizzBuzz fizzBuzz = new FizzBuzz();

        //when
        String res = fizzBuzz.play(3);

        //then
        assertEquals("Fizz", res);
    }

}
