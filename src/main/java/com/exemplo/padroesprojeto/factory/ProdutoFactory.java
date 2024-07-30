package com.exemplo.padroesprojeto.factory;

import com.exemplo.padroesprojeto.model.Produto;

public class ProdutoFactory {
    public static Produto criarProduto(String nome, double preco) {
        Produto produto = new Produto();
        produto.setNome(nome);
        produto.setPreco(preco);
        return produto;
    }
}
