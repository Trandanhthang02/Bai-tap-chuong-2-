import java.util.Scanner;

public class Bai10 
{
	public static void main(String[] args)
	{
		String chuoi;
		char kytu ='r' ; 
		int count =0;
		try (Scanner scanner = new Scanner(System.in)) {
			System.out.println("Nhap chuoi bat ky: ");
			chuoi = scanner.nextLine();
	
			
		}
		for (int i=0; i<chuoi.length(); i++) 
		{
			if (chuoi.charAt(i) == kytu) 
			{
				count++;
			}
		}System.out.println("So lan xuat hien cua ky tu " + kytu + " la " + count);
	}
}
