import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Scanner read = new Scanner(System.in);

        String nome;
        int numero;
        String agencia;
        double saldo;

        System.out.print("Informe seu nome: ");
        nome = read.nextLine();
        System.out.print("Informe o numero da conta: ");
        numero = read.nextInt();
        System.out.print("Informe sua agencia: ");
        agencia = read.next();
        System.out.print("Informe o valor do deposito: ");
        saldo = read.nextDouble();

        System.out.println("Olá, " + nome + ", titular conta corrente numero: " + numero + " , agencia numero: " + agencia + ", seu saldo e de R$ " + saldo + ".");

    }
}