package br.com.daniel.curso.fjoo.polimorfismo;

public class MainPolimorfismo {
	public static void main(String[] args) {
		Conta conta = new Conta();
		conta.setSaldo(4000.00);
		
		imprimirSaldo(conta);
		
		ContaCorrente contaCorrente = new ContaCorrente();
		contaCorrente.setSaldo(3500);
		imprimirSaldo(contaCorrente);
		
		ContaPoupanca contaPoupanca = new ContaPoupanca();
		contaPoupanca.setSaldo(2000);
		imprimirSaldo(contaPoupanca);
		
	}
	
	public static void imprimirSaldo(Conta conta) {
		System.out.println("Saldo da conta: R$" + conta.getSaldo());
		
		if (conta instanceof ContaCorrente) {
			ContaCorrente cc = (ContaCorrente) conta;
			System.out.println("O limite da conta corrente é: R$" + cc.getLimite());
		}
		
		if (conta instanceof ContaPoupanca) {
			ContaPoupanca cp = (ContaPoupanca) conta;
			System.out.println("O rendimento da conta poupança é de: R$" + cp.getRendimentos() + " a.a.");
		}
	}
}
