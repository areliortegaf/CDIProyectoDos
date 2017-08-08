/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import javax.enterprise.context.RequestScoped;
/**
 *
 * @author asortega
 */
@RequestScoped
public class MensajeUno implements Mensaje {
    
    //constructor vacio por defecto
    public MensajeUno(){}

    @Override
    public String obtenerMensaje() {
        return "HOLA!! <3";
    }
    
    
}
