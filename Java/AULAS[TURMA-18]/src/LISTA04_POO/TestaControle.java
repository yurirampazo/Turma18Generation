package LISTA04_POO;
public class TestaControle {
	public static void main(String[] args) {
		/*YURI MINA RAMPAZO - TURMA 18 - GENERATION BRASIL.
		*PROPOSTA:
		*3) Crie uma classe produto eletrônico e apresente os atributos e métodos
		* referentes esta classe, em seguida crie um objeto produto eletrônico,
		* defina as instancias deste objeto e apresente as informações deste objeto
		* no console.
		*/
		
		ControleRemoto controle = new ControleRemoto();
		
		controle.cor = "Preto";
		controle.marca = "SONY";
		controle.canalAtual = 0;
		controle.volumeAtual = 0; 
		
		
		controle.liga();
		for (int i = 0; i < 10 ; i++){
		controle.mudaCanal(i);
		System.out.println("Passando pelo canal: " + controle.canalAtual);
		}
		
		for (int j = 0; j <50; j++) {
			controle.mudaCanal(j);
			System.out.println("Aumentando o volume até... " + controle.canalAtual);
			}
		
	}
}
