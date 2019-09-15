
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
		System.out.println("Ile chcesz wprowadzi� elementow do zbioru A? ");
		int ileLiczbZbiorA = scan.nextInt();
		
		System.out.println("Wprowadz elementy do zbioru A: ");
		while(ileLiczbZbiorA > 0)
		{
		
			int zbiorA = scan.nextInt();
			zbiorPierwszy.add(zbiorA);
			ileLiczbZbiorA--;
		}
		System.out.println("Zbior A wyglada nastepujaco: "+zbiorPierwszy + "\n\n");
		
		System.out.println("Ile chcesz wprowadzi� elementow do zbioru B? ");
		int ileLiczbZbiorB = scan.nextInt();
		
		
		System.out.println("Wprowadz elementy do zbioru B: ");
		while(ileLiczbZbiorB > 0)
		{
			
			int zbiorB = scan.nextInt();
			zbiorDrugi.add(zbiorB);
			ileLiczbZbiorB--;
		}
		System.out.println("Zb�r B wyglada nastepujaco: "+zbiorDrugi +"\n\n");
		

		System.out.println("Jak� operacje chcesz wykona�? \n"
				
				+          "1. Suma zbior�w. \n"
				+ 	   "2. R�nica zbior�w. \n"
				+          "3. Cz�� wsp�lna. \n"
				+          "4. R�nica symetryczna. \n");
		
		
			int wybor = scan.nextInt();
			switch(wybor)
			{
				case 1:
				{
					zbiorPierwszy.addAll(zbiorDrugi);
					System.out.println("Suma zbior�w A i B wynosi: "+zbiorPierwszy +".");
					break;
				}
				case 2:
				{
					zbiorPierwszy.removeAll(zbiorDrugi);
					System.out.println("R�nica zbior�w A i B wynosi: "+zbiorPierwszy +".");
					break;
				}
				
				case 3:
				{
					zbiorPierwszy.retainAll(zbiorDrugi);
					System.out.println("Cz�� wsp�lna zbior�w A i B wynosi: "+zbiorPierwszy +".");
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
					System.out.println("Wynik r�nicy symetrycznej zbior�w A i B wynosi: "+roznicaSymetryczna +".");					break;
				}
				
				default: 
					System.out.println("Miales podac liczbe od 1 do 4...");
			}
		
			}
}