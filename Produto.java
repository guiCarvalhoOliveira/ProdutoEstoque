public class Produto{
      private String nome;
      private double preco;
      private int qntd;

      public Produto(String nome, double preco, int qntd){
        this.nome=nome;
        this.preco=preco;
        this.qntd=qntd;
      }

                    public String getNome() {
                        return nome;
                    }

                    public void setNome(String nome) {
                        this.nome = nome;
                    }

                    public double getPreco() {
                        return preco;
                    }

                    public void setPreco(double preco) {
                        this.preco = preco;
                    }

                    public int getQntd() {
                        return qntd;
                    }

                    public void setQntd(int qntd) {
                        this.qntd = qntd;
                    }

      public void adicionarEstoque(int quantidade){
        if (quantidade>0) {
            qntd+=quantidade;
            System.out.println(quantidade + " " + nome + (quantidade >1 ? "s foram" : " foi") +  " adicionado" + (quantidade>1 ? "s" : "") + " do estoque!");
        }
       
      }
      
      public void removerEstoque(int quantidade){
        if (quantidade>0) {
            qntd-=quantidade;
            System.out.println(quantidade + " " + nome + (quantidade >1 ? "s foram" : " foi") +  " removido" + (quantidade>1 ? "s" : "") + " do estoque!");
        }
        if (qntd<0) {
            System.out.print("Não é possivel remover estoque 0 ou menos!");
        }
        
      }

      public void mostrarDados(){
        if (qntd<0) {
            System.out.println("O estoque não funciona com quantidade negativa");
        }else{
            System.out.format("Nome do Produto: %s \nPreço do produto: R$%.2f \nQuantidade no estoque: %d\n", getNome(), getPreco(), getQntd());
        }
        
      }

}
