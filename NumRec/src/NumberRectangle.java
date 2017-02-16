import java.util.Scanner;


public class NumberRectangle {
	public static void main(String[] args){
		Scanner sc= new Scanner(System.in);
		
		int n=sc.nextInt(); //height
		int m=sc.nextInt(); //weight
		
		for(int cols=1; cols<=n; cols++){
			if(cols%2==0){ //너비가 짝수일때, 내림차순
				for(int rows=cols*m; rows>=(cols-1)*m+1; rows--){
					System.out.print(rows + " ");
				}
			}
			else if(cols%2==1){//너비가 홀수일 때, 오름차순
				for(int rows=(cols-1)*m+1; rows<=cols*m; rows++){
					System.out.print(rows + " ");
				}
			}
			System.out.println("");
		}
	}

}
