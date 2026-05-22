import java.util.Scanner;

public class Iphone implements ReprodutorMusical, AparelhoTelefonico, NavegadorInternet {
    public static void main(String[] args) {

        Iphone iphone = new Iphone();
        Scanner scanner = new Scanner(System.in);

        int opcao = -1;
        while (opcao != 0) {
            System.out.println("\n--- MENU iPhone ---");
            System.out.println("1 - Tocar Música");
            System.out.println("2 - Pausar Música");
            System.out.println("3 - Selecionar Música");
            System.out.println("4 - Ligar");
            System.out.println("5 - Atender Chamada");
            System.out.println("6 - Correio de Voz");
            System.out.println("7 - Exibir Página Web");
            System.out.println("8 - Nova Aba");
            System.out.println("9 - Atualizar Página");
            System.out.println("10 - Receber Ligação");
            System.out.println("0 - Sair");

            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {
                case 1 -> iphone.tocar();
                case 2 -> iphone.pausar();
                case 3 -> {
                    System.out.print("Digite o nome da música: ");
                    String musica = scanner.nextLine();
                    iphone.selecionarMusica(musica);
                }
                case 4 -> {
                    System.out.print("Digite o número: ");
                    String numero = scanner.nextLine();
                    iphone.ligar(numero);
                }
                case 5 -> iphone.atender();
                case 6 -> iphone.iniciarCorreioVoz();
                case 7 -> {
                    System.out.print("Digite a URL: ");
                    String url = scanner.nextLine();
                    iphone.exibirPagina(url);
                }
                case 8 -> iphone.adicionarNovaAba();
                case 9 -> iphone.atualizarPagina();
                case 10 -> {
                    System.out.print("Digite o número que está ligando: ");
                    String ligacao = scanner.nextLine();
                    iphone.receberLigacao(ligacao);
                }

                case 0 -> System.out.println("📴 Saindo do iPhone...");
                default -> System.out.println("❌ Opção inválida. Tente novamente.");
            }
        }

        scanner.close();
    }

    private String musicaAtual = "";
    private String numero = "";
    private boolean chamadaRecebida = true;

    @Override
    public void tocar() {
        if (musicaAtual.isEmpty()) {
            System.out.println("⚠️ Nenhuma música selecionada. Selecione uma música primeiro!");
        } else {
            System.out.println("🎵 Tocando: " + musicaAtual);
        }
    }

    @Override
    public void pausar() {
        if (musicaAtual.isEmpty()) {
            System.out.println("⚠️ Nenhuma música em reprodução. Selecione uma música primeiro!");
        } else {
            System.out.println("⏸ Música pausada: " + musicaAtual);
        }
    }

    @Override
    public void selecionarMusica(String musica) {
        this.musicaAtual = musica;
        System.out.println("Selecionando música: " + musicaAtual);
    }

    public void receberLigacao(String numero) {
        this.numero = numero;
        this.chamadaRecebida = true;
        System.out.println("📞 Ligação recebida de " + numero + ". Deseja atender?");
    }

    @Override
    public void atender() {
        if (!chamadaRecebida || numero.isEmpty()) {
            System.out.println("⚠️ Não há nenhuma chamada para atender.");
        } else {
            System.out.println("📲 Atendendo chamada do " + numero);
            chamadaRecebida = false; // zera o estado após atender
            numero = "";
        }
    }

    @Override
    public void iniciarCorreioVoz() {

        if (chamadaRecebida && !numero.isEmpty()) {
            System.out.println("📩 Deixe seu recado para " + numero + " após o sinal...");
            chamadaRecebida = false; // zera o estado
            numero = "";
        } else {
            System.out.println("⚠️ Nenhuma chamada para enviar ao correio de voz.");
        }

    }

    @Override
    public void ligar(String numero) {

        System.out.println("Ligando para: " + numero);

    }

    @Override
    public void adicionarNovaAba() {
        System.out.println("Nova aba aberta.");

    }

    @Override
    public void atualizarPagina() {
        System.out.println("Página atualizada.");

    }

    @Override
    public void exibirPagina(String url) {
        System.out.println("Exibindo página: " + url);

    }

}
