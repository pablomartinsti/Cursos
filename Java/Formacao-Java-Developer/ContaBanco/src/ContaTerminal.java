import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args)  {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Por favor, digite o número da Conta !");
        int numero = scanner.nextInt();
        scanner.nextLine(); // Consome a quebra de linha após nextInt()

        System.out.println("Por favor, digite o número da Agência !");
        String agencia = scanner.nextLine(); // Agora captura a agência corretamente

        System.out.println("Por favor, digite o nome do Cliente !");
        String nomeCliente = scanner.nextLine(); // Captura o nome completo

        System.out.println("Por favor, digite o saldo da Conta !");
        double saldo = scanner.nextDouble(); // O usuário deve digitar com ponto (.)

        // Exibe os dados corretamente formatados
        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco.");
        System.out.println("Sua agência é " + agencia + ", conta " + numero + " e seu saldo R$ " + saldo + " já está disponível para saque.");

        scanner.close();
    }
}
