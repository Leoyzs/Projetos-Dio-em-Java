import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class RegistroTransacoesComStream {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicita e lê o saldo inicial da conta
        System.out.print("Digite o saldo inicial da conta: ");
        double saldo = scanner.nextDouble();

        // Solicita e lê a quantidade total de transações
        System.out.print("Digite a quantidade total de transações: ");
        int quantidadeTransacoes = scanner.nextInt();

        List<Transacao> transacoes = new ArrayList<>();

        // Loop para ler cada transação
        for (int i = 1; i <= quantidadeTransacoes; i++) {
            System.out.println("\nTransação #" + i + ":");

            // Solicita e lê o tipo de transação (D para depósito ou S para saque)
            System.out.print("Tipo de transação (D para depósito ou S para saque): ");
            char tipoTransacao = scanner.next().toLowerCase().charAt(0);

            // Verifica se o tipo de transação é válido (d ou s)
            if (tipoTransacao == 'd' || tipoTransacao == 's') {
                // Solicita e lê o valor da transação
                System.out.print("Valor da transação: ");
                double valorTransacao = scanner.nextDouble();

                // Cria uma nova transação e adiciona à lista
                Transacao transacao = new Transacao(tipoTransacao, valorTransacao);
                transacoes.add(transacao);

                // Atualiza o saldo da conta conforme o tipo de transação
                if (tipoTransacao == 'd') {
                    saldo += valorTransacao;
                } else { // tipoTransacao == 's'
                    saldo -= valorTransacao;
                }
            } else {
                // Caso o tipo de transação seja inválido, exibe mensagem de erro
                System.out.println("Tipo de transação inválido. Utilize D para depósito ou S para saque.");
                i--; // Decrementa o contador para repetir a iteração
            }
        }

        // Exibe o saldo final da conta
        System.out.println("\nSaldo final da conta: " + saldo);

        // Exibe a lista de transações realizadas
        System.out.println("Transações realizadas:");
        transacoes.stream()
                .map(transacao -> transacao.getTipo() + " de " + transacao.getValor())
                .collect(Collectors.toList())
                .forEach(System.out::println);

        // Fecha o scanner para evitar vazamentos de recursos
        scanner.close();
    }
}

class Transacao {
    private char tipo;
    private double valor;

    public Transacao(char tipo, double valor) {
        this.tipo = tipo;
        this.valor = valor;
    }

    public char getTipo() {
        return tipo;
    }

    public double getValor() {
        return valor;
    }
}
