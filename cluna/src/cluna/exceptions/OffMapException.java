/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cluna.exceptions;

/**
 *
 * @author lindsayprigmore
 */
public class OffMapException extends RuntimeException{

    public OffMapException() {
    }

    public OffMapException(String message) {
        super(message);
    }

    public OffMapException(String message, Throwable cause) {
        super(message, cause);
    }

    public OffMapException(Throwable cause) {
        super(cause);
    }

    public OffMapException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
    
}
