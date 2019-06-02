package org.wilvec.jee.starter.exceptions;

/**
 *
 * @author wjvega
 */
public class BusinessException extends Exception {

    public BusinessException() {
    }

    public BusinessException(String message) {
        super(message);
    }

    public BusinessException(Throwable cause) {
        super(cause);
    }
    
}
