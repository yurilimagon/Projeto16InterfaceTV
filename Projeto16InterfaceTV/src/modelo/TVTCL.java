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
public class TVTCL extends TV implements IControleRemoto {
    //ATRIBUTO CONSTANTE
    public final String MODELO = "TCL";
    
    //CONSTRUTOR
    public TVTCL(int tamanho){
        super(tamanho);
    }
    
    //MÉTODOS
    @Override
    public void mudarCanal(int canal) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void aumentarVolume(int volume) {
        super.setVolume(volume++);
    }

    @Override
    public void diminuirVolume(int volume) {
        super.setVolume(volume--);
    }

    @Override
    public boolean ligar() {
        System.out.println("Welcome...");
        super.setLigada(true);
        return true;
    }

    @Override
    public boolean desligar() {
        System.out.println("Bye Bye...");
        super.setLigada(false);
        return false;
    }
    
    
}
