public class TestaMetodos {
    public static void main(String[] args) {
        Conta conta = new Conta();
        conta.saldo = 190;
        System.out.println(conta.saldo);
        conta.deposita(810);
        System.out.println(conta.saldo);
    }
}
