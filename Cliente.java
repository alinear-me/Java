package poo.comeco;

public class Cliente {
	//criação dos atributos da classe
	
		private String NomeCliente;
		private String CPF;
		private String idade;
		private String profissao;
		
	//método construtor
		public Cliente (String NomeCliente, String CPF, String idade, String profissao)
		{
			this.NomeCliente = NomeCliente;
			this.CPF = CPF;
			this.idade = idade;
			this.profissao = profissao;
		}
		
		public Cliente (String CPF) 
		{
			this.CPF = CPF;
		}
		
		public void imprimirInfo()
		{
			System.out.println(NomeCliente+" de "+idade+ " anos, do CPF "+CPF+" que trabalha na profissão de: "+profissao);
		}

		public String getNomeCliente() {
			return NomeCliente;
		}

		public void setNomeCliente(String nomeCliente) {
			NomeCliente = nomeCliente;
		}

		public String getCPF() {
			return CPF;
		}

		public void setCPF(String cPF) {
			CPF = cPF;
		}

		public String getIdade() {
			return idade;
		}

		public void setIdade(String idade) {
			this.idade = idade;
		}

		public String getProfissao() {
			return profissao;
		}

		public void setProfissao(String profissao) {
			this.profissao = profissao;
		}
			
		
}

