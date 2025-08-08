import java.util.Scanner;
public class lady_bug {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0) {
            int n = sc.nextInt();
            String s1 = sc.next();
            String s2 = sc.next();
            //for s1
            int one_odd = 0;
            int one_even = 0;
            for(int i = 0; i < n; i++) {
                char ch = s1.charAt(i);
                if(ch == '1') {
                    if(i % 2 == 0) {
                        one_even++;
                    }
                    else {
                        one_odd++;
                    }
                }
            }
            
            if(one_odd == 0 && one_even == 0) {
                System.out.println("YES");
                continue;
            }
            //for s2
            int zero_odd = 0;
            int zero_even = 0;
            for(int i = 0; i < n; i++) {
                char ch = s2.charAt(i);
                if(ch == '0') {
                    if(i % 2 == 0) {
                        zero_even++;
                    }
                    else {
                        zero_odd++;
                    }
                }
            }
            
            if(one_even+one_odd > zero_odd+zero_even) {
                System.out.println("NO");
            }
            else if(one_odd <= zero_even && one_even <= zero_odd) {
                System.out.println("YES");
            }
            else {
                System.out.println("NO");
            }
        }
    }
}
