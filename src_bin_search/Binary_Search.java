// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Binary_Search {
    public static void main(String[] args) {
        int[] arr = new int[] {0,1,234,4,5,6};
        int target = 234;
        System.out.println(bs(arr, target));
    }
    public static int bs(int[] arr, int target){
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