import java.util.Scanner;

public class Bai12 
{
    public static void main(String[] args) 
    {
    	int a, b, i, j;
    	Scanner scanner = new Scanner(System.in);
    	System.out.println("Nhap vao so dong cua ma tran: ");
    	a = scanner.nextInt();
    	System.out.println("Nhap vao so cot cua ma tran: ");
    	b = scanner.nextInt();
    	int C[][] = new int[a][b];
    	System.out.println("Nhap cac phan tu cho ma tran: ");
    	for(i =0; i<a; i++) 
    	{
    		for( j =0; j<b; j++) 
    		{
    			System.out.println("C[" +i+ "][" +j+ "]");
    			C[i][j] = scanner.nextInt();
    		}
    	}
    	
    	int max =C[0][0];
    	for ( i =0; i<a; i++) 
    	{
    		for ( j =0; j<b; j++) 
    		{
    			if ( max<C[i][j] ) 
    			{
    				max = C[i][j];
    			}
    		}
    	}System.out.println("Phan tu lon nhat cua ma tran la: "+max);
    }  
}
