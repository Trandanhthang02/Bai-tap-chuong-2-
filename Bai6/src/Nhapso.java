import java.util.Scanner;

public class Nhapso
{
   public static void main(String[] args) 
   {
	  int n, temp = 1;
	  long giaithua = 1;
	  try (Scanner sc = new Scanner(System.in)) {
		do 
		  {
			  System.out.println("Nhap n: ");
			  n = sc.nextInt();
			
			  
		  }while (n<=0);
	}
	  while (temp <=n) {
		  giaithua = giaithua * temp;
		  temp++;
	  }
		System.out.println("Giai thua cua "+ n +" la = "+giaithua );		  
   }	  
	   
}
