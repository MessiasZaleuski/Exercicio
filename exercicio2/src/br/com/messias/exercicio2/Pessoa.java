package br.com.messias.exercicio2;

public class Pessoa {
	public String nome;
	public String endereco;
	public String telefone;
	
	
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	 public String getDados(){
	        return "NOME: "+ this.nome+
	                "\nENDEREÇO: "+this.endereco+
	                 "\nTELEFONE: "+this.telefone+
	                    "\n";
	        	
}
}