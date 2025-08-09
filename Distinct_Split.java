import java.util.Scanner;
import java.util.Arrays;
public class Distinct_Split {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	    int t = sc.nextInt();
	    while(t-- > 0) {
	        int n = sc.nextInt();
	        String s = sc.next();
	        int[] freq = new int[26];
	        int[] prefix = new int[n+1];
	        for(int i = 0; i < n; i++) {
	            char ch = s.charAt(i);
	            if(freq[ch-'a'] == 0) {
	                prefix[i+1] = prefix[i] + 1;
	            }
	            else {
	                prefix[i+1] = prefix[i];
	            }
	            freq[ch-'a']++;
	        }
	        Arrays.fill(freq, 0);
	        int[] suffix = new int[n+1];
	        for(int i = n - 1; i >= 0; i--) {
	            char ch = s.charAt(i);
	            if(freq[ch-'a'] == 0) {
	                suffix[i] = suffix[i+1] + 1;
	            }
	            else {
	                suffix[i] = suffix[i+1];
	            }
	            freq[ch-'a']++;
	        }
	        
	        int ans = 0;
	        for(int i = 0; i <= n; i++) {
	            ans = Math.max(prefix[i]+suffix[i], ans);
	        }
	        System.out.println(ans);
	    }
		sc.close();
	}
}
