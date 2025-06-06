import java.util.Scanner;
public class projetoZYX {

	public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

		System.out.println("Escreva sua primeira nota");
		double primeiraNota = sc.nextDouble();
		
		System.out.println("Escreva sua segunda nota");
		double segundaNota = sc.nextDouble();
		
        System.out.println("Escreva sua terceira nota");		
		double terceiraNota = sc.nextDouble(); 
       
        System.out.println("Escreva sua quarta nota");
        double quartaNota = sc.nextDouble();
        
        System.out.println("Escreva sua quinta nota");
        double quintaNota = sc.nextDouble();
        
        System.out.println("Escreva sua sexta nota");
        double sextaNota = sc.nextDouble();
        
        System.out.println("Escreva sua setima nota");
        double setimaNota = sc.nextDouble();
        
        System.out.println("Escreva sua oitava nota");
        double oitavaNota = sc.nextDouble();
        
        double primeiroBimestre = (primeiraNota + segundaNota)/2;
        
        double segundoBimestre = (terceiraNota + quartaNota)/2;
        
        double terceiroBimestre = (quintaNota + sextaNota)/2;
        
        double quartoBimestre = (setimaNota + oitavaNota)/2;
        
        double primeiroSemestre = (primeiroBimestre + segundoBimestre)/2;
        
        double segundoSemestre = (terceiroBimestre + quartoBimestre)/2;
        
        double mediaFinal = (primeiroSemestre + segundoSemestre)/2;
        
        System.out.println("1°Bimestre: " + primeiroBimestre
        		+ "\n2° Bimestre: " + segundoBimestre
        		+ "\n1° Semestre: " + primeiroSemestre
        		+ "\n-----------------------"
        		+ "\n3° Bimestre: " + terceiroBimestre
        		+ "\n4° Bimestre: " + quartoBimestre
        		+ "\n2° Semestre: " + segundoSemestre
        		+ "\n-----------------------"
        		+ "\nMédia Final: " + mediaFinal);
	}

}