import java.util.Scanner;
package conociendo_jcreator; 

public class trescifras {
	
	int cifra1 = 0,
	cifra2 = 0,
	cifra3 = 0;
	
	public trescifras(){
		cifra1 = 0;
		cifra2 = 0;
		cifra3 = 0;
	}
	
	public void setCifra1(int numero){
		this.cifra1 = numero;
	}
	
	public void setCifra2(int numero){
		this.cifra2 = numero;
	}
	
	public void setCifra3(int numero){
		this.cifra3 = numero;
	}
	
	public int getCifra1(){
		return this.cifra1;
	}
	
	public int getCifra2(){
		return this.cifra2;
	}
	
	public int getCifra3(){
		return this.cifra3;
	}
	
	
	public void pedirCifras(){
		
		System.out.print("Introduce el primer numero:");
		Scanner sc1 = new Scanner (System.in);
		this.cifra1 = sc1.nextInt();
		
		System.out.print("Introduce el segundo numero:");
		this.cifra2 = sc1.nextInt();
		
		System.out.print("Introduce el tercer numero:");
		this.cifra3 = sc1.nextInt();
		
	}
	
	public void calcularIguales() {
		if(cifra1 == cifra2 && cifra2 == cifra3)
			System.out.println("Todos los numeros introducidos son iguales");
	}
	
	public void calcularMayor() {
		if(cifra1 > cifra2 && cifra1 > cifra3) {
			System.out.println("El numero mas grande es: " + cifra1);
		}else if(cifra2 > cifra1 && cifra2 > cifra3) {
			System.out.println("El numero mas grande es: " + cifra2);
		}else if(cifra3 > cifra1 && cifra3 > cifra2) {
			System.out.println("El numero mas grande es: " + cifra3);
		}
	}
	
	public void calcularMenor() {
		if(cifra1 < cifra2 && cifra1 < cifra3) {
			System.out.println("El numero mas pequenio es: " + cifra1);
		}else if(cifra2 < cifra1 && cifra2 < cifra3) {
			System.out.println("El numero mas pequenio es: " + cifra2);
		}else if(cifra3 < cifra1 && cifra3 < cifra2) {
			System.out.println("El numero mas pequenio es: " + cifra3);
		}
	}
}
