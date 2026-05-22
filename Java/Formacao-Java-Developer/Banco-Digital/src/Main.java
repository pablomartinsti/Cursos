public class Main {

    public static void main(String[] args) {

        Banco banco = new Banco("Banco Digital");

        Cliente pablo = new Cliente("Pablo");

        Conta cc = new ContaCorrente(pablo);
        Conta cp = new ContaPoupanca(pablo);

        cc.depositar(100);
        cp.depositar(50);

        banco.adicionarConta(cc);
        banco.adicionarConta(cp);
        banco.listarContas();
    }
}