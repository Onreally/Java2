package HomeWork5;

public class MyRunnable implements Runnable {
    @Override
    public void run() {
        final int size = 10000000;
        final int h = size / 2;
        float[] arr = new float[size];
        float[] a1 = new float[h];
        float[] a2 = new float[h];
        for (int i = 0; i < arr.length; i++) arr[i] = 1;
        System.arraycopy(arr, 0, a1, 0, h);
        System.arraycopy(arr, h, a2, 0, h);
        long a = System.currentTimeMillis();
        Thread t1 = new Thread(() -> {
            for (int i = 0; i < a1.length; i++) {
                a1[i] = arr[i] = (float) (arr[i] * Math.sin(0.2f + i / 5) * Math.cos(0.2f + i / 5) * Math.cos(0.4f + i / 2));
            }
        });

        Thread t2 = new Thread(()->{
            for (int i = 0; i < a2.length; i++) {
                a2[i] = arr[i] = (float) (arr[i] * Math.sin(0.2f + i / 5) * Math.cos(0.2f + i / 5) * Math.cos(0.4f + i / 2));
            }

        });


        System.arraycopy(a1, 0, arr, 0, h);
        System.arraycopy(a2, 0, arr, h, h);
        System.out.println("Время с двумя потоками: " + (System.currentTimeMillis() - a));

    }
}
