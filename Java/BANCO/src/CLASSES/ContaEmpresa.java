package CLASSES;

import java.util.Scanner;
// lucas zamora 
public class ContaEmpresa extends Conta{
	Scanner ler = new Scanner(System.in);
	double emprestimoEmpresa;
	int opcao = 0;
	int i;
	//double saldoEmpresa = this.getSaldo();
	
	public ContaEmpresa(int numero, String cpf, boolean ativa, double emprestimoEmpresa) {
		super(numero, cpf, ativa);
		this.emprestimoEmpresa = emprestimoEmpresa;
	}	
	
	public double getEmprestimoEmpresa() {
		return this.emprestimoEmpresa;
	}

	public void setEmprestimoEmpresa(double emprestimoEmpresa) {
		this.emprestimoEmpresa = emprestimoEmpresa;
	}

	/*@Override
	public void debito(double valor) {
		if(this.saldoEmpresa >= valor) {
			this.saldoEmpresa = this.getSaldo() - valor;
		
		}
		else 
		{
			System.out.println("Saldo em conta insuficiente.");	
			System.out.println("Gostaria de solicitar um empréstimo empresarial (Seu liimte é de R$10000.00) ?");
			System.out.println("Caso Sim, digite [1], para Não digite [0]:");
			opcao = ler.nextInt();
			if(opcao == 1) {
				System.out.println("Saldo atual: "+ this.saldoEmpresa);
				
				this.saldoEmpresa = valor - this.getSaldo();
				System.out.println("Saldo atual: "+ this.getSaldo());
				
				this.pedirEmprestimo(this.getSaldo());
				
				//this.saldoEmpresa = 0.00;
				System.out.println("Saldo atual: "+ this.getSaldo());
				System.out.println("Valor emprestimo: "+ this.getEmprestimoEmpresa());
			
			}
			
		}
		
		
			
	}*/
	
	@Override
    public void debito(double valor) {
		 /*if(this.saldoEmpresa >= valor) {
             this.saldoEmpresa = this.getSaldo() - valor;
         }*/
		if (this.getSaldo() >= valor) {
			//this.saldoEmpresa = this.getSaldo() - valor;
			this.saldo = this.getSaldo() - valor;
			System.out.printf("Saque de R$ %.2f. Retire seu dinheiro abaixo! \n", valor);
			System.out.println();
			System.out.printf("Saldo Disponível: R$ %.2f \n", this.getSaldo());
			
		}else if(valor > this.getSaldo()) 
        {
            System.out.println("Saldo em conta insuficiente.");
            
            if(i == 0) {
            	System.out.println("Gostaria de solicitar um empréstimo empresarial (Seu limite é de R$10000.00) ?");
                System.out.println("Caso Sim, digite [1], para Não digite [0]:");
                opcao = ler.nextInt();
                
                i++;
                
            }else if(i != 0){
            	System.out.println("Gostaria de utilizar se empréstimo empresarial?");
                System.out.println("Caso Sim, digite [1], para Não digite [0]:");
                opcao = ler.nextInt();
                
            }
            

            if(opcao == 1) {
            	this.saldo = this.getSaldo() - valor;
            	
            	this.pedirEmprestimo(this.getSaldo());
                //this.credito(pedirEmprestimo(valor));
            	
            }
            
        }
    }
	
	public double pedirEmprestimo(double valor) {
		if(valor > this.getEmprestimoEmpresa()) {
			System.out.println("O valor que você deseja sacar ultrapassou seu limite.");
		
		}else {
			this.setEmprestimoEmpresa(this.getEmprestimoEmpresa() + valor);
			System.out.println("Valor emprestimo: "+ this.getEmprestimoEmpresa());
			System.out.println("Emprestimo realizado com sucesso!");
			
			this.saldo = 0;
			System.out.println("Saldo atual: "+ this.getSaldo());
			
		}
		
		return this.getEmprestimoEmpresa();
	}
	
}