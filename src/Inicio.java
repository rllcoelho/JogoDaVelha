import java.util.Scanner;


public class Inicio {
	//TODO:Definir variáveis globais para jogador 1 e jogador 2;
	public static void iniciaJogo(JogoDaVelha jogo){
		int l = 0, c = 0, jogadorDaVez = 1;
		
		while(jogo.vencedor() == 0 && !jogo.velha()){
			jogo.exibeGrade();
			if (jogadorDaVez == 1){
				System.out.println("Vez do X:");
			}
			else if (jogadorDaVez == -1){
				System.out.println("Vez do O:");
			}
			
			Scanner teclado = new Scanner(System.in);
		    String posicao = teclado.next();
		    if(posicao.contains(",")){
		    	l = Integer.parseInt(posicao.split(",")[0]);
		    	c = Integer.parseInt(posicao.split(",")[1]);
		    }
		    jogo.joga(jogadorDaVez, l, c);
		    jogadorDaVez = jogadorDaVez * -1;
		}
		
	    //se sim, dá um split. primeira posição é linha, segunda é coluna
	    //se não, dá um split no espaço e dá um trim 
	}
	
	public static void main(String[] args) {
		JogoDaVelha jogoDaVelha = new JogoDaVelha();
		iniciaJogo(jogoDaVelha);
	}

}
