import java.util.Scanner;
public class newAula9 {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Escreva a temperatura em graus celsius");
		double celsius = sc.nextDouble();
		double Fahrenheit = (celsius * 9/5) +32;
		double kelvin = celsius + 273.15;
		
		
		System.out.println("Temperatura em celsius: " + celsius + " C° " 
			+"\nTemperatura em  Fahrenheit:" + Fahrenheit + " °F"
			+"\nTemperatura em kelvin :"+ kelvin + " °K");
		
		sc.close();
		

	}

}
