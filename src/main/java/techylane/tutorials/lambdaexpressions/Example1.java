package techylane.tutorials.lambdaexpressions;

public class Example1 {
    public static void main(String[] args) {

        // using anonymous class
        NumberCheckerInterface numberCheckerInterface=new NumberCheckerInterface(){
            public boolean validateNumber(int number) {
                if(number > 10)
                    return true;
                return false;
            }
        };
        processNumber(numberCheckerInterface,30);

        // using lambda expressions
        NumberCheckerInterface numberCheckerInterface1=(number)->{
            if(number > 10)
                return true;
            return false;
        };
        processNumber(numberCheckerInterface1,10);
        // using lambda expressions
        processNumber((number)->{ if(number > 10) return true;return false;},10);
    }

    private static void processNumber(NumberCheckerInterface numberCheckerInterface,int number){
        numberCheckerInterface.validateNumber(number);

    }
}

// This is a functional interface
@FunctionalInterface
interface NumberCheckerInterface{
    boolean validateNumber(int number);
}