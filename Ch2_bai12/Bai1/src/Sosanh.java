import java.util.Scanner;

public class Sosanh
{
  public static void main(String[] args) 
  {
	  int a, b;
	  try (Scanner scanner = new Scanner(System.in)) {
		System.out.println("Nhap a = ");
		  a = scanner.nextInt();
		  System.out.println("Nhap b = ");
		  b = scanner.nextInt();
	}
	  if (a != b)
	  {
		 if (a>b) 
		 {
			 System.out.println("a lon hon b");
		 }
		 else
			 System.out.println("a nho hon b");
	  }
	  else
		  System.out.println("hai so bang nhau");
  }
 

}
