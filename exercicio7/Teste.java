package exercicio7;

public class Teste {
	
	public static void main(String[] args){
		
		VeiculoCarga veiculo1= new VeiculoCarga();
		VeiculoPasseio veiculo2= new VeiculoPasseio("ABC-2222","Wolksvagen","Golf",2014,60,78,40,4,"sim");
		
		veiculo1.setPlaca("ABC-2231");
		veiculo1.setMarca("Mercedes Bens");
		veiculo1.setModelo("Mercedes Carrera Carga");
		veiculo1.setAno(2014);
		veiculo1.setValorKmRodado(100);
		veiculo1.setKmInicial(0);
		veiculo1.setKmFinal(70);
		veiculo1.setValorLocacao();
		veiculo1.setCapacidadeCarga(2);
		
		System.out.println(veiculo2);
	}

}
