package org.wilvec.jee.starter.exceptions;

/**
 *
 * @author wjvega
 */
public class BusinessException extends Exception {

    private static final long serialVersionUID = 5202321839384006527L;
    private final String mensajeTecnico;
    private final String mensajeUsuario;
    
    
    public BusinessException(CodigoExcepcion codigo, Throwable e) {
        this.mensajeTecnico = e.getMessage();
        this.mensajeUsuario = codigo.getMensajeUsuario();
        System.out.println("Looger aca: "+e.getMessage());
    }

    public String getMensajeTecnico() {
        return mensajeTecnico;
    }

    public String getMensajeUsuario() {
        return mensajeUsuario;
    }
}
