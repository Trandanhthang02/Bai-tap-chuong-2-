import java.util.Scanner;

public class Sotrungbinhcong 
{
	public static void main(String[] args) 
	{
		 int n;
		  try (Scanner scanner = new Scanner(System.in)) {
			do {
				  
			  
			  System.out.println("Nhap a = ");
			  n = scanner.nextInt();
			  }while (n<0);
			  int[]a = new int[n];
			  System.out.println("Nhap cac phan tu cho mang: ");
			  for(int i = 0; i<n; i++) 
			  {
				  System.out.println("Nhap phan tu thu"+i +": ");
				  a[i] = scanner.nextInt();
			  }
			  double tong = 0;
					  for(int i = 0; i<n; i++)
					  {
						tong = tong + a[i];  
					  }
			
			  
			  
System.out.println("so tong la: "+tong);
double sotb = 0;
 sotb = tong / n;
 System.out.println("so trung binh la: "+sotb);
		}
	}
      
}
