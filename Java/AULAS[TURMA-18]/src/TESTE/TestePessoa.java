package TESTE;

public class TestePessoa {

	public static void main(String[] args) {
		Pessoa jessica = new Pessoa("Jessica", 555);
		Funcionario1 pedro = new Funcionario1("Pedro",556,"TI");
		Pessoa maria = new Funcionario1("Maria", 557, "Engenharia");
		Pessoa jose = new Coordenador("José", 123,"Curso: SCRUM Master" );
		
		System.out.println(jessica.getMatricula());
		
		System.out.println(pedro.getDepartamento());
		
		System.out.println(maria.getMatricula());
		
		System.out.println(jose.getNome());

	}

}
