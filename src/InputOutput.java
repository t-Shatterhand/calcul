import java.util.Scanner;

public class InputOutput{
    private Scanner scan = new Scanner(System.in);

    public String[] getInput(){
        System.out.print("Please enter the operation in the Reverse Polish Notation (end by enter, exit by Q):\n");
        return scan.nextLine().split("\\s+");
        }
    public void printOutput(double result){
        System.out.println("Result: " + result);
    }
}
