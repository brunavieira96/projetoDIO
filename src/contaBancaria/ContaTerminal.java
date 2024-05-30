package contaBancaria;

import java.util.Scanner;

public class ContaTerminal {
	
	public static void main(String[]args) {
		
		Scanner teclado = new Scanner(System.in);
		
		String agencia;
		int numero;
		String nomeCliente;
		double saldo;
		
		System.out.println("***** Conta bancária ***** \n");
		
		System.out.println("Digite a agência: ");
		agencia = teclado.next();
		
		System.out.println("Digite o número da conta: ");
		numero = teclado.nextInt();
		
		System.out.println("Digite o seu nome: ");
		nomeCliente = teclado.next();
		
		System.out.println("Digite o saldo que vai depositar: ");
		saldo = teclado.nextDouble();
		
		System.out.println("Olá " + nomeCliente + ", obrigada por criar uma conta em nosso banco. "
				+ "Sua agência é: " + agencia + ", conta: " + numero + " e seu saldo de " + saldo
				+ " está disponível para saque.");
	}

	

	

}
