import java.util.Scanner;

public class bai1 
{
	public static void main(String[] args) 
    {
    	int a, b;
    	try (Scanner scanner = new Scanner(System.in)) {
			System.out.println("Nhap a: ");
			a = scanner.nextInt();
			System.out.println("Nhap b: ");
			b = scanner.nextInt();
		}
    	int tong = a + b;
    	System.out.println(a+" + "+b+" = "+tong);
    	int hieu = a - b;
    	System.out.println(a+" - "+b+" ="+hieu);
    	int nhan = a * b;
    	System.out.println(a+" * "+b+" = "+nhan);
    	float thuong = (float)a / b;
    	System.out.println(a+" / "+b+" = "+thuong);
    	int sodu = a % b;
    	System.out.println(a+" % "+b+" = "+sodu);
    	
    }
}
