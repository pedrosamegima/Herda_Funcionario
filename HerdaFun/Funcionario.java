package HerdaFun;

public class Funcionario {
	private String nome;
	private String matricula;
	private double salario;
	private String telfone;
	private String endereco;
	private String dataNascimento;
	public Funcionario(String nome, String matricula, double salario, String telfone, String endereco,
			String dataNascimento) {
		this.nome = nome;
		this.matricula = matricula;
		this.salario = salario;
		this.telfone = telfone;
		this.endereco = endereco;
		this.dataNascimento = dataNascimento;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getMatricula() {
		return matricula;
	}
	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}
	public double getSalario() {
		return salario;
	}
	public void setSalario(double salario) {
		this.salario = salario;
	}
	public String getTelfone() {
		return telfone;
	}
	public void setTelfone(String telfone) {
		this.telfone = telfone;
	}
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	public String getDataNascimento() {
		return dataNascimento;
	}
	public void setDataNascimento(String dataNascimento) {
		this.dataNascimento = dataNascimento;
	}
	
	
}
