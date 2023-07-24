package javaprogram;
import java.util.Scanner;
public class testcase11 {
	public static void main (String args[]){
		int i,j;
		Scanner sc= new Scanner(System.in);
		System.out.print("Enter the number of rows: ");
		int rows=sc.nextInt();
		sc.close();
		for(i=1; i<=rows; i++){
		  for(j=1; j<=i; j++){
		  System.out.print((char)(i+64));
		}
		System.out.println();
		}
		}
}
