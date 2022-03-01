import java.util.Scanner;

public class Sapxep 
{
	public static void main(String[] args) 
	{
		 int n, tam ;
		  try (Scanner scanner = new Scanner(System.in)) {
			do {
				  
			  
			  System.out.println("Nhap n = ");
			  n = scanner.nextInt();
			  }while (n<0);
			  int[]a = new int[n];
			  System.out.println("Nhap cac phan tu cho mang: ");
			  for(int i = 0; i<n; i++) 
			  {
				  System.out.println("Nhap phan tu thu"+i +": ");
				  a[i] = scanner.nextInt();
			  }
			 for(int i = 0; i<(n-1); i++) 
			 {
				for(int j = i+1; j<(n); j++) 
				{
					if (a[i] > a[j]) 
					{
						tam = a[j];
						a[j]=a[i];
						a[i]=tam;
					}
				}
				
			 }System.out.println("Ket qua sap xep theo thu tu tang dan la: ");
			 for (int i = 0; i<n; i++) 
			 {
				 System.out.println(a[i] + "\t");
			 }
		}
		   
	}

}
