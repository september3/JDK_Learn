package java.util;


/**
 * 当不允许进行此类修改时，检测到对象的并发修改的方法可能抛出此异常
 *
 */
public class ConcurrentModificationException extends RuntimeException {
    private static final long serialVersionUID = -3666751008965953603L;


    public ConcurrentModificationException() {
    }


    public ConcurrentModificationException(String message) {
        super(message);
    }


    public ConcurrentModificationException(Throwable cause) {
        super(cause);
    }


    public ConcurrentModificationException(String message, Throwable cause) {
        super(message, cause);
    }
}
