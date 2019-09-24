/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author yuril
 */
public class TVSharp extends TV {
    //CONSTANTE em Java - por convenção utilizamos
    //o nome do atributo constante em letras MAIÚSCULAS
    public final String MODELO = "SHARP";
    
    //CONSTRUTOR
    public TVSharp(int tamanho){
        super(tamanho);
    }
}
