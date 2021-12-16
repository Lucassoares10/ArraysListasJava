import java.util.Scanner;
import entities.DeveerArray;

public class DeverArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
          
		Scanner sc = new Scanner(System.in);
		
		
		DeveerArray[] vect= new DeveerArray[10];
		
		System.out.println("Quantos alunos alugaram os quartos ?");
		int n= sc.nextInt();
		
		for(int i= 1; i<=vect.length; i++) {
			sc.nextLine();			
			
			String name = sc.nextLine();
		   String email= sc.nextLine();
		   int rom = sc.nextInt();
		 vect[i]= new DeveerArray(name,email);
		}
		
	   sc.nextLine();
	   System.out.println("VERIFICAR OS ARRAYS VAZIOS E IMPRIMIR AQUELES QUE ESTAO COM ALGUM DADOS INSERIDO");
	   for(int i=0;i <10; i++) {
		   if(vect[i] != null) {
			   System.out.println(i + ":"+ vect[i]); 
		   }
	   }
		
		
		
		
		
		
		sc.close();
	}

}
