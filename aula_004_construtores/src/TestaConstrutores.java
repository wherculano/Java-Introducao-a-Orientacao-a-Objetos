public class TestaConstrutores {
    public static void main(String[] args) {
        Cliente wagner = new Cliente("Wagner Herculano", "999.999.999-99");

        Conta conta = new Conta(123, 321);
        conta.setTitular(wagner);

        Conta conta2 = new Conta(123, 456);
        conta2.deposita(19000);

        System.out.println("\nTotal de contas criadas até o momento: " + Conta.getTotal() + "\n");
    }
}
