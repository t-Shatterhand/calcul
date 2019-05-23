public class RunCalculator {
    public void run(){
        var Engine = new Engine();
        var IO = new InputOutput();
        while(true){
            IO.printOutput(Engine.getResult(IO.getInput()));
            System.out.println(Engine.getResult(IO.getInput()));
        }
    }
}
