package exercicio6;

public class Locadora {
	
	public static void main (String[] args){
		
		FitaLancamento fita1= new FitaLancamento();
		FitaInfantil fita2= new FitaInfantil("Galinha Pintadinha",5.50);
		
		fita1.setTitulo("O HOBBIT-A Batalha dos 3 mundos");
		fita1.setPreco(9.50);
		
		System.out.println(fita2);
		System.out.println(fita1);
	
	}

}
