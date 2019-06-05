package org.wilvec.jee.starter.exceptions;

/**
 *
 * @author wjvega
 */
public class InvalidUserCredencialException extends Exception {

    private static final long serialVersionUID = 8294943647778117765L;

    public InvalidUserCredencialException(String string) {
        super(string);
    }

    public InvalidUserCredencialException(Throwable thrwbl) {
        super(thrwbl);
    }
    
}
