package junit5.tdd;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FizzBuzzTest {

    @Test
    void should_return_1_when_count_off_given_1() {
        //given
        FizzBuzz fizzBuzz = new FizzBuzz();
        int inputNum = 1;

        //when
        String res = fizzBuzz.play(inputNum);

        //then
        assertEquals("1", res);


    }
}
