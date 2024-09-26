public class Conta {
    String numero;
    Pessoa titular;
    double saldo, limite;

    double disponivel() {
        return this.saldo + this.limite;
    }

    void extrato () {
        System.out.println("*** EXTRATO DA CONTA ***");
        System.out.println("Conta: " + this.numero);
        System.out.println("Titular: " + this.titular.cpf);
        System.out.println("Saldo disponível para saque: " + this.disponivel());
    }

    void depositar(double valor){
        this.saldo += valor;
    }

    boolean sacar(double valor){
        if (this.disponivel() >= valor){
            this.saldo -= valor;
            System.out.println("Saque na conta" + this.numero + "realizado com sucesso.\n Novo saldo: "+this.saldo);
            return true;
        }
        System.out.println("ERRO: Saque na conta "+this.numero+"nao foi realizado. Valor disponivel: "+this.disponivel());
        return false;
    }


}
