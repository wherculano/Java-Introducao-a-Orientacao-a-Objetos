public class TesteReferencias {
    public static void main(String[] args) {
        Conta primeiraConta = new Conta();
        primeiraConta.saldo = 300;

        System.out.println("Saldo primeiraConta R$" + primeiraConta.saldo);

        Conta segundaConta = primeiraConta;
        System.out.println("Saldo segundaConta R$" + segundaConta.saldo);

        System.out.println();
        segundaConta.saldo += 700;

        System.out.println("Saldo primeiraConta R$" + primeiraConta.saldo);
        System.out.println("Saldo segundaConta R$" + segundaConta.saldo);

        System.out.println();
        if (primeiraConta == segundaConta) {
            System.out.println("Referenciam o mesmo objeto!");
        } else {
            System.out.println("São diferentes");
        }
    }
}
