import java.util.*;
public class substring_removal_game {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0) {
        	String s = sc.next();
        	ArrayList<Integer> ll = new ArrayList<>();
        	int one = 0;
        	for(int i = 0; i < s.length(); i++) {
        		if(s.charAt(i) == '0') {
        			if(one > 0) {
        				ll.add(one);
        				one = 0;
        			}
        		}
        		else {
        			one++;
        		}
        	}
        	if(one > 0) {
        		ll.add(one);
        	}
        	Collections.sort(ll);;
        	int ans = 0;
        	for(int i = ll.size() - 1; i >= 0; i -= 2) {
        		ans += ll.get(i);
        	}
        	System.out.println(ans);
        }
    }
}
