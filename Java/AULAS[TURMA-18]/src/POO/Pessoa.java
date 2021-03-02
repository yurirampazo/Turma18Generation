package POO;

public class Pessoa {
	
	private String primeiroNome;
	private String ultimoNome;
	private String nomesDoMeio;
	public int idade;
	public int cpf;
	public int numeroConta;
	public boolean vivo,morto;
	
	public Pessoa(String primeiro,String meio, String ultimo) {  // Construtor, MESMO NOME DA CLASSE + 
		primeiroNome = primeiro;
		ultimoNome = ultimo;
		nomesDoMeio = meio;
		// + LISTA DE PARAMETROS. N�O CRIA NOVO OBJETO
		//QUEM CRIA � O new.	
	}
	
	public String getNomeCompleto() {
		String nomeCompleto = primeiroNome +" "+ nomesDoMeio +" " + ultimoNome;
		return nomeCompleto;
	}
}
