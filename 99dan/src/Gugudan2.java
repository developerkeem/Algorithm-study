import java.util.Scanner;


public class Gugudan2 {
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int a = sc.nextInt(); //처음 입력받는 단
		int b = sc.nextInt(); //다음에 입력받는 단
		
		if(a>=b){//내림차순
			for(int i=1; i<=9; i++){
				for(int j=a; j>=b; j--){
					System.out.printf("%d x %d = %2d	",j,i,j*i);
				}
				System.out.println();
			}
		}
		else if(a<b){//오름차순
			for(int i=1; i<=9; i++){
				for(int j=a; j<=b; j++){
					System.out.printf("%d x %d = %2d	",j,i,j*i);
				}
				System.out.println();
			}
		}
	}
}
