import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0) {
            int n = sc.nextInt();
            int[] arr = new int[n];
            for(int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }
            int prefixmin = arr[0];
            for(int i = 0; i < n; i++) {
                prefixmin = Math.min(prefixmin, arr[i]);
                if(arr[i] == prefixmin) {
                    arr[i] = -1;
                }
            }
            int suffixmax = arr[n-1];
            for(int i = n - 1; i >= 0; i--) {
                suffixmax = Math.max(suffixmax, arr[i]);
                if(arr[i] != -1 && suffixmax == arr[i]) {
                    arr[i] = -1;
                }
            }
            StringBuilder str = new StringBuilder();
            for(int i = 0; i < n; i++) {
                if(arr[i] == -1) {
                    str.append(1);
                }
                else {
                    str.append(0);
                }
            }
            System.out.println(str.toString());
        }
    }
}
