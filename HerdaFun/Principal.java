package HerdaFun;

public class Principal {

	public static void main(String[] args) {
		Funcionario funcionario = new Funcionario("Rafael","3998",12.000,"15997214905","Avenida padre antonio brunette","04/01/2007");
		System.out.println("Funcionario: ");
		System.out.println("Nome: "+funcionario.getNome());
		System.out.println("Matricula: "+funcionario.getMatricula());
		System.out.println("Salario: "+funcionario.getSalario());
		System.out.println("Telefone:" +funcionario.getTelfone());
		System.out.println("Endereco: "+funcionario.getEndereco());
		System.out.println("Data Nascimento: "+funcionario.getDataNascimento());
		
		System.out.println("--------------------------------------------------------------------------------------");
		Administrador administrador = new Administrador("Pedro","3798",42.000,"15997214905","Avenida padre antonio brunette","04/01/2007",5454);
		System.out.println("\nAdministrador: ");
		System.out.println("Nome: "+administrador.getNome());
		System.out.println("Matricula: "+administrador.getMatricula());
		System.out.println("Salario: "+administrador.getSalario());
		System.out.println("Telefone:" +administrador.getTelfone());
		System.out.println("Endereco: "+administrador.getEndereco());
		System.out.println("Data Nascimento: "+administrador.getDataNascimento());
		System.out.println("Nome: "+administrador.getCra());
	
		
		System.out.println("--------------------------------------------------------------------------------------");
		Engenheiro engenheiro = new Engenheiro("Matheus","3968",12.000,"15997214905","Avenida padre antonio brunette","04/01/2007",2525);
		System.out.println("\nAdministrador: ");
		System.out.println("Nome: "+engenheiro.getNome());
		System.out.println("Matricula: "+engenheiro.getMatricula());
		System.out.println("Salario: "+engenheiro.getSalario());
		System.out.println("Telefone:" +engenheiro.getTelfone());
		System.out.println("Endereco: "+engenheiro.getEndereco());
		System.out.println("Data Nascimento: "+engenheiro.getDataNascimento());
		System.out.println("Nome: "+engenheiro.getNumCrea());
	
		
		System.out.println("--------------------------------------------------------------------------------------");
		Medico medico = new Medico("Luiz","3928",5.000,"15997214905","Avenida padre antonio brunette","04/01/2007",2725);
		System.out.println("\nAdministrador: ");
		System.out.println("Nome: "+medico.getNome());
		System.out.println("Matricula: "+medico.getMatricula());
		System.out.println("Salario: "+medico.getSalario());
		System.out.println("Telefone:" +medico.getTelfone());
		System.out.println("Endereco: "+medico.getEndereco());
		System.out.println("Data Nascimento: "+medico.getDataNascimento());
		System.out.println("Nome: "+medico.getCrm());
		
		
	}

}
