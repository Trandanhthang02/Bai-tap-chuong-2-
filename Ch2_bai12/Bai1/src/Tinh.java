import java.util.Scanner;

public class Tinh 
{
  public static void main(String[] args)
  {
	  int a, b;
	  try (Scanner sc = new Scanner(System.in)) {
		System.out.println("Nhap a = ");
		  a = sc.nextInt();
		  System.out.println("Nhap b = ");
		  b = sc.nextInt();
	}
	  int tong = a + b;
	  System.out.println(a+" + "+b+" = "+tong);
	  
	  int hieu = a - b;
	  System.out.println(a+" - "+b+" = "+hieu);
	  int tich = a * b;
	  System.out.println(a+" * "+b+" = "+tich);
	 
	  float thuong = (float)a / b;
	  System.out.println(a+" / "+b+" = "+thuong);
	  
	  int sodu = a % b;
	  System.out.println(a+" % "+b+" = "+sodu);
	  
  }
}
