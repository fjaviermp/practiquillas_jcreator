import java.util.Scanner;

package conociendo_jcreator; 

public class examNum {
		
	int num;
	public examNum() {
		num = 0;
	}
	
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	
	public int pedirNum(){
		Scanner input = new Scanner (System.in);
		System.out.print("Ingresa un numero valido para examinar: ");
		this.num = input.nextInt();
		
		return this.num;
	}
	
	public void parImpar(int numero) {
		if(numero % 2 == 0 || numero == 0) {
			System.out.println("El numero " + numero + " es par");
		}else if(numero %2 != 0) {
			System.out.println("El numero " + numero + " es impar");
		}
	}
	
	public boolean esPrimo(int numero) {
		boolean primo = true;
		if ((num % 2 == 0 && num > 2) || num == 1)	    //revisa si n es multiplo de 2, pero mayor que 2 (par, pero no 2) o es el 1 (caso particular)
			primo = false;
	     else
           for(int i = 3; i * i <= num; i += 2)        	//si no, solo revisa los impares, mientras el cuadrado de i sea menos o igual a n
	          if (num % i == 0){
				  primo = false;
                  i = num;                              // para que no siga comprobando, con un while se vería más claro
              }
	     return primo;
	}
}
