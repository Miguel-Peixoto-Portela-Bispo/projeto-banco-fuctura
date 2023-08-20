package fuctura.bank;

import java.util.Scanner;

public class FucturaBank {

	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Digite seu nome: ");
		String nome = scan.nextLine();
		ContaCorrente cc = new ContaCorrente(nome);
		ContaPoupança cp = new ContaPoupança(nome);
		String resposta;
		// assegura que a opção é válida
		do
		{
			System.out.println("Deseja fazer um deposito? (Sim/Não)");
			resposta = scan.nextLine();
			if(!resposta.equalsIgnoreCase("não")&&!resposta.equalsIgnoreCase("sim"))
			{
				System.out.println("Reposta inválida...");
			}
		} while(!resposta.equalsIgnoreCase("não")&&!resposta.equalsIgnoreCase("sim"));
		// se a resposta foi sim, faz um depósito
		if(resposta.equalsIgnoreCase("sim"))
		{
			System.out.println("Digite o valor: ");
			double valor = scan.nextDouble();
			cc.setSaldo(cc.getSaldo()+valor);
		}
	}
}
