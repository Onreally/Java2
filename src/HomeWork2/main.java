package HomeWork2;

import java.util.concurrent.ExecutionException;

public class main {
    public static void main(String[] args) {
        String mass[][] = {
                {"2", "2", "2", "2"},
                {"3", "3", "Boris", "3"},
                {"2", "2", "2", "2"},
                {"2", "2", "2", "2"},
        };
        try {
            sumArr(mass);
        } catch (MySizeArrowSizeException e) {
            e.printStackTrace();
        }

        System.out.println("Код после ошибки");
    }

    public static void sumArr(String arr[][]) {
        if (arr.length != 4) {
            throw new MySizeArrowSizeException("Массив неверной длины. Неверное количество строк!");
        }
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (arr[j].length != 4) {
                    throw new MySizeArrowSizeException("Массив неверной длины! Неверное количество столбцов!");

                }

            }

        }
        int sum = 0;

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                try {
                    sum += Integer.parseInt(arr[i][j]);
                } catch (NumberFormatException e) {
                    System.out.println("В массиве не число! Строка: " + i + "; столбец: " + j);
                }

            }

        }
        System.out.println("Сумма: " + sum);

    }

}



