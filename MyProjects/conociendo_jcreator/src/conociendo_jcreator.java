/**
 * AWT Sample application
 *
 * @author 
 * @version 1.00 21/02/22
 */
package conociendo_jcreator; 
 
public class conociendo_jcreator {
    
    public static void main(String[] args) {
		
		//HOLA MUNDO
		holaMundo saludo = new holaMundo();
		System.out.println(saludo.getHola());
		
		//TABLA DE MULTIPLICAR
		multiplicacion m1 = new multiplicacion();
		m1.setNum(m1.pedirNum());
		m1.multiplicar(m1.getNum());
		
		//LEER LOS TRES VALORES 
		trescifras c1 = new trescifras();
		c1.pedirCifras();
		c1.calcularIguales();
		c1.calcularMayor();
		c1.calcularMenor();
		
		//EXAMINAR NUMERILLO
		examNum enum1 = new examNum();
		enum1.setNum(enum1.pedirNum());
		enum1.parImpar(enum1.getNum());
		if (enum1.esPrimo(enum1.getNum())) {
			System.out.println(enum1.getNum() + " es primo");	
		}else {
			System.out.println(enum1.getNum() + " no es primo");	
		}
		
		//SUPERMERCADO
		producto p1 = new producto();
		p1.calcular();	
		
	}
}