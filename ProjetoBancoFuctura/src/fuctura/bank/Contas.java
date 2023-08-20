package fuctura.bank;

public abstract class Contas {

	public String numeroDaConta;
	public String nomeDoTitular;
	protected double saldo;
	public Contas(String nomeDoTitular)
	{
		this.nomeDoTitular = nomeDoTitular;
		// cria numero aleatório
		this.numeroDaConta = "";
		for(int i = 0;i<20;i++)
		{
			this.numeroDaConta+=Math.floor(Math.random()*9);
		}
	}
	//exibe informações sobre a conta
	public void exibirDados()
	{
		System.out.println("Número da conta: "+numeroDaConta);
		System.out.println("Nome do titular: "+nomeDoTitular);
	}
	// adiciona valor à conta
	public void fazerDeposito(double valor)
	{
		saldo+=valor;
	}
	// exibe saldo
	public void exibirSaldo()
	{
		System.out.println("Saldo: R$ "+saldo);
	}
	public double getSaldo()
	{
		return saldo;
	}
	public void setSaldo(double valor)
	{
		saldo = valor;
	}
}
