package Exercicio02;

public class Main {

	public static void main(String[] args) {

		Livro livro = new Livro ();
		CD cd = new CD ();
		VHS vhs = new VHS();
		
		livro.setCodigo(1234);
		livro.setDescricao("Livro Aleatório");
		livro.setAutor("Caio Luiz Bervian");
		
		cd.setCodigo(4567);
		cd.setDescricao("Bom demais");
		cd.setGravadora("GravadoraBoa");
		cd.setDuracao("24 hrs");
		cd.setAlbum("é isso");
		cd.setArtista("Fulano");
		cd.setFaixas(10);
		
		vhs.setCodigo(3789);
		vhs.setDescricao("Ruim demais");
		vhs.setDuracao("80 hrs");
		vhs.setGravadora("GravadoraRuim");
		vhs.setTitulo("TituloAleatorio");
		
		System.out.println(livro);
		System.out.println(cd);
		System.out.println(vhs);
		

	}

}