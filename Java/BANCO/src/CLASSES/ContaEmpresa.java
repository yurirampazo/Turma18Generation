package CLASSES;
import java.util.Scanner;

// lucas zamora
public class ContaEmpresa extends Conta{
		Scanner ler = new Scanner(System.in);
		double emprestimoEmpresa = 10000.00;
		int opcao = 0;
		
		public ContaEmpresa(int numero, String cpf, boolean ativa, double emprestimoEmpresa) {
			super(numero, cpf, ativa);
			this.emprestimoEmpresa = emprestimoEmpresa;
		}	
		
		public double getEmprestimoEmpresa() {
			return emprestimoEmpresa;
		}

		public void setEmprestimoEmpresa(double emprestimoEmpresa) {
			this.emprestimoEmpresa = 10000.00;
		}

		@Override
		public void debito(double valor) {
			if(this.getSaldo() >= valor) {
				this.saldo = this.getSaldo() - valor;
			}
			else if(valor > saldo) {
				System.out.println("Saldo em conta insuficiente.");	
				System.out.println("Gostaria de solicitar um empréstimo empresarial (Seu limite é de R$10000.00) ?");
				System.out.println("Caso Sim, digite [1], para Não digite [0]:");
				opcao = ler.nextInt();
				
				if(opcao == 1) {
					this.credito(getEmprestimoEmpresa());
				}
			}
		}
	}