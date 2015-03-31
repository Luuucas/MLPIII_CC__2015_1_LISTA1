package exercicio6;

public class FitaLancamento extends Fitas {
	
	public FitaLancamento(String titulo,double preco){
		this.titulo=titulo;
		this.preco= preco+((preco*20)/100);
	}
	
	public FitaLancamento(){
		
	}
	
	public void setPreco(double preco){
		this.preco= preco+((preco*20)/100);
	}
	
	public String toString(){
		return "Titulo: "+titulo+"\n"+"preco: "+preco;
	}

}
