import java.util.Scanner;
public class ContaTerminal {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Por favor digite o número da sua conta: ");
        int numero = sc.nextInt();
        sc.nextLine();
        System.out.println("Agora o número da agência sem o dígito: ");
        int agencia = sc.nextInt();
        sc.nextLine();
        System.out.println("Agora o número do dígito: ");
        int digito = sc.nextInt();
        sc.nextLine();
        System.out.println("Agora o seu nome: ");
        String nomeCliente = sc.nextLine();
        System.out.println("Por último o seu saldo disponível: ");
        float saldo= sc.nextFloat();

        String respostaFinal = "Olá %s, obrigado por criar uma conta em nosso banco, sua agência é %d-%d, conta de número %d e seu saldo de R$%.2f já está disponível para saque!".formatted(nomeCliente, agencia, digito, numero, saldo);
        System.out.println(respostaFinal);
    }
}
