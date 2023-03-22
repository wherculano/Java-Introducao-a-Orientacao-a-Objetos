public class TestaGetSet {
    public static void main(String[] args) {
        Conta conta = new Conta();
        // conta.numero = 123;
        conta.setNumero(123);
        System.out.println(conta.getNumero());

        Cliente wagner = new Cliente();
        wagner.setNome("Wagner Herculano");
        wagner.setCpf("999.999.999-99");
        wagner.setProfissao("Programador");

        conta.setTitular(wagner);
        System.out.println(conta.getTitular().getNome());
    }
}
