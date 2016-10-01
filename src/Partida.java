import java.util.Scanner;

public class Partida {
	private int linha;
	private int coluna;
	private JogoDaVelha jogoDaVelha;
	
	public int getLinha() {
		return linha;
	}
	public boolean setLinha(int linha) {
		if(linha >= 0 && linha <=2){
			this.linha = linha;
			return true;
		}
		else{
			return false;
		}
	}
	
	public int getColuna() {
		return coluna;
	}
	public boolean setColuna(int coluna) {
		if(coluna >= 0 && coluna <=2){
			this.coluna = coluna;
			return true;
		}
		else{
			return false;
		}
	}
	
	public Partida(JogoDaVelha jogo){
		jogoDaVelha = jogo;
		setLinha(0);
		setColuna(0);
	}
	
	public void iniciaPartida(){
		rodada(jogoDaVelha, 1);
	}
	
	public void rodada(JogoDaVelha jogo, int jogadorDaVez){
		int l, c;
		System.out.print("\u001b[2J");
		System.out.flush();
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
		    	if(!setLinha(l) || !setColuna(c)){
		    		System.out.println("Lamento, mas nossas linhas e colunas só vão de 0 a 2.");
		    		rodada(jogo, jogadorDaVez);
		    	}
		    }
		    else{
		    	System.out.println("Opa, não dá pra jogar assim :(");
		    	System.out.println("Tente informar o número da linha e o da coluna, separados por vírgula.");
		    	rodada(jogo, jogadorDaVez);
		    }
		    if(!jogo.gravaJogada(jogadorDaVez, getLinha(), getColuna())){
		    	System.out.println("Opa, parece que esta posição já está ocupada.");
		    	rodada(jogo, jogadorDaVez);
		    }
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
	}
}
