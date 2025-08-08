import java.util.Scanner;
public class Maxim {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        String s = sc.next();
        int ans = Integer.MAX_VALUE;;
        for(int i = 0; i < s.length() - 3; i++) {
            int val = 0;
            int ch1 = s.charAt(i) - 'A';
            int ch2 = s.charAt(i+1) - 'A';
            int ch3 = s.charAt(i+2) - 'A';
            int ch4 = s.charAt(i+3) - 'A';
            val += (Math.min(Math.abs(ch1 - 0), 26 - Math.abs(ch1 - 0)));
            val += (Math.min(Math.abs(ch2 - 2), 26 - Math.abs(ch2  - 2)));
            val += (Math.min(Math.abs(ch3 - 19), 26 - Math.abs(ch3  - 19)));
            val += (Math.min(Math.abs(ch4 - 6), 26 - Math.abs(ch4  - 6)));
            
            ans  = Math.min(ans, val);
        }
        System.out.println(ans);
    }
}
