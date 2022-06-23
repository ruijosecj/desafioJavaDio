
public class Conta implements IConta{
	  protected int agencia;
	    protected int numero;
	    protected double saldo;

	    private Cliente cliente;

	    private static final int AGENCIA_PADRAO = 0001;
	    private static int SEQUENCIAL = 1;

	    public Conta(Cliente cliente) {
	        this.agencia = Conta.AGENCIA_PADRAO;
	        this.numero = Conta.SEQUENCIAL++;
	        this.cliente = cliente;
	    }
	    
	    public int getAgencia() {
			return agencia;
		}

		public int getNumero() {
			return numero;
		}

		public double getSaldo() {
			return saldo;
		}

		public Cliente getCliente() {
			return cliente;
		}

		@Override
	    public void sacar(double valor) {
	        this.saldo-= valor;
	    }

	    @Override
	    public void depositar(double valor) {
	        this.saldo+= valor;
	    }

	    @Override
	    public void transferir(double valor, Conta contaDestino) {
	        this.sacar(valor);
	        contaDestino.depositar(valor);
	    }
	    public void imprimirExtrato() {
	        System.out.println(String.format("Cliente: %s" , this.cliente.getNome()));
	        System.out.println(String.format("Agencia: %d" , this.agencia));
	        System.out.println(String.format("Número: %d" , this.numero));
	        System.out.println(String.format("Saldo: %.2f" , this.saldo));
	    }

}
