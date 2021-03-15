package HomeWork1;

public class Cat implements JumpRun{
    private final int MAX_JUMP=2;
    private final int MAX_RUN=50;

    @Override
    public void run(int param) {
        if (param==0){
            System.out.print("");
        } else
        if (MAX_RUN>=param){
            System.out.println("Cat is running...");
        } else System.out.println("Cat has fail.");
    }

    @Override
    public void jump(int param) {
        if (param==0){
            System.out.print("");
        } else
        if (MAX_JUMP>=param){
            System.out.println("Cat is jumping...");
        } else System.out.println("The cat jumped and fell.");

    }
}
