package org.wilvec.jee.starter.exceptions;

/**
 *
 * @author GTX1050
 */
public enum CodigoExcepcion {
    
    BE0001("Nombre de usuario y/o Contraseña no válida");

    private CodigoExcepcion(String mensajeUsuario) {
        this.mensajeUsuario = mensajeUsuario;
    }
    
    private final String mensajeUsuario;
    
    public String getMensajeUsuario(){
        return this.mensajeUsuario;
    }
}