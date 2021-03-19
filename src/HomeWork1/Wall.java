package HomeWork1;

public class Wall implements Exercise {
    @Override
    public int getInfo() {
        int wallHeight = (int) (1 + Math.random() * 10);
        return wallHeight;
    }
}



