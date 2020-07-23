package junit5.tdd;

public class FizzBuzz {

    public String play(int inputNum) {
        if(inputNum %3 == 0) {
            return "Fizz";
        }
        return String.valueOf(inputNum);
    }

}
