import java.util.Calendar;

public class Principal {

	public static void main(String[] args) {
	    Banco brasil = new Banco();
	    brasil.setNome("Banco do Brasil");

        Cliente rui = new Cliente();
        rui.setNome("Rui");

        Cliente luke = new Cliente();
        luke.setNome("Luke");

        Conta corrente = new ContaCorrente(rui);
        corrente.depositar(100);
        corrente.imprimirExtrato();
        System.out.println();

        Conta poupanca = new ContaPoupanca(luke);
        corrente.transferir(50, poupanca);
        corrente.imprimirExtrato();
        poupanca.imprimirExtrato();
        System.out.println();
        
        brasil.inserirConta(poupanca);
        brasil.inserirConta(corrente);
        brasil.imprimirContas();
        
        Calendar cal = Calendar.getInstance();
        System.out.println(cal);
	}

}
