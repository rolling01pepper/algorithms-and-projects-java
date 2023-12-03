import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] arr = new int[] {0,1,234,4,54,5,1,6};

        int target = 234;
        System.out.println(Binary_Search.bs(arr, target));

        System.out.println(Arrays.toString(Bubble_Sort.bubbleSort(arr)));
    }
}