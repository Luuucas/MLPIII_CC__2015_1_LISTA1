
	package exercicio2;

	public class Carros {
		private String cor;
		private String modelo;
		private int velocidadeAtual;
		private int velocidadeMax;
		
		public Carros(String cor,String modelo,int velocidadeAtual,int velocidadeMax){
			this.cor=cor;
			this.modelo=modelo;
			this.velocidadeAtual=velocidadeAtual;
			this.velocidadeMax=velocidadeMax;
		}

		public String getCor() {
			return cor;
		}

		public String getModelo() {
			return modelo;
		}
		
		public int getVelocidadeAtual() {
			return velocidadeAtual;
		}

		public int getVelocidadeMax() {
			return velocidadeMax;
		}

		public void ligar(){
			System.out.println("VRUUUUM");
		}
		
		public void acelerar(int aceleracao){
			this.velocidadeAtual=this.velocidadeAtual+aceleracao;
		    System.out.println("VRUUUUUUUUUUUUM");
			if(this.velocidadeAtual>this.velocidadeMax)
				System.out.println("LIMETE DE VELOCIDADE EXCEDIDA !");
		}
		public String toString(){
			return "Cor: "+this.cor+"\n"+"Modelo: "+this.modelo+"\n";
		}

	}


