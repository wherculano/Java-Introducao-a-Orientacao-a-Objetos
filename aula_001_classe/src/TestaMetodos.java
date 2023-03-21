public class TestaMetodos {
    public static void main(String[] args) {
        Conta conta = new Conta();
        conta.saldo = 190;
        System.out.println(conta.saldo);

        conta.deposita(810);
        System.out.println(conta.saldo);

        boolean saquePrimeiraTentativa = conta.saca(10);
        System.out.println(saquePrimeiraTentativa);

        System.out.println(conta.saldo);

        boolean saqueSegundaTentativa = conta.saca(1000);
        System.out.println(saqueSegundaTentativa);

        System.out.println(conta.saldo);

    }
}
