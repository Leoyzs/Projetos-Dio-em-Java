package ContaBanco;
import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
	
	// CRIEI AS VARIAVEIS NO ESCOPO PRINCIPAL PARA CONSEGUIR UTILIZAR EM AMBOS OS METODOS!
	int NumeroContaBancaria;
	String NomeCliente;
	String NumeroAgencia;
	float Saldo;
	
	
		// CRIEI UM METODO PARA PEGAR OS METODOS DOS CLIENTES
		public void ScanearDadosBancarios(){
			Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
			System.out.println("Bem vindo a agencia bancaria!\nPoderia me informar o numero de sua conta?");
			NumeroContaBancaria = scanner.nextInt();	
			
			System.out.println("Digite seu nome completo?");
			NomeCliente = scanner.next();	
			
			System.out.println("Poderia me informar o numero de sua agencia?");
			NumeroAgencia = scanner.next();	
			
			System.out.println("Por gentileza me informe seu saldo");
			Saldo = scanner.nextFloat();	
	}
		
		
		// CRIEI UM METODO PARA MOSTRAR OS DADOS BANCARIOS NA TELA
		public void ApresentarDadosBancarios() {
			System.out.println("Olá " + NomeCliente + ", obrigado por criar uma conta em nosso banco, sua agencia é " + NumeroAgencia + " Conta " + NumeroContaBancaria + " e seu saldo " + Saldo + 
					" já está disponivel para saque!");
			
		}

	}