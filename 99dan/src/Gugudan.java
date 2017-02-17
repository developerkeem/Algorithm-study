import java.util.Scanner;


public class Gugudan {
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int a = sc.nextInt(); //처음 입력받는 단
		int b = sc.nextInt(); //다음에 입력받는 단
		
		if(a>=b){ //내림차로
			for(int i=a; i>=b; i--){
				for(int j=1; j<=9; j++){
					System.out.println(i+" x "+j+"= "+i*j);
				}
				System.out.println();
			}	
		}else if(a<=b){
			for(int i=a; i<=b; i++){
				for(int j=1; j<=9; j++){
					System.out.println(i+" x "+j+"= "+i*j);
				}
				System.out.println();
			}
		}
	}
}
