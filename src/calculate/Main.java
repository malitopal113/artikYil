package calculate;
import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		Scanner inp = new Scanner(System.in);
		int year;
		
		System.out.print("Yılı girin: ");
		year = inp.nextInt();
		
		if ( !(year % 400 == 0 ) ) 
		{
			if ( !(year % 100 == 0) ) 
			{
				if (year % 4 == 0) 
				{
					System.out.println(year + " bir artık yıldır!");
				}
				else
				{
					System.out.println(year + " artık bir yıl değildir!");
				}
			}
			else 
			{
				System.out.println(year + " artık bir yıl değildir!");
			}
			
		}
		else
		{
			System.out.println(year + " bir artık yıldır!");
		}

	}

}
