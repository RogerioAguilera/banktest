package bytebank;

public class TesteReferencias {
	
	public static void main(String[] args) {
		Conta primeiraConta = new Conta();
		primeiraConta.saldo = 400;
		
		System.out.println("Saldo da conta primeira " + primeiraConta.saldo);
		
		Conta segundaConta = primeiraConta;
		segundaConta.saldo = 500;
		
		System.out.println("Saldo da conta segunda " + segundaConta.saldo);
		
		segundaConta.saldo += 200;
		primeiraConta.saldo +=4400;
		
		System.out.println("Adicionei mais valores " + segundaConta.saldo);
		System.out.println("Mais valor " + primeiraConta.saldo);
		
		if (primeiraConta == segundaConta) {
			
			System.out.println("As contas são iguais");
		}else {
			
			System.out.println("Contas diferentes");
		}
	}
	

}
