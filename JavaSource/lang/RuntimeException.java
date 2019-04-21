package java.lang;



/**
 * 运行时异常
 * RuntimeException是在Java虚拟机的正常操作期间可以抛出的那些异常的超类。
 * RuntimeException及其子类是未经检查的异常 。
 * unchecked异常不需要在方法或构造函数的拟申报throws条款，如果他们可以通过该方法或构造函数的执行被抛出和方法或构造边界之外传播。
 * @since JDK1.0
 */
public class RuntimeException extends Exception {
    static final long serialVersionUID = -7034897190745766939L;


    public RuntimeException() {
        super();
    }


    public RuntimeException(String message) {
        super(message);
    }


    public RuntimeException(String message, Throwable cause) {
        super(message, cause);
    }

    public RuntimeException(Throwable cause) {
        super(cause);
    }

    protected RuntimeException(String message, Throwable cause,
                               boolean enableSuppression,
                               boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
