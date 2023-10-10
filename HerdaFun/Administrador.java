package HerdaFun;

public class Administrador extends Funcionario {
	private int cra;

	

	public Administrador(String nome, String matricula, double salario, String telfone, String endereco,
			String dataNascimento, int cra) {
		super(nome, matricula, salario, telfone, endereco, dataNascimento);
		this.cra = cra;
	}

	public int getCra() {
		return cra;
	}

	public void setCra(int cra) {
		this.cra = cra;
	}
	
	
}
