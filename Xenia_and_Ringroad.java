import java.util.Scanner;
public class Xenia_and_Ringroad {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	    int n = sc.nextInt();
	    int m = sc.nextInt();
	    long totalTime = 0;
	    int currentPosition = 1;
	    for(int i = 0; i < m; i++) {
	        int a = sc.nextInt();
	        if(a > currentPosition) {
	            totalTime += (a - currentPosition);
	            currentPosition = a;
	        }
	        else if(a < currentPosition) {
	            totalTime += (n - currentPosition + 1);
	            currentPosition = 1;
	            totalTime += (a - currentPosition);
	            currentPosition = a;
	        }
	    }
	    System.out.println(totalTime);
		sc.close();
	}
}
