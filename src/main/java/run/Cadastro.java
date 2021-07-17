/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package run;

import dao.CategoriaDao;
import dao.ProdutoDao;
import model.Categoria;
import model.Produto;

/**
 *
 * @author gustavo
 */
public class Cadastro {
    
    public static void main(String[] args) {
        Cadastro cadastro = new Cadastro();
        
        cadastro.cadastraCategorias();
        cadastro.cadastraProdutos();
        
        System.out.println("Cadastros gerados com sucesso.");
    }
    
    private void cadastraCategorias() {
        String[] descricao = {"Utilidades", "Geral", "Multimídia"};
        
        Categoria categoria = null;
        CategoriaDao categoriaDao = new CategoriaDao();
        
        for (int i = 0; i < descricao.length; i++) {
            categoria = new Categoria();
            categoria.setDescricao(descricao[i]);
            
            categoriaDao.salvar(categoria);
        }
    }
    
    private void cadastraProdutos() {
        String[] descricao = {"Bicicleta", "Televisão", "DVD"};
        Double[] preco = {356.83, 19.99, 195.60};
        
        Produto produto = null;
        ProdutoDao produtoDao = new ProdutoDao();
        
        for (int i = 0; i < descricao.length; i++) {
            produto = new Produto();
            produto.setDescricao(descricao[i]);
            produto.setPreco(preco[i]);
            produto.setIdCategoria( new Categoria(i + 1) );
            
            produtoDao.salvar(produto);
        }
    }
    
}
