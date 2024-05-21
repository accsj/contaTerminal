package edu.antonio.ContaTerminal;
import java.util.Scanner;

public class ContaTerminal {

    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe o número da conta: ");
        int numeroConta = obterNumeroInteiro(scanner);

        System.out.println("Informe a agência: ");
        String agencia = obterAgencia(scanner);

        System.out.println("Digite seu nome completo: ");
        String nome = obterString(scanner);

        System.out.println("Digite o seu saldo atual: ");
        double saldoAtual = obterSaldo(scanner);

        System.out.println("Olá " + nome + ", obrigado por criar uma conta em nosso banco, sua agência é " +
                agencia + ", conta " + numeroConta + " e seu saldo de " + saldoAtual + " já está disponível para saque.");
    }

    private static int obterNumeroInteiro(Scanner scanner) {
        int numero = 0;
        boolean entradaValida = false;

        while (!entradaValida) {
            try {
                numero = Integer.parseInt(scanner.nextLine());
                entradaValida = true;
            } catch (NumberFormatException e) {
                System.out.println("Por favor, insira um número válido.");
            }
        }
        return numero;
    }

    private static String obterAgencia(Scanner scanner) {
        String input = "";
        boolean entradaValida = false;

        while (!entradaValida) {
            input = scanner.nextLine();
            if (!input.isEmpty() && input.matches("[0-9\\-]+")) {
                entradaValida = true;
            } else {
                System.out.println("Por favor, insira um número de agência válido.");
            }
        }
        return input;
    }

    private static String obterString(Scanner scanner) {
        String input = "";
        boolean entradaValida = false;

        while (!entradaValida) {
            input = scanner.nextLine();
            if (!input.isEmpty() && !input.matches(".*\\d+.*")) {
                entradaValida = true;
            } else {
                System.out.println("Por favor, insira um nome.");
            }
        }
        return input;
    }

    private static double obterSaldo(Scanner scanner) {
        double saldo = 0.0;
        boolean entradaValida = false;

        while (!entradaValida) {
            try {
                saldo = Double.parseDouble(scanner.nextLine());
                entradaValida = true;
            } catch (NumberFormatException e) {
                System.out.println("Por favor, insira um número válido para o saldo.");
            }
        }
        return saldo;
    }
}