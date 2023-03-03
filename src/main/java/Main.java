import java.util.Locale;
import java.util.Scanner;

public class Main {
    private enum Command {
        ADD,
        SUBTRACT,
        MULTIPLY,
        DIVIDE,
        FIBONACCI,
        BINARY;
    }



    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        Scanner scanner = new Scanner(System.in);
        while(scanner.hasNext()) {
            String commandString=scanner.next();
            try {
                Command command=Command.valueOf(commandString.toUpperCase());


            Integer val1;
            Integer val2;
            Integer result;
            switch (command) {
                case ADD:
                    val1=Integer.valueOf(scanner.next());
                    val2=Integer.valueOf(scanner.next());
                    result=calculator.add(val1, val2);
                    System.out.println(result);
                    break;
                case SUBTRACT:
                    val1=Integer.valueOf(scanner.next());
                    val2=Integer.valueOf(scanner.next());
                    result=calculator.subtract(val1, val2);
                    System.out.println(result);
                    break;
                case MULTIPLY:
                    val1=Integer.valueOf(scanner.next());
                    val2=Integer.valueOf(scanner.next());
                    result=calculator.multiply(val1, val2);
                    System.out.println(result);
                    break;
                case DIVIDE:
                    val1=Integer.valueOf(scanner.next());
                    val2=Integer.valueOf(scanner.next());
                    result=calculator.divide(val1, val2);
                    System.out.println(result);
                    break;
                case FIBONACCI:
                    val1=Integer.valueOf(scanner.next());
                    result=calculator.fibonacciNumberFinder(val1);
                    System.out.println(result);
                    break;
                case BINARY:
                    val1=Integer.valueOf(scanner.next());
                    String resultString=calculator.intToBinaryNumber(val1);
                    System.out.println(resultString);
                    break;
            }
            } catch (IllegalArgumentException ex) {
                System.out.println(ex.getMessage());
                System.out.println("Please enter a valid command");
            }
        }
    }
}
