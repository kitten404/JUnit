package br.emprestimo.testeUnitario;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import br.emprestimo.modelo.Livro;

public class UC06CadastrarLivro {

	public static Livro livro;
	@BeforeClass
	public static void setUpBeforeClass() throws Exception{
		livro=new Livro();
		livro.setIsbn("121212");
		livro.setTitulo("Engenharia de Software");
		livro.setAutor("Pressman");
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Test(expected=RuntimeException.class)
	public void CT01UC06Cadastra_livro_Com_IsbnInvalido(){
		livro.setIsbn("");
	}
	@Test(expected=RuntimeException.class)
	public void CT02UC06CadastraLivro_comISBN_Invalido_nulo(){
		livro.setIsbn(null);
	}
	
	@Test
	public void CT03CadastrarISBN_Valido(){
		assertEquals("121212",livro.getIsbn());
		assertEquals("Engenharia de Software",livro.getTitulo());
		assertEquals("Pressman",livro.getAutor());
	}
	@Test(expected=RuntimeException.class)
	public void CT04UC06Cadastra_livro_Com_TituloBranco(){
		livro.setTitulo("");
	}
	@Test(expected=RuntimeException.class)
	public void CT05UC06CadastraLivro_TituloNulo(){
		livro.setTitulo(null);
	}
	
	@Test(expected=RuntimeException.class)
	public void CT06UC06Cadastra_livro_Com_AutorBranco(){
		livro.setAutor("");
	}
	@Test(expected=RuntimeException.class)
	public void CT07UC06CadastraLivro_AutorNulo(){
		livro.setAutor(null);
	}
	@Test
	public void CT08UC01CadLivroIsbnInvalido(){
		try{
			livro.setIsbn("");
			fail("Deveria Lançar uma Exception");
		}catch(RuntimeException e){
			assertEquals("ISBN Invalido", e.getMessage());
		}
	}
	public void test() {
		fail("Not yet implemented");
	}

}
