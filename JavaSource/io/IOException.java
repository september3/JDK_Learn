package java.io;

/**
 * IO操作产生的异常类
 */
public class IOException extends Exception {

    static final long serialVersionUID = 7818375828146090155L;


    public IOException() {
        super();
    }


    public IOException(String message) {
        super(message);
    }


    public IOException(String message, Throwable cause) {
        super(message, cause);
    }


    public IOException(Throwable cause) {
        super(cause);
    }
}
