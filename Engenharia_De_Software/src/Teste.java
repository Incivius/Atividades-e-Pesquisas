import org.junit.jupiter.api.Test;

import junit.framework.TestCase;

public class Teste extends TestCase {

	@Test
	public void test() {
		
		Estoque etq = new Estoque();
		
		etq.addProduto(new Produto("Coador", "pano", 1, 3.20));
		System.out.println(etq.getProdutos().size());
		
			
		assertEquals(etq.getProdutos().size(), 1);
	}
}