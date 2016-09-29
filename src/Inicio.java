import java.util.Scanner;


public class Inicio {

	public static void iniciaJogo(JogoDaVelha jogo){
		int l = 0, c = 0, jogadorDaVez = 1;
		
		while(jogo.vencedor() == 0 && !jogo.velha()){
			jogo.exibeGrade();
			System.out.println("Vez do X:");
			Scanner teclado = new Scanner(System.in);
		    String posicao = teclado.next();
		    if(posicao.contains(",")){
		    	l = Integer.parseInt(posicao.split(",")[0]);
		    	c = Integer.parseInt(posicao.split(",")[1]);
		    }
		    jogo.joga(jogadorDaVez, l, c);
		    teclado.close();
		}
		
	    //se sim, dá um split. primeira posição é linha, segunda é coluna
	    //se não, dá um split no espaço e dá um trim 
	}
	
	public static void main(String[] args) {
		JogoDaVelha jogoDaVelha = new JogoDaVelha();
		iniciaJogo(jogoDaVelha);
	}

}
