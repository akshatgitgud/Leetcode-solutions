package sorting;
import java.util.Arrays;

public class ranktransformofanarray {
    public static void main(String[] args) {
        int[] arr = {37,12,28,9,100,56,80,5,12};
        System.out.println(Arrays.toString(arrayRankTransform(arr)));
        System.out.println('Yo');
    }

    public static int[] arrayRankTransform(int[] arr) {
        int n = arr.length;
        int[] sort = new int[n];
        for (int i = 0; i < n; i++) {
            sort[i] = arr[i];
        }
        Arrays.sort(sort);
        System.out.println(Arrays.toString(sort));
        int[] ans = new int[n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (arr[i] == sort[j]) {
                    ans[i] = j + 1;
                    break;
                }
            }
        }
        return ans;
    }
}