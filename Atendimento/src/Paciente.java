
public class Paciente {
	String nome;
	int idade;
	String sexo;
	String horarioChegada;
	int risco;
	
	//construtores
	public Paciente() {
		
	}
	
	public Paciente(String nome, int idade, String sexo, String horarioChegada, int risco) {
		setNome(nome);
		setIdade(idade);
		setSexo(sexo);
		setHorarioChegada(horarioChegada);
		setRisco(risco);
	}
	//get and set
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		if(nome.length() > 0)
			this.nome = nome;
	}
	
	
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		if(idade > 0)
			this.idade = idade;
	}
	
	
	public String getSexo() {
		return sexo;
	}
	public void setSexo(String sexo) {
		if(sexo == "masculino" ||  sexo == "feminino")
			this.sexo = sexo;
	}
	
	
	public int getRisco() {
		return risco;
	}
	public void setRisco(int risco) {
		this.risco = risco;
	}
	
	
	public String getHorarioChegada() {
		return horarioChegada;
	}
	public void setHorarioChegada(String horarioChegada) {
		if(horarioChegada.length() > 0)
			this.horarioChegada = horarioChegada;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Paciente [nome=");
		builder.append(nome);
		builder.append(", idade=");
		builder.append(idade);
		builder.append(", sexo=");
		builder.append(sexo);
		builder.append(", horarioChegada=");
		builder.append(horarioChegada);
		builder.append(", risco=");
		builder.append(risco);
		builder.append("]");
		return builder.toString();
	}
	
	
	
}
