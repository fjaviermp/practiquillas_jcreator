/**
 * AWT Sample application
 *
 * @author 
 * @version 1.00 21/02/22
 */
package dadosModular; 
 
public class dados {
    

	public static void main(String[] args) {
		
		partidaDados pDados = new partidaDados();
		
		do {
			pDados.turno();
			
			pDados.tirar_dados();
			
			pDados.comprobar_dados();
			
			pDados.sumar_premio();
			
		}while(pDados.getTirada() != 'Q');
		
		pDados.escribir_resultado();
	}
}
