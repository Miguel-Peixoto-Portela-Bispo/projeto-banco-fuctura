package fuctura.bank;

public class ContaCorrente extends Contas{

	public ContaCorrente(String nomeDoTitular)
	{
		super(nomeDoTitular);
	}
	// faz saque
	public void fazerSaque(double valor)
	{
		this.saldo-=valor;
		System.out.println(nomeDoTitular+" fez um saque de: R$ "+valor+".");
	}
	public void aplicarValoresNaContaPoupança(ContaPoupança cp, double valor)
	{
		this.saldo-=valor;
		cp.saldo+=valor;
		System.out.println(nomeDoTitular+" aplicou um valor de: R$ "+valor+" na conta poupança.");
	}
}
