import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int numero;
        String agencia;
        String nomeDoCliente;
        double saldo;

        System.out.println("Por favor, digite o número da Agência: ");
        numero = input.nextInt();

        System.out.println("Por favor, digite o seu nome: ");
        input.nextLine();
        nomeDoCliente = input.nextLine();

        System.out.println("Por favor, digite o nome da Agência: ");
        agencia = input.next();


        System.out.println("Por favor, digite o saldo  da sua conta: ");
        saldo = input.nextDouble();

        System.out.println("Olá " + nomeDoCliente + ", obrigado por criar uma conta em nosso banco, sua agência é "
                + agencia + ", conta " + numero + " e seu saldo " + saldo + " já está disponível para saque.");


    }
}