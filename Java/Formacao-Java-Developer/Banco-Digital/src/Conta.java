public abstract class Conta implements IConta {

    private static final int AGENCIA_PADRAO = 1;
    private static int SEQUENCIAL = 1;

    private int agencia;
    private int numero;
    private double saldo;
    private Cliente cliente;

    public Conta(Cliente cliente) {
        this.agencia = AGENCIA_PADRAO;
        this.numero = SEQUENCIAL++;
        this.cliente = cliente;
    }
     

    public int getAgencia() {
        return agencia;
    }

    public int getNumero() {
        return numero;
    }

    public double getSaldo() {
        return saldo;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void depositar(double valor) {

        if (valor > 0) {
            this.saldo += valor;
        } else {
            System.out.println("Valor inválido");
        }

    }
    public void sacar(double valor) {

        if (valor > 0 && saldo >= valor){
            this.saldo -= valor;
        }else {
            System.out.println("Saldo insuficiente para sacar");
        }

    }
    public void transferir(double valor, Conta contaDestino) {

        if(valor > 0 && valor <= saldo){
            sacar(valor);
            contaDestino.depositar(valor);
        }else {
            System.out.println("Saldo insuficiente ou valor inválido para transferir");
        }


    }

    public void imprimirExtrato() {
        System.out.println("Cliente: " + cliente.getNome());
        System.out.println("Agência: " + agencia);
        System.out.println("Número: " + numero);
        System.out.println("Saldo: " + saldo);
    }



}
