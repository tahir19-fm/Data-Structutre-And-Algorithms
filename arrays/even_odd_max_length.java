public class even_odd_max_length {
    public static int evenodd(int arr[], int n) {
        int res = 1;
        for (int i = 0; i < n; i++) {
            int count = 1;
            for (int j = i + 1; j < n; j++) {
                if ((arr[j] % 2 == 0 && arr[j - 1] % 2 != 0) || (arr[j] % 2 != 0 && arr[j - 1] % 2 == 0)) {
                    count++;
                } else {
                    break;
                }
            }
            res = Math.max(res, count);
        }
        return res;

    }

    public static void main(String[] args) {
        int arr[] = { 10, 12, 14, 7, 8 };
        int n = arr.length;
        evenodd(arr, n);
        int ans =evenodd(arr, n);
        System.out.println(ans);
    }
}
