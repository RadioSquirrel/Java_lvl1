/**
 * Plieva Maya. Homework_2
 */

import java.util.Arrays;

public class Homework_2 {
    public static void main(String[] args) {
        TurnArray(); //ChapterOne
        FillAnArray(); //ChapterTwo
        MultipleArray(); //ChapterThree
        TwoDimentionalArray(); //ChapterFour
        MinAndMaxElement(); //ChapterFive
        System.out.println(BalanceArray(new int[] { 1, 1, 1, 2, 1 })); //ChapterSix
        System.out.println(BalanceArray(new int[] { 2, 1, 1, 2, 1 }));
        System.out.println(BalanceArray(new int[] { 10, 10 }));
        int n = 4; //ChapterSeven
        int[] Arr = {4, 8, 15, -16, 23, 42, -142};
        PosArray(Arr, n);
    }

    static void TurnArray() {
        int[] Arr = new int[]{1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        System.out.print(Arrays.toString(Arr));

        for (int i = 0; i < Arr.length; i++) {
            if (Arr[i] == 1) {
                Arr[i] = 0;
            } else {
                Arr[i] = 1;
            }
        }
        System.out.print(Arrays.toString(Arr));
    }

    static void FillAnArray() {
        int[] Arr = new int[8];
        int J = 0;

        for (int i = 0; i < 8; i++) {
            if (i == 0) {
                Arr[i] = J;
            } else {
                Arr[i] = J += 3;
            }
        }
        System.out.print(Arrays.toString(Arr));
    }

    static void MultipleArray() {
        int[] Arr = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int i = 0; i < Arr.length; i++) {
            if (Arr[i] < 6) Arr[i] = Arr[i] * 2;
        }
        System.out.print(Arrays.toString(Arr));
    }

    static void TwoDimentionalArray() {
        int[][] TwoDim = new int[8][8];
        for (int i = 0; i < TwoDim.length; i++) {
            for (int j = 0; j < TwoDim.length; j++) {
                if (TwoDim[i] == TwoDim[j]) {
                    TwoDim[i][j] = 1;
                }
                System.out.print(TwoDim[i][j] + " ");
            }
            System.out.println();
        }
    }

    static void MinAndMaxElement() {
        int[] Arr = {12, 6, -35, 2, 167, -7, 23, 6, -12, 13, 39, 1, -47};
        int ArrMin = Arr[0];
        int ArrMax = Arr[0];
        for (int i : Arr) {
            System.out.print(i + " ");
        }

        for (int i = 0; i < Arr.length; i++) {
            ArrMin = (ArrMin < Arr[i]) ? ArrMin : Arr[i];
            ArrMax = (ArrMax > Arr[i]) ? ArrMax : Arr[i];
        }
        System.out.println("Min element = " + ArrMin + " Max element = " + ArrMax);
    }

    static boolean BalanceArray(int[] Arr) {
        int FirstSum = 0, SecondSum = 0;
        for (int i = 0; i < Arr.length + 1; i++) {
            FirstSum = 0;
            SecondSum = 0;
            for (int j = 0; j < i; j++) {
                FirstSum += Arr[j];
            }

            for (int j = i; j < Arr.length; j++) {
                SecondSum += Arr[j];
            }

            if (FirstSum == SecondSum) return true;
        }
        return false;
    }

    static void PosArray(int[] Arr, int n) {
        System.out.print("Array before = " + Arrays.toString(Arr));

        if (n > 0) {
            for (int i = 0; i < n; i++) {
                int X = Arr[Arr.length - 1];
                for (int j = Arr.length - 1; j > 0; j--) {
                    Arr[j] = Arr[j - 1];
                }
                Arr[0] = X;
            }
        } else if (n < 0) {
            for (int i = 0; i < n * (-1); i++) {
                int X = Arr[0];
                for (int j = 0; j < Arr.length - 1; j++) {
                    Arr[j] = Arr[j + 1];
                }
                Arr[Arr.length - 1] = X;
            }
        }
        System.out.print("Array after = " + Arrays.toString(Arr));
    }
}