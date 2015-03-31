package exercicio6;

public class FitaInfantil extends Fitas {
	
	public FitaInfantil(String titulo,double preco){
		this.titulo=titulo;
		this.preco= preco-((preco*40)/100);
	}
	
	public FitaInfantil(){
		
	}
	
	public void setPreco(double preco){
		this.preco= preco-((preco*40)/100);
	}
	
	public String toString(){
		return "Titulo: "+titulo+"\n"+"preco: "+preco;
	}
}
