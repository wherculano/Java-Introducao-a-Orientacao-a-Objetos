public class Conta {
    private double saldo;
    private int agencia;
    private int numero;
    private Cliente titular;

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

    public int getAgencia() {
        return this.agencia;
    }

    public void setAgencia(int agencia) {
        if (agencia > 0){
            this.agencia = agencia;
        }
    }

    public int getNumero() {
        return this.numero;
    }

    public void setNumero(int numero) {
        if (numero > 0){
            this.numero = numero;
        }
    }

    public Cliente getTitular() {
        return this.titular;
    }

    public void setTitular(Cliente titular) {
        this.titular = titular;
    }
}
