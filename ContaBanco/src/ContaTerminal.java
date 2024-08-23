import java.util.Scanner;

public class ContaTerminal {

    /**
     * Funcao principal
     * @param args utiliza scanner para receber nome, conta, agencia e saldo pelo teminal
     */
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite seu nome e sobrenome: ");
        String nomeCliente = scanner.nextLine();

        System.out.println("Digite o numero da agência com o digito: ");
        String agencia = scanner.nextLine();

        System.out.println("Digite o numero da conta: ");
        int numero = scanner.nextInt();

        System.out.println("Saldo: ");
        double saldo = scanner.nextDouble();

        System.out.println("Olá "+ nomeCliente+", obrigado por criar uma conta em nosso banco, sua agência é "+agencia+", conta "+numero+" e seu saldo "+saldo+" já está disponível para saque");
    }
}