package org.wilvec.jee.starter.exceptions;

import org.wilvec.jee.starter.entity.Persona;
import org.wilvec.jee.starter.entity.Usuario;

/**
 *
 * @author wjvega
 */
public class ObjectNotFoundException extends Exception {

    private String mensaje;

    public ObjectNotFoundException(String string) {
        super(string);
    }

    public ObjectNotFoundException(Object objeto) {
        if (objeto instanceof Usuario) {
            this.mensaje = "No se encontro el usuario";
        } else if (objeto instanceof Persona) {
            this.mensaje = "No se encontro la persona";
        }
        this.mensaje += " con los datos proporcionados";
    }

    /**
     * @return the mensaje
     */
    public String getMensaje() {
        return mensaje;
    }

    /**
     * @param mensaje the mensaje to set
     */
    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }

}
