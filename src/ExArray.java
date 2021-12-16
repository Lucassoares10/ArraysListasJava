import java.util.Scanner;

public class ExArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);


		int n = sc.nextInt();
		double [] vect = new double [n];

		// for para inserir dados no vetor

		for (int i=0; i < n; i++) {
			vect[i]= sc.nextDouble();
		}

		double sum = 0.0;

		for(int i=0; i < n; i++) {
			sum += vect[i];
		}
		double avg = sum / n;

		System.out.println("AVERAGE heigth: " + avg);


		sc.close();
	}

}
