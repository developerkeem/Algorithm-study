import java.util.Scanner;


public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n=sc.nextInt();
		int arr[]= new int[n];
		for(int i=0; i<n; i++){
			arr[i]=sc.nextInt();
		}
		int m= sc. nextInt();
		
		int d_sum = 0,m_sum=0;
		if(m>=1 && m<=100){
			for(int i=0; i<n; i++){
				if(m%arr[i]==0){
					d_sum+=arr[i];
				}
				if(arr[i]%m==0){
					m_sum+=arr[i];
				}
			}
		}
		System.out.println(d_sum);
		System.out.println(m_sum);
	
	}

}
