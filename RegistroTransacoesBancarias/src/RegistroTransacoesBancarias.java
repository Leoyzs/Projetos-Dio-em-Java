import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class RegistroTransacoesBancarias {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicita e lê o saldo inicial da conta
        System.out.print("Digite o saldo inicial da conta: ");
        double saldo = scanner.nextDouble();

        // Solicita e lê a quantidade total de transações
        System.out.print("Digite a quantidade total de transações: ");
        int quantidadeTransacoes = scanner.nextInt();

        // Lista para armazenar as transações
        List<String> transacoes = new ArrayList<>();

        // Loop para iterar sobre as transações
        for (int i = 1; i <= quantidadeTransacoes; i++) {
            // Solicita e lê o tipo de transação (D para depósito ou S para saque)
            System.out.print("Digite o tipo de transação (D para depósito ou S para saque): ");
            char tipoTransacao = scanner.next().toUpperCase().charAt(0);

            // Verifica se o tipo de transação é válido e lê o valor da transação
            if (tipoTransacao == 'D' || tipoTransacao == 'S') {
                System.out.print("Digite o valor da transação: ");
                double valorTransacao = scanner.nextDouble();

                // Atualiza o saldo da conta e adiciona a transação à lista
                if (tipoTransacao == 'D') {
                    saldo += valorTransacao;
                    transacoes.add("Depósito de " + valorTransacao);
                } else { // tipoTransacao == 'S'
                    saldo -= valorTransacao;
                    transacoes.add("Saque de " + valorTransacao);
                }
            } else {
                System.out.println("Opção inválida. Utilize D para depósito ou S para saque.");
                i--; // Decrementa o índice para repetir a iteração
            }
        }

        // Exibe o saldo final da conta
        System.out.println("Saldo final da conta: " + saldo);

        // Exibe a lista de transações
        System.out.println("Transações realizadas:");
        for (int i = 0; i < transacoes.size(); i++) {
            System.out.println((i + 1) + ". " + transacoes.get(i));
        }

        // Fechar o scanner para evitar vazamentos de recursos
        scanner.close();
    }
}
