public class Conta {
    private double saldo;
    int agencia;
    int numero;
    Cliente titular;

    public double getSaldo(){
        return this.saldo;
    }

    public void deposita(double valor){
        if (valor > 0){
            this.saldo += valor;
        }
    }

    public boolean saca(double valor){
        if(this.saldo >= valor){
            this.saldo -= valor;
            return true;
        }
        return false;
    }

    public boolean transfere(double valor, Conta destino){
        boolean saqueOk = this.saca(valor);
        if(saqueOk){
            destino.deposita(valor);
            return true;
        }
        return false;
    }
}
