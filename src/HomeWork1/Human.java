package HomeWork1;

public class Human implements JumpRun {
    private final int MAX_JUMP=3;
    private final int MAX_RUN=1000;

    @Override
    public void run(int param) {
        if (param==0){
            System.out.print("");
        } else
        if (MAX_RUN>=param){
            System.out.println("Human is running...");
        } else System.out.println("Human has fail.");
    }

    @Override
    public void jump(int param) {
        if (param==0){
            System.out.print("");
        } else
        if (MAX_JUMP>=param){
            System.out.println("Human is jumping...");
        } else System.out.println("The Human jumped and fell.");

    }
}
