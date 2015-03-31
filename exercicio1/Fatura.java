package exercicio1;

public class Fatura {
	
	private String numero;
	private String descricao;
	private int qtdCompras;
	private double preco;
	public String getNumero() {
		return numero;
	}
	public void setNumero(String numero) {
		this.numero = numero;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public int getQtdCompras() {
		return qtdCompras;
	}
	public void setQtdCompras(int qtdCompras) {
		this.qtdCompras = qtdCompras;
	}
	public double getPreco() {
		return preco;
	}
	public void setPreco(double preco) {
		this.preco = preco;
		if(this.preco<0) this.preco=0.0;
	}
	
	public double getValorFatura(Fatura fatura){
		double valor; 
		valor= this.preco*this.qtdCompras;
		if(valor<0) return 0;
		
		return valor;
	}

}
