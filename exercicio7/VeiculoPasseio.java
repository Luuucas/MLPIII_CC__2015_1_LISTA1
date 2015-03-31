package exercicio7;

public class VeiculoPasseio extends Veiculo {
	
	protected int qtdPortas;
	protected String arCondicionado;
	
	public VeiculoPasseio(){
		
	}
	
	public VeiculoPasseio(String placa,String marca,String modelo,int ano,int valorKmRodado,int kmInicial,int kmFinal, int qtdPortas, String arCondicionado){
		this.placa=placa;
		this.marca=marca;
		this.modelo=modelo;
		this.ano=ano;
		this.valorKmRodado=valorKmRodado;
		this.kmInicial= kmInicial;
		this.kmFinal= kmFinal;
		this.valorLocacao= (kmInicial-kmFinal)*valorKmRodado;
		this.qtdPortas=qtdPortas;
		this.arCondicionado=arCondicionado;
		
	}
	
	public void setValorLocacao(){
		this.valorLocacao=(kmInicial-kmFinal)*valorKmRodado;
	}
	
	public int getQtdPortas() {
		return qtdPortas;
	}

	public void setQtdPortas(int qtdPortas) {
		this.qtdPortas = qtdPortas;
	}

	public String getArCondicionado() {
		return arCondicionado;
	}

	public void setArCondicionado(String arCondicionado) {
		this.arCondicionado = arCondicionado;
	}

	
	public String toString(){
		return "---------VEICULO de Passeio----------"+"\n"+"\n"+"Placa: "+placa+"\n"+"marca: "+marca+"\n"+"Modelo: "+modelo+"\n"+"Ano: "+ano+"\n"+"Km rodados: "+valorKmRodado+"\n"+"Km inicial: "+kmInicial+"\n"+"Km final: "+kmFinal+"\n"+"Quantidade de portas: "+qtdPortas+"Ar Condicionado: "+arCondicionado+"\n"+"Valor da Locação: "+valorLocacao;
	}
}
