
public class Inicio {

	public void turno(JogoDaVelha jogo){
		jogo.exibeGrade();
		//TODO
	}

	public static void main(String[] args) {
		JogoDaVelha jogoDaVelha = new JogoDaVelha();
		jogoDaVelha.exibeGrade();

        do{
            turno(jogoDaVelha);
            jogoDaVelha.vencedor();
        } until(jogoDaVelha.vencedor() != 0);
	}

}
