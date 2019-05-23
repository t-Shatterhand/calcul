public class Engine {
    public double getResult(String[] args){
        for(var index = 0; index < args.length; index++) {
            if(args[index].equals("sqrt")) {
                if(index == 0) {
                    throw new NoValidOperandException("No operands passed!");
                } else if (index == 2) {
                    throw new TooManyOperandsException("Wrong number of operands passed!");
                } else if(index == 1){
                    SquareRoot Sqrt = new SquareRoot();
                    return Sqrt.resolveOperation(Double.parseDouble(args[index-1]), 0);
                }
            } else if(args[index].equals("Q")){
                System.exit(1);
            } else if(!checkString(args[index])){
                if (index != 2) {
                    throw new NotEnoughOperandsException("Wrong number of operands passed!");
                }
                double operand1 = Double.parseDouble(args[index - 2]);
                double operand2 = Double.parseDouble(args[index - 1]);
                switch (args[index]){
                    case ("+"):
                        Addition Add = new Addition();
                        return Add.resolveOperation(operand1, operand2);
                    case ("-"):
                        Subtraction Subtract = new Subtraction();
                        return Subtract.resolveOperation(operand1, operand2);
                    case ("/"):
                        Division Divide = new Division();
                        return Divide.resolveOperation(operand1, operand2);
                    case ("*"):
                        Multiplication Multiply = new Multiplication();
                        return Multiply.resolveOperation(operand1, operand2);
                    case ("%"):
                        FindReminder Remind = new FindReminder();
                        return Remind.resolveOperation(operand1, operand2);
                    default:
                        throw new NotValidOperationException("The operation symbol cannot be resolved! Try to use +, -, *, //, or %!");
                }
            }
        }
        throw new NoValidOperandException("No valid operands passed!");
    }
    //special mini-function to check whether the String Input is numeric
    //returns true if is, false if not a number
    private boolean checkString(String isNum){
        try {
            Double.parseDouble(isNum);
            return true;
        } catch(NumberFormatException err){
            return false;
        }
    }
}
