import java.util.ArrayList;
import java.util.List;

public class Banco {
	 private String nome;

	    private List<Conta> contas = new ArrayList<>();
	    
	    

	    public String getNome() {
			return nome;
		}

		public void setNome(String nome) {
			this.nome = nome;
		}

		public List<Conta> getContas() {
			return contas;
		}

		public void setContas(List<Conta> contas) {
			this.contas = contas;
		}

		public void inserirConta (Conta conta){
	         contas.add(conta);
	    }

	    public void imprimirContas (){
	    	System.out.println("Contas abertas no " +this.nome); 
	    	for (Conta conta: contas) {
	            System.out.println( "Cliente: " + conta.getCliente().getNome());
	            System.out.println( "Numero da Conta: " + conta.getNumero());
	            System.out.println( "Numero da Agencia: " + conta.getAgencia());
	        }

	    }

}
