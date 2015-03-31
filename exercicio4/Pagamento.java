package exercicio4;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Pagamento {
	
	private String nome;
	private String salario;
	
	public Pagamento(){
		
	}
	
	public Pagamento(String nome, String salario){
		this.nome=nome;
		this.salario= salario;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getSalario() {
		Pattern pattern = Pattern.compile("\\d");
		Matcher matcher = pattern.matcher(salario);
		int s=0;
		int aux=0;
		String x="";
		while(matcher.find()){
			if(aux==0){
				aux=matcher.start();
			}
			if(aux == matcher.start()){
				x += matcher.group();
				aux++;
				continue;
			}
			aux = matcher.start();
			s += Integer.parseInt(x);
			x="";
			x += matcher.group();
			aux++;
		}
		s += Integer.parseInt(x);
		return s;
	}

	public void setSalario(String salario) {
		this.salario = salario;
	}
	
	public String toString(){
		return "Nome: "+nome+"\n"+ "Salario: "+salario;
	//if(salario.matches("[0-9]+")) System.out.println("Salario: "+salario);
	}

}
