public class Main {
    public static void main(String[] args) throws Exception {
        Produto p1 = new Produto("Mouse", 50.00, 0);
        
        System.out.println("Bem vindo ao estoque!");
        System.out.println("");

        p1.setNome("Caneta");
        p1.setPreco(2.5);
        p1.setQntd(4);
        
        p1.mostrarDados();
        System.out.println("");
        
        p1.adicionarEstoque(2);
        System.out.println("");
        
        p1.mostrarDados();
        System.out.println("");
        
        p1.removerEstoque(3);
        System.out.println("");
        
        p1.removerEstoque(3);
        System.out.println("");

        p1.removerEstoque(0);
        System.out.println("");
        
        p1.mostrarDados();
    }
}
