package app;

public class Main {

    static int point;

    public static void main(String[] args) {

        point = 0;

        int[] nums1 = new int[]{55, -10, 26, -22, -78, 5, 82, -15, 42, -30, 91, 0, -50, 18, 99, -3, 25, 11, 63, -8};
        int negativeSum = 0;

        for (int num : nums1) {
            if (num < 0) {
                negativeSum += num;
            }
        }

        point++;
        System.out.printf(point + ") Сума всіх від'ємних чисел в масиві: %d%n", negativeSum);

        for (int num : nums1) {
            if (num % 2 == 0) {
                negativeSum++;
            } else {
                negativeSum++;
            }
        }

        point++;
        System.out.printf(point + ") Кількість парних чисел в масиві: %d%n", negativeSum);
        System.out.printf("  Кількість непарних чисел в масиві: %d%n", negativeSum);

        int max = nums1[0];
        int min = nums1[0];
        int maxIndex = 0;
        int minIndex = 0;

        for (int i = 1; i < nums1.length; i++) {
            if (nums1[i] > max) {
                max = nums1[i];
                maxIndex = i;
            }
            if (nums1[i] < min) {
                min = nums1[i];
                minIndex = i;
            }
        }

        point++;
        System.out.printf(point + ") Найбільший елемент: %d, Індекс: %d%n", max, maxIndex);
        System.out.printf("  Найменший елемент: %d, Індекс: %d%n", min, minIndex);

        int firstNegativeIndex = -1;
        for (int i = 0; i < nums1.length; i++) {
            if (nums1[i] < 0) {
                firstNegativeIndex = i;
                break;
            }
        }

        if (firstNegativeIndex == -1) {
             point++;
            System.out.println(point + ") Від'ємних чисел у масиві немає.");
        } else {
            double sum = 0;
            int count = 0;
            for (int i = firstNegativeIndex + 1; i < nums1.length; i++) {
                sum += nums1[i];
                count++;
            }

            if (count == 0) {
                point++;
                System.out.println(point +") Немає чисел після першого від'ємного числа.");
            } else {
                double average = sum / count;
                point++;
                System.out.printf(point + ") Середнє арифметичне чисел після першого від'ємного числа: %.2f%n", average);

            }

        }

    }
    }