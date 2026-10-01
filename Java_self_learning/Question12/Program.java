package Question12;

import java.util.Comparator;


public class Program {

    public static <T> void selectionSort(T[] arr, Comparator<T> c) {

        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {

                if (c.compare(arr[i], arr[j]) > 0) {

                    T temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }

    static class CompareNumber<T extends Number> implements Comparator<T> {
        @Override
        public int compare(T n1, T n2) {
            return Double.compare(
                n1.doubleValue(),
                n2.doubleValue()
            );
        }
    }

    public static void main(String[] args) {

        Integer[] arr = {10, 20, 5, 66, 1, 8, 3};

        Comparator<Integer> c = new CompareNumber<>();

        selectionSort(arr, c);

        for (Integer x : arr) {
            System.out.print(x + " ");
        }
    }
}