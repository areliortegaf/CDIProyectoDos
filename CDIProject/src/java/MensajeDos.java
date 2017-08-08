
import javax.enterprise.context.RequestScoped;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * SE CREO PARA LA PRACTICA DE QUALIFIERS QUE SIRVEN PARA SABER QUE MENSAJE INJECTAR
 */
@RequestScoped @SegundoMensaje
public class MensajeDos implements Mensaje {
    
    public MensajeDos(){}

    @Override
    public String obtenerMensaje() {
        return "Hola soy el mensaje dos";
    }
    
}
