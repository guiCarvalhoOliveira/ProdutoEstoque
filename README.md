  Crie uma classe chamada Produto que represente um item em um estoque de loja.

🔧 Atributos:
- nome (String)
- preco (double)
- quantidade (int)

🔨 Métodos:
- Construtor: para inicializar todos os atributos.
- adicionarEstoque(int quantidade): aumenta a quantidade do produto no estoque.
- removerEstoque(int quantidade): diminui a quantidade do produto (mas não pode ficar negativa).
- mostrarDados(): exibe nome, preço e quantidade atual.

💡 Exemplo de uso:
Produto p = new Produto("Mouse Gamer", 150.0, 10);

p.adicionarEstoque(5);  // total: 15
p.removerEstoque(3);    // total: 12
p.mostrarDados();

Saída esperada:

Produto: Mouse Gamer
Preço: R$ 150.0
Quantidade em estoque: 12
