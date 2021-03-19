package HomeWork1;

public class Road implements Exercise{

    @Override
    public int getInfo() {
        int distance;
        distance = (int) (Math.random()*1000);
        return distance;
    }
}
