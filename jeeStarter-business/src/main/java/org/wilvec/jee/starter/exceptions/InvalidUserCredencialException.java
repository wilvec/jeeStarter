package org.wilvec.jee.starter.exceptions;

/**
 *
 * @author wjvega
 */
public class InvalidUserCredencialException extends Exception {

    public InvalidUserCredencialException(String string) {
        super(string);
    }

    public InvalidUserCredencialException(Throwable thrwbl) {
        super(thrwbl);
    }
    
}
