import java.util.*;
public class Gorilla_and_he_Exam {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0) {
            int n = sc.nextInt();
            int k = sc.nextInt();
            int[] arr = new int[n];
            for(int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }
            Arrays.sort(arr);
            int count = 1;
            for(int i = 1; i < n; i++) {
                if(arr[i] != arr[i - 1]) {
                    count++;
                }
            }
            if(count == k && n == k) {
                System.out.println(1);
                continue;
            }
            int[][] arr1 = new int[count][2];
            int prev = arr[0];
            int val = 1;
            int idx = 0;
            for(int i = 1; i < n; i++) {
                if(arr[i] != prev) {
                    int[] a = new int[2];
                    a[0] = prev;
                    a[1] = val;
                    arr1[idx++] = a;
                    val = 1;
                    prev = arr[i];
                    continue;
                }
                val++;
            }
            int[] a = new int[2];
            a[0] = prev;
            a[1] = val;
            arr1[idx++] = a;
            Arrays.sort(arr1, Comparator.comparingInt(b -> b[1]));
            for(int i = 0; i < count; i++) {
                if(k > 0) {
                    if(k >= arr1[i][1]) {
                        k = k - arr1[i][1];
                        arr1[i][1] = 0;
                    }
                    else {
                        arr1[i][1] -= k;
                        k = 0;
                    }
                    continue;
                }
                break;
            }
            int ans = 0;
            int zero = 0;
            for(int i = 0; i < count; i++) {
                if(arr1[i][1] > 0) {
                    ans++;
                }else {
                    zero++;
                }
            }
            if(zero == count) {
                System.out.println(1);
                continue;
            } 
            System.out.println(ans);
        }
    }
}
