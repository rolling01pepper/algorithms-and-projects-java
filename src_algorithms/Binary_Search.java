import java.util.Arrays;

public class Binary_Search {
    public static int bs(int[] arr, int target){
        Arrays.sort(arr);
        int l = 0;
        int r = arr.length - 1;
        while (l<=r){
            int m = l + (r-l)/2;
            if (arr[m] > target){
                r = m - 1;
            } else if (arr[m] < target){
                l = m + 1;
            } else return m;
        }
        return -1;
    }
}
