/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cadastroproduto.bean;

/**
 *
 * @author Familia
 */
public class Marca {
    
    private Integer id;
    private String descricao;
    
    public Marca (){
        
    }
    
    public Marca (Integer id, String descricao) {
    
    this.id = id;
    this.descricao= descricao;
    }
    
    public Integer getId() {
        return id;
    }
    
    public void setId(Integer id) {
        this.id = id;
    }
    
    public String getDescricao () {
        return descricao;
    }
    
    public void setDescricao (String descricao) {
        this.descricao = descricao;
    }
    
}