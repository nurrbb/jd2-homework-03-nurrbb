package homework;
import java.util.Scanner;
public class KelimeCevirme {

	public static void main(String[] args) {

	        Scanner scanner = new Scanner(System.in);

	        System.out.print("Lütfen bir kelime giriniz: ");
	        String kelime = scanner.nextLine();
	        String tersKelime = new StringBuilder(kelime).reverse().toString();

	        System.out.println("Ters çevrilmiş hali: " + tersKelime);

	        if (kelime.equalsIgnoreCase(tersKelime)) 
	        {
	            System.out.println("Girdiğiniz kelime bir palindromdur.");
	        } 
	        
	        else 
	        {
	            System.out.println("Maalesef girdiğiniz kelime bir palindrom değildir.");
	        }
	 }

}
