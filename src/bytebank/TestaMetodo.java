package bytebank;

public class TestaMetodo {

	public static void main(String[] args) {
		Conta contaDoRogerio = new Conta();
		contaDoRogerio.saldo = 100;
		contaDoRogerio.deposita(50);

		System.out.println(contaDoRogerio.saldo);
		boolean conseguiuRetirar = contaDoRogerio.saca(50);
		System.out.println(contaDoRogerio.saldo);
		System.out.println(conseguiuRetirar);

		Conta contaDaMarcela = new Conta();
		contaDaMarcela.deposita(200);

		boolean sucessoTransferencia = contaDaMarcela.transfere(3000, contaDoRogerio);
		if (sucessoTransferencia) {
			System.out.println("transferencia com sucesso");

		} else {

			System.out.println("faltou dinheiro");
		}

		System.out.println(contaDaMarcela.saldo);
		System.out.println(contaDoRogerio.saldo);
		
		contaDoRogerio.titular = "rogerio ribeiro";
		System.out.println(contaDoRogerio.titular);

	}
}
