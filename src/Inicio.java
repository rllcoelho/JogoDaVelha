public class Inicio {
	//TODO:Definir constantes globais para jogador 1 e jogador 2;
	/*
	public static void rodada(JogoDaVelha jogo){
		rodada(jogo, 1);
	}
	
	public static void rodada(JogoDaVelha jogo, int jogadorDaVez){
		int l = 0, c = 0;
		
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
		    else if(posicao.contains(" ")){
		    	l = Integer.parseInt(posicao.split(" ")[0]);
		    	c = Integer.parseInt(posicao.split(" ")[1]);
		    }
		    else{
		    	System.out.print("Jogada inválida.");
		    	rodada(jogo, jogadorDaVez);
		    }
		    jogo.joga(jogadorDaVez, l, c);
		    jogadorDaVez = jogadorDaVez * -1;
		}
		if(jogo.vencedor() == +1){
			jogo.exibeGrade();
			System.out.println("O jogador 1 (x) venceu.");
		}
		else if (jogo.vencedor() == -1){
			jogo.exibeGrade();
			System.out.println("O jogador 2 (o) venceu.");
		}
		else{
			jogo.exibeGrade();
			System.out.println("O jogo empatou.");
		}
	}*/
	
	public static void main(String[] args) {
		JogoDaVelha jogoDaVelha = new JogoDaVelha();
		Partida partida = new Partida(jogoDaVelha);
		partida.iniciaPartida();
	}

}
