//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println("Задача № 1");
        //[сумма, максимум, минимум, среднее]».
        int[] inputArray1 = {7000, 15000, 5600, 12400, 1500};
        int[] outputArray1 = new int[4];
        int sum = 0;
        int max = inputArray1[0];
        int min = inputArray1[0];
        for (int i : inputArray1) {
            sum += i;
            if (max < i) {
                max = i;
            }
            if (min >= i) {
                min = i;
            }
        }
        outputArray1[0] = sum;
        outputArray1[1] = max;
        outputArray1[2] = min;
        outputArray1[3] = sum / inputArray1.length;
        System.out.println("Входной массив: " + Arrays.toString(inputArray1));
        System.out.println("Выходной массив: " + Arrays.toString(outputArray1));
        System.out.println("------------------------");
        System.out.println("Задача № 2");
        int[] inputArray2 = {50_000, 80_000, 65_000, 175_000, 320_000};
        float[] outputArray2 = new float[inputArray2.length];
        int count = 0;
        for (int i : inputArray2) {
            outputArray2[count] = i / 100 * 13;
            count++;
        }
        System.out.println("Входной массив: " + Arrays.toString(inputArray2));
        System.out.println("Выходной массив: " + Arrays.toString(outputArray2));
        System.out.println("------------------------");
        System.out.println("Задача № 3");
        int[] inputArray3 = {500, 800, 6_000, 1_000, 32_000};
        boolean[] outputArray3 = new boolean[inputArray3.length];
        int bonus = 5000;
        count = 0;
        for (int i : inputArray3) {
            if (i > bonus) {
                outputArray3[count] = true;
                count++;
            } else {
                outputArray3[count] = false;
                count++;
            }
        }
        System.out.println("Входной массив: " + Arrays.toString(inputArray3));
        System.out.println("Выходной массив: " + Arrays.toString(outputArray3));
        System.out.println("------------------------");
        System.out.println("Задача № 4");
        int[] inputArray4 = {500, 800, 6_000, -1_000, 32_000};
        boolean[] outputArray4 = new boolean[1];
        for (int i : inputArray4) {
            if (i <= 0) {
                outputArray4[0] = false;
                break;
            } else {
                outputArray4[0] = true;
            }
        }
        System.out.println("Входной массив: " + Arrays.toString(inputArray4));
        System.out.println("Выходной массив: " + Arrays.toString(outputArray4));
        System.out.println("------------------------");
        System.out.println("Задача № 5");
        int[] inputArray5 = {150_000, 670_000, 3_000_000, -150_000, 50_000};
        int[] outputArray5 = new int[1];

        int profitMonth = 0;
        for (int i : inputArray5) {
            if (i > 0) {
                profitMonth++;
            }
        }
        outputArray5[0] = profitMonth;
        System.out.println("Входной массив: " + Arrays.toString(inputArray5));
        System.out.println("Выходной массив: " + Arrays.toString(outputArray5));
    }
}
