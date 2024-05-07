package dio;

import java.util.Locale;
import java.util.Scanner;

public class Sistema {
public static void main(String[] args) {
	
		Locale.setDefault(Locale.US);
		Scanner teclado = new Scanner (System.in);
		ContaTerminal ct = new ContaTerminal();
		
		System.out.println("Bem - Vindo");
		System.out.println("Digite o número da conta: ");
		int Numero = teclado.nextInt();
		System.out.println("Digite o número da Agencia: ");
		String Agencia = teclado.next();
		teclado.nextLine();
		System.out.println("Digite o seu nome completo: ");
		String NomeCliente = teclado.nextLine();
		System.out.println("Digite o seu saldo: ");
		Double Saldo = teclado.nextDouble();
		
		System.out.println("Registrado!!");
		System.out.println();
		System.out.println("Olá " + NomeCliente + ", obrigado por criar uma conta no nosso banco, sua agência é: " + Agencia + " número da sua conta é: "+ Numero + " e seu saldo é: " + Saldo + "Reais" + " já está disponivel para saque.");
	}	
}
