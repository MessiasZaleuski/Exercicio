package br.com.messias.exercicio2;

import java.util.ArrayList;

public class Principal {

	public static void main(String[] args) {
		 ArrayList<Pessoa>ListaPessoa = new ArrayList();
	        
	        Pessoa p1 = new Pessoa();
	        p1.setNome("Messias");
	        p1.setEndereco("Rua Satyrio");
	        p1.setTelefone("999999");
	        
	        ListaPessoa.add(p1);
	        
	      
	        for(int i=0;i<ListaPessoa.size();i++){
	            System.out.println(ListaPessoa.get(i).getDados());
	} 

}
}
