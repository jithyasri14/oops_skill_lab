//java program to check whether given number is even or odd
package oop_skill;
import java.util.Scanner;
public class evenodd {
	public static void main(String[] args)
	{
		int num; 
		Scanner sc= new Scanner(System.in);
		num=sc.nextInt();
		if(num%2==0)
		{
			System.out.println(num + " Even Number" );
		}
		else 
		{
			System.out.println(num +" Odd Number");
		}
	}
}
