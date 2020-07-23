package junit5.tdd;

public class FizzBuzz {

    public String play(int inputNum) {

        if(inputNum %3 == 0 && inputNum %5 == 0){
            return "FizzBuzz";
        }

        if(inputNum %3 == 0 && inputNum %7 == 0){
            return "FizzWhizz";
        }
        if(inputNum %3 == 0) {
            return "Fizz";
        }

        if (inputNum %5 == 0) {
            return "Buzz";
        }

        if(inputNum %7 ==0) {
            return "Whizz";
        }
        return String.valueOf(inputNum);
    }

}
