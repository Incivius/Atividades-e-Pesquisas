public class TesteInicial {

    public static void main(String[] args){
    	Estoque etq = new Estoque();
		etq.addProduto(new Produto("Coador", "pano", 1, 3.20));
		System.out.println(etq.getProdutos().size());
    }
    
}
