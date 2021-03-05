package CLASSES;

public class ContaPoupanca extends Conta {

    private int diaAniversarioPoupanca;
    //CONSTRUTORES
    public ContaPoupanca(int numero, String cpf,int diaAniversarioPoupanca) {
        super(numero, cpf);
        this.diaAniversarioPoupanca = diaAniversarioPoupanca;
    
    }
    //METODOS
    public int getDiaAniversarioPoupanca() {
        return diaAniversarioPoupanca;
    }


    public void setDiaAniversarioPoupanca(int diaAniversarioPoupanca) {
        this.diaAniversarioPoupanca = diaAniversarioPoupanca;

    }
    
    public void correcao(int dia) {
        double valor = 0.00;

        if(dia==diaAniversarioPoupanca) {
            valor = (super.getSaldo()*0.005);
            super.credito(valor);
        }
    }
}	