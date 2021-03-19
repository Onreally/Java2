package HomeWork1;

public class Robot implements JumpRun {
    private final int MAX_JUMP=5;
    private final int MAX_RUN=5000;

    @Override
    public void run(int param) {
        if (param==0){
            System.out.print("");
        } else
        if (MAX_RUN>=param){
            System.out.println("Robot is running...");
        } else System.out.println("Robot has fail.");
    }

    @Override
    public void jump(int param) {
        if (param==0){
            System.out.print("");
        } else
        if (MAX_JUMP>=param){
            System.out.println("Robot is jumping...");
        } else System.out.println("The Robot jumped and fell.");

    }
}
