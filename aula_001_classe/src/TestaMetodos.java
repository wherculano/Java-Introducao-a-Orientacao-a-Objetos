public class TestaMetodos {
    public static void main(String[] args) {
        Conta conta = new Conta();
        conta.saldo = 190;
        System.out.println("Saldo da Conta: R$" + conta.saldo);

        conta.deposita(810);
        System.out.println("Saldo da Conta: R$" + conta.saldo);

        boolean saquePrimeiraTentativa = conta.saca(10);
        System.out.println("Saque efetuado: " + saquePrimeiraTentativa);

        System.out.println("Saldo da Conta: R$" + conta.saldo);

        boolean saqueSegundaTentativa = conta.saca(1000);
        System.out.println("Saque efetuado: " + saqueSegundaTentativa);

        System.out.println("Saldo da Conta: R$" + conta.saldo);

        Conta novaConta = new Conta();
        novaConta.deposita(1000);
        System.out.println("Saldo da novaConta: R$" + novaConta.saldo);

        if (novaConta.transfere(300, conta)) {
            System.out.println("Transferência efetuada com sucesso!");
        } else {
            System.out.println("Saldo insuficiente!");
        }

        System.out.println("Saldo da novaConta: R$" + novaConta.saldo);

        System.out.println("Saldo da Conta: R$" + conta.saldo);

    }
}
