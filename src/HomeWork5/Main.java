package HomeWork5;

public class Main extends Thread {


    public static void main(String[] args) {
        Thread t1 = new Thread(new MyRunnable());
        Thread t2 = new Thread(new MyRunnable());


        mainThread();
        t1.start();
        t2.start();


    }

    public static void mainThread() {
        final int size = 10000000;
        final int h = size / 2;
        float[] arr = new float[size];
        for (int i = 0; i < arr.length; i++) arr[i] = 1;
        long a = System.currentTimeMillis();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (float) (arr[i] * Math.sin(0.2f + i / 5) * Math.cos(0.2f + i / 5) * Math.cos(0.4f + i / 2));
        }
        System.out.println("Время обработки одним потоком: " + (System.currentTimeMillis() - a));
    }


}
