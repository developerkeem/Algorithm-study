import java.util.Collection;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Scanner;


public class divisor {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt(); // n의 약수를 구해라
		
		for(int i=1; i<=n; i++){
			if(n%i==0){
				System.out.print(i+" ");
			}
		}
	}

}
