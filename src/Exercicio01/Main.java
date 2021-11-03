package Exercicio01;

public class Main {

	public static void main(String[] args) {

		PessoaFisica pesF = new PessoaFisica();
		PessoaJuridica pesJ = new PessoaJuridica();
		
		pesF.setCodigo(1);
		pesF.setNome("Caio");
		pesF.setIdade(20);
		pesF.setEndereco("Primavera do Leste");
		pesF.setCpf("123.456.789-01");
		
		pesJ.setNome("Tabajara LTDA");
		pesJ.setCodigo(123456123);
		pesJ.setIdade(150);
		pesJ.setEndereco("Rio do Sul");
		pesJ.setCnpj("11123321");
		pesJ.setTipoEmpresa("Pequena Empresa");
		
		
		System.out.println(pesF);
		System.out.println(pesJ);
		
	}

}