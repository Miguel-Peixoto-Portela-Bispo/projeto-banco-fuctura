package fuctura.bank;

public class ContaPoupança extends Contas{

	public ContaPoupança(String nomeDoTitular)
	{
		super(nomeDoTitular);
	}
	// resgata valor
	public void resgatar(ContaCorrente cc, double valor)
	{
		this.saldo-=valor;
		cc.saldo+=valor;
		System.out.println(nomeDoTitular+" resgatou um valor de: R$ "+valor+".");
	}
}
