
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

import javax.swing.plaf.basic.BasicInternalFrameTitlePane.SystemMenuBar;

public class Zbioryy
{
	public static void main(String args[])
	{
		
		Set<Integer> zbiorPierwszy = new HashSet<Integer>();
		Set<Integer> zbiorDrugi = new HashSet<Integer>();
		Scanner scan = new Scanner(System.in);
		System.out.println("Ile chcesz wprowadziæ elementow do zbioru A? ");
		int ileLiczbZbiorA = scan.nextInt();
		
		System.out.println("Wprowadz elementy do zbioru A: ");
		while(ileLiczbZbiorA > 0)
		{
		
			int zbiorA = scan.nextInt();
			zbiorPierwszy.add(zbiorA);
			ileLiczbZbiorA--;
		}
		System.out.println("Zbior A wyglada nastepujaco: "+zbiorPierwszy + "\n\n");
		
		System.out.println("Ile chcesz wprowadziæ elementow do zbioru B? ");
		int ileLiczbZbiorB = scan.nextInt();
		
		
		System.out.println("Wprowadz elementy do zbioru B: ");
		while(ileLiczbZbiorB > 0)
		{
			
			int zbiorB = scan.nextInt();
			zbiorDrugi.add(zbiorB);
			ileLiczbZbiorB--;
		}
		System.out.println("Zbór B wyglada nastepujaco: "+zbiorDrugi +"\n\n");
		

		System.out.println("Jak¹ operacje chcesz wykonaæ? \n"
				
				+          "1. Suma zbiorów. \n"
				+ 	   "2. Ró¿nica zbiorów. \n"
				+          "3. Czêœæ wspólna. \n"
				+          "4. Ró¿nica symetryczna. \n");
		
		
			int wybor = scan.nextInt();
			switch(wybor)
			{
				case 1:
				{
					zbiorPierwszy.addAll(zbiorDrugi);
					System.out.println("Suma zbiorów A i B wynosi: "+zbiorPierwszy +".");
					break;
				}
				case 2:
				{
					zbiorPierwszy.removeAll(zbiorDrugi);
					System.out.println("Ró¿nica zbiorów A i B wynosi: "+zbiorPierwszy +".");
					break;
				}
				
				case 3:
				{
					zbiorPierwszy.retainAll(zbiorDrugi);
					System.out.println("Czêœæ wspólna zbiorów A i B wynosi: "+zbiorPierwszy +".");
					break;
				}
				
				case 4:
				{
					
					Set<Integer> czescWspolna = new HashSet<>(zbiorPierwszy);
					czescWspolna.retainAll(zbiorDrugi);
				
					Set<Integer> roznicaSymetryczna = new HashSet<>();
					roznicaSymetryczna.addAll(zbiorPierwszy);
					roznicaSymetryczna.addAll(zbiorDrugi);
					roznicaSymetryczna.removeAll(czescWspolna);
					System.out.println("Wynik ró¿nicy symetrycznej zbiorów A i B wynosi: "+roznicaSymetryczna +".");					break;
				}
				
				default: 
					System.out.println("Miales podac liczbe od 1 do 4...");
			}
		
			}
}