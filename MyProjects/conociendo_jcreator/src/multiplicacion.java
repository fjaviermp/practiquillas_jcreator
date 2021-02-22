import java.util.Scanner;

package conociendo_jcreator; 

public class multiplicacion {
	
	private int num = 0;
		
	public multiplicacion(){
		num = 0;
	}	
		
	public int pedirNum(){
		Scanner input = new Scanner (System.in);
		System.out.print("Ingresa un numero valido: ");
		this.num = input.nextInt();
		
		return this.num;
	}
	
	public void multiplicar(int numero){
		for (int i = 0; i < 10; i++){
			System.out.println(numero + " x " + i + " = " + (numero*i));
		}
	}
	
	public int getNum(){
		return this.num;
	}
	
	public void setNum(int numero){
		this.num = numero;
	}
}