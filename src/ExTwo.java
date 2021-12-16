import java.util.Scanner;

import entities.ExxTwo;

public class ExTwo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
	  ExxTwo[] vect = new ExxTwo[n];
	   
	  for (int i =0; i <vect.length; i++) {
		  sc.nextLine();
		  String name = sc.nextLine();
		  Double price = sc.nextDouble();
		  vect[i]= new ExxTwo(name,price); 
		  
	  }
	 
	  double sum =0.0;
	  for (int i=0; i < vect.length; i++) {
		  sum += vect[i].getPrice();
	  }
		
	  double avg = sum / vect.length;
	  
		System.out.printf("Averege price = %.2f%n", avg);     // prestar atençao em erros com . (quando estiver %f sera colocado virgular em vez de + )
		
		sc.close();
	}

}
