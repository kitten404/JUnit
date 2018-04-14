package br.emprestimo.testeUnitario;

import static org.junit.Assert.*;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import br.emprestimo.modelo.Usuario;

public class UC03CadastrarUsuario {
	public static Usuario usuario;
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {	
		usuario= new Usuario();
		usuario.setRa("11111");
		usuario.setNome("Jose da Silva");
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}
	
	@Test(expected=RuntimeException.class)
	public void CT04UC06Cadastra_Usuario_Com_NomeBranco(){
		usuario.setNome("");
	}
	@Test(expected=RuntimeException.class)
	public void CT05UC06CadastraUsuario_NomeNulo(){
		usuario.setNome(null);
	}
	
	@Test(expected=RuntimeException.class)
	public void CT06UC06Cadastra_Usuario_Com_RaBranco(){
		usuario.setRa("");
	}
	@Test(expected=RuntimeException.class)
	public void CT07UC06CadastraUsuario_RaNulo(){
		usuario.setRa(null);
	}
	@Test
	public void CT03CadastrarUsuarioValido(){
		assertEquals("11111",usuario.getRa());
		assertEquals("Jose da Silva",usuario.getNome());
	}
	@Test
	public void CT04CadastrarUsuarioInvalido(){
		//Usuario result= new Usuario();
		assertFalse(usuario.equals("null"));
	}
	@Test
	public void CT05CadastrarUsuarioValido(){
		Usuario result= new Usuario();
		assertTrue(result.equals(usuario));
	}
	@Test
	public void test() {
		fail("Not yet implemented");
	}

}
