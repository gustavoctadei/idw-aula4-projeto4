/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.util.List;
import model.Produto;

/**
 *
 * @author gustavo
 */
public class ProdutoDao extends GenericDao {
    
    public void salvar(Produto produto) {
        savePojo(produto);
    }
    
    public void atualizar(Produto produto) {
        savePojo(produto);
    }
    
    public void excluir(Produto produto) {
        removePojo(produto);
    }
    
    public Produto buscarProduto(Integer idProduto) {
        String sql = "select p from Produto p where p.idProduto = ?1";
        
        return (Produto) getPojo(sql, idProduto);
    }
    
    public List<Produto> listar() {
        String sql = "select p from Produto p";
        
        return getPureList(Produto.class, sql);
    }
    
}
