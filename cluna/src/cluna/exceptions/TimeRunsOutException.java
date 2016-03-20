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
public class TimeRunsOutException extends RuntimeException{

    public TimeRunsOutException() {
    }

    public TimeRunsOutException(String message) {
        super(message);
    }

    public TimeRunsOutException(String message, Throwable cause) {
        super(message, cause);
    }

    public TimeRunsOutException(Throwable cause) {
        super(cause);
    }

    public TimeRunsOutException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
    
}
