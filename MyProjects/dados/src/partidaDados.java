package dadosModular; 

import java.util.Scanner;

public class partidaDados {
	int puntos_ordenador = 0,
	puntos_humano = 0,
	dado1 = 0,
	dado2 = 0,
	dado3 = 0,
	premio = 0;
	
	String turno = "HUMANO";
			
	char tirada = 0;
	
	//CONSTRUCTORCILLO
	public partidaDados() {
		puntos_ordenador = 0;
		puntos_humano = 0;
		dado1 = 0;
		dado2 = 0;
		dado3 = 0;
		premio = 0;
		turno = "HUMANO";
		tirada = 0;
	}
	
	//GETTES Y SETTES
	public int getPuntos_ordenador() {
		return puntos_ordenador;
	}

	public void setPuntos_ordenador(int puntos_ordenador) {
		this.puntos_ordenador = puntos_ordenador;
	}

	public int getPuntos_humano() {
		return puntos_humano;
	}

	public void setPuntos_humano(int puntos_humano) {
		this.puntos_humano = puntos_humano;
	}

	public int getDado1() {
		return dado1;
	}

	public void setDado1(int dado1) {
		this.dado1 = dado1;
	}

	public int getDado2() {
		return dado2;
	}

	public void setDado2(int dado2) {
		this.dado2 = dado2;
	}

	public int getDado3() {
		return dado3;
	}

	public void setDado3(int dado3) {
		this.dado3 = dado3;
	}

	public int getPremio() {
		return premio;
	}

	public void setPremio(int premio) {
		this.premio = premio;
	}

	public String getTurno() {
		return turno;
	}

	public void setTurno(String turno) {
		this.turno = turno;
	}

	public char getTirada() {
		return tirada;
	}

	public void setTirada(char tirada) {
		this.tirada = tirada;
	}

	//METODOS
	public void turno() {
		if (turno == "HUMANO") {
			System.out.println("Es tu turno. Pulsa Enter para tirar los dados o Q para terminar");
			Scanner sc = new Scanner (System.in);
			tirada = sc.next().charAt(0);
			tirada = Character.toUpperCase(tirada);
		}else {
			System.out.println("Es mi turno.");
		}
	}
	
	public void tirar_dados() {
		if(tirada != 'Q') {
			dado1 = (int) ((Math.random() * 6) + 1);
			dado2 = (int) ((Math.random() * 6) + 1);
			dado3 = (int) ((Math.random() * 6) + 1);
				System.out.println("La tirada ha sido: " + " " + dado1 + " " + dado2+ " " + dado3);
			premio = 0;						
			}
		}
	
	public void comprobar_dados() {
		if (dado1 == 6) {
			premio = 50;
		}else if(dado1 == dado2 || dado1 == dado3) {
			premio = 10;
		}else {
			premio = 20;
		}
	}
	
	public void sumar_premio() {
		if(turno == "HUMANO") {
			puntos_humano = puntos_humano + premio;
			turno = "ORDENADOR";
		}else {
			puntos_ordenador = puntos_ordenador + premio;
			turno = "HUMANO";
		}
	}
	
	public void escribir_resultado(){
		System.out.println("Tu puntuación final: " + puntos_humano);
		System.out.println("Mi puntuación final: " + puntos_ordenador);
		
		if(puntos_humano > puntos_ordenador) {
			System.out.println("¡Has ganado, enorabuena!");
		}else if(puntos_humano < puntos_ordenador){
			System.out.println("Te he ganado. Inténtalo en otra ocasión.");
		}else {
			System.out.println("Hemos empatado. Intenta ganarme otro día.");
		}
	}
}
