package aplicacao;

import java.util.Locale;
import java.util.Scanner;

import entidade.Conta;
import entidade.Conta_corrente;
import entidade.Conta_poupanca;

public class Programa {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Conta_poupanca cp = new Conta_poupanca();
		Conta_corrente cc = new Conta_corrente();
		
		Scanner sc = new Scanner (System.in);
		Conta conta;
		
		System.out.print("Entre com o numero da conta: ");
		int numero = sc.nextInt();
		
		System.out.println();
		System.out.println("Entre com o nome do titular:");
		sc.nextLine();
		String titular = sc.nextLine();
		
		System.out.println();
		System.out.println("Tem deposito inicial? (s/n)");
		char resposta = sc.next().charAt(0);
		if(resposta == 's') {
			System.out.println("Entre com o valor inicial do deposito:");
			double depositoInicial = sc.nextDouble();
			conta = new Conta(numero,titular,depositoInicial);
		}
		else {
			conta = new Conta (numero,titular);
		}
		
		System.out.println();
		System.out.println("Dados da Conta:");
		System.out.println(conta);
		
		System.out.println();
		System.out.print("Entre com o valor do deposito:");
		double valorDeposito = sc.nextDouble();
		conta.deposito(valorDeposito);
		System.out.println("Dados atualizados da conta:");
		System.out.println(conta);
		
		System.out.println();
		System.out.print("Entre com o valor do saque:");
		double valorSaque = sc.nextDouble();
		conta.rendimento(valorSaque);
		System.out.println("Dados atualizados com rendimento da conta:");
		System.out.println(conta);
		
		
		
		sc.close();
	}

}
