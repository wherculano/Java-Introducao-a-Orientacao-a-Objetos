public class TesteSacaValorNegativo {
    public static void main(String[] args) {
        Conta conta = new Conta();
        conta.deposita(19000);
        System.out.println(conta.getSaldo());
        // conta.saldo = 500  // devido encapsulamento, isso não é possível
    }
}
