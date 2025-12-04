//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println("Задача № 1");
        //Входной массив — выплаты авторам контента.
        //Рассчитайте сумму, максимальную, минимальную и среднюю выплату за месяц.
        //Запишите результаты в outputArray в таком порядке: [сумма, максимум, минимум, среднее]».
        int[] inputArray1 = {7000, 15000, 5600, 12400, 1500};
        int[] outputArray1 = new int[4];
        int sum = 0;
        int max = 0;
        int min = 1500;
        float average = 0f;
        for (int i : inputArray1) {
            sum += i;
            if (max < i) {
                max = i;
            }
            //System.out.println(sum);
            //System.out.println(max);
        }
        System.out.println("----------------");
        for (int i : inputArray1) {
            if (min >= i) {
                min = i;
            }
        }
        //for (float i : inputArray1) {
        //    average += i;
        //}
        //average = average / inputArray1.length;
        //System.out.println(average);
        outputArray1[0] = sum;
        outputArray1[1] = max;
        outputArray1[2] = max - min;
        //outputArray1[3] = (int) average;
        outputArray1[3] = sum / inputArray1.length;
        System.out.println("Входной массив: " + Arrays.toString(inputArray1));
        System.out.println("Выходной массив: " + Arrays.toString(outputArray1));
        System.out.println("------------------------");
        System.out.println("Задача № 2");
        int[] inputArray2 = {50_000, 80_000, 65_000, 175_000, 320_000};
        float[] outputArray2 = new float[inputArray2.length];
        //for (int i = 0; i < inputArray2.length; i++) {
        //outputArray2[i] = inputArray2[i] / 100 * 13;
        //}
        int count = 0;
        for (int i : inputArray2) {
            outputArray2[count] = i / 100 * 13;
            //System.out.println("На сотрудника № " + (count + 1) + ". налог составил: " + outputArray2[count] + "р.");
            count++;
        }
        System.out.println("Входной массив: " + Arrays.toString(inputArray2));
        System.out.println("Выходной массив: " + Arrays.toString(outputArray2));
        System.out.println("------------------------");
        System.out.println("Задача № 3");
        int[] inputArray3 = {500, 800, 6_000, 1_000, 32_000};
        boolean[] outputArray3 = new boolean[inputArray3.length];
        int bonus = 5000;
        //for (int i = 0; i < inputArray3.length; i++) {
        //if (inputArray3[i] > bonus) {
        //outputArray3[i] = true;
        //} else {
        //    outputArray3[i] = false;
        //}
        //}
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
        //for (int i = 0; i < inputArray3.length; i++) {
        //System.out.println("Бонус сотрудника " + (i + 1) + " - составил: " + inputArray3[i] + "р.");
        //System.out.println(outputArray3[i]);
        //}
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
