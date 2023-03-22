public class TestaBanco {
    public static void main(String[] args){
        Cliente wagner = new Cliente();
        wagner.nome = "Wagner Herculano";
        wagner.cpf = "999.999.999-99";
        wagner.profissao = "Programador";

        Conta contaDoWagner = new Conta();
        contaDoWagner.deposita(1000);
        contaDoWagner.titular = wagner;

        System.out.println(contaDoWagner.titular.nome);
        System.out.println(contaDoWagner.getSaldo());

    }
}
