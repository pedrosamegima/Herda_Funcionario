package HerdaFun;

public class Engenheiro extends Funcionario {
	private int numCrea;


	public Engenheiro(String nome, String matricula, double salario, String telfone, String endereco,
			String dataNascimento, int numCrea) {
		super(nome, matricula, salario, telfone, endereco, dataNascimento);
		this.numCrea = numCrea;
	}

	public int getNumCrea() {
		return numCrea;
	}

	public void setNumCrea(int numCrea) {
		this.numCrea = numCrea;
	}
	
	
}
