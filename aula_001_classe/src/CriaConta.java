public class CriaConta {
    public static void main(String[] args) {
        Conta primeiraConta = new Conta();
        primeiraConta.saldo = 200.00;
        System.out.println(primeiraConta.saldo);

        Conta segundaConta = new Conta();
        segundaConta.saldo = 50;

        System.out.println("A primeira conta tem R$" + primeiraConta.saldo);
        System.out.println("A segunda conta tem R$" +segundaConta.saldo);
    }
}
