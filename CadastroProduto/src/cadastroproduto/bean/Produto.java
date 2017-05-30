/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cadastroproduto.bean;

import java.sql.Date;

/**
 *
 * @author Josué
 * `id` int(11) NOT NULL,
  `descricao` varchar(100) COLLATE utf8_unicode_ci NOT NULL,
  `preco_compra` float NOT NULL,
  `preco_venda` float NOT NULL,
  `data_compra` date NOT NULL,
  `id_marca` int(11) NOT NULL
 */
public class Produto {
    
    // Estas são as variaves privadas onde serão armazenado os valores
    private Integer id;
    private String descricao;
    private Double preco_compra;
    private Double preco_venda;
    private Date data_compra;
    private Integer id_marca;
    
    // Este é um construtor vazio padrão
    public Produto(){
        
    }

    // Este é nosso construtor onde as variaveis privadas na cor verde recebe as variaves passadas por parametro (as que estão entre parenteses).
    public Produto(Integer id, String descricao, Double preco_compra, Double preco_venda, Date data_compra, Integer id_marca) {
        // E this significa que a variavel é global da nossa classe produto, veja que podemos usar duas variaves com o mesmo nome, por isso usa o this
        // para dizer qual é a variavel local da classe, a que não tem o this é uma variavel local do metodo Produto().
        this.id = id;
        this.descricao = descricao;
        this.preco_compra = preco_compra;
        this.preco_venda = preco_venda;
        this.data_compra = data_compra;
        this.id_marca = id_marca;
    }
    
    // Abaixo estão os metodos gets e seters de todas as variaveis desta classe Bean(Bean quer dizer Feijão kkk).
    
    // Aqui temos o metodo magicos get com esse metodo podemos acessar o valor da nossa variavel em qualquer outra classe do nosso projeto. 
    public Integer getId() {
        return id;
    }

    // Aqui temos o metodo magico set com ele podemos setar valores em nossa variavel em qualquer lugar do projeto
    public void setId(Integer id) {
        this.id = id;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Double getPreco_compra() {
        return preco_compra;
    }

    public void setPreco_compra(Double preco_compra) {
        this.preco_compra = preco_compra;
    }

    public Double getPreco_venda() {
        return preco_venda;
    }

    public void setPreco_venda(Double preco_venda) {
        this.preco_venda = preco_venda;
    }

    public Date getData_compra() {
        return data_compra;
    }

    public void setData_compra(Date data_compra) {
        this.data_compra = data_compra;
    }

    public Integer getId_marca() {
        return id_marca;
    }

    public void setId_marca(Integer id_marca) {
        this.id_marca = id_marca;
    }
    
    
    
}
