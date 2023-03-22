public class TestaConstrutores {
    public static void main(String[] args) {
        Cliente wagner = new Cliente("Wagner Herculano", "999.999.999-99");

        Conta conta = new Conta(123, 321);
        conta.setTitular(wagner);

    }
}
