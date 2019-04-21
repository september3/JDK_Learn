package java.lang;


/**
 * 异常类和任何不是RuntimeException的子类的子类都是检查异常 。 
 * 检查的异常需要在方法或构造函数的throws子句中声明，如果它们可以通过执行方法或
 * 构造函数抛出，并在方法或构造函数边界之外传播
 */
public class Exception extends Throwable {
    
    static final long serialVersionUID = -3387516993124229948L;

    /**
     * 构建一个新的异常，其中包含null作为其详细信息。
     * 原因未初始化，可以随后通过调用Throwable.initCause(java.lang.Throwable)进行初始化 。
     */
    public Exception() {
        super();
    }

    /**
     * 构建一个具有特定message的Exception
     * 原因未初始化，可以随后通过调用Throwable.initCause(java.lang.Throwable)进行初始化
     * @param message
     */
    public Exception(String message) {
        super(message);
    }

    /**
     * 构造一个具有message和cause的Exception
     * @param message
     * @param cause
     */
    public Exception(String message, Throwable cause) {
        super(message, cause);
    }

    /**
     * 构造具有指定cause的Exception
     * @param cause
     */
    public Exception(Throwable cause) {
        super(cause);
    }


    /**
     * 构造一个新的异常，其中包含指定的详细消息，启用或禁用抑制功能，启用或禁用可写栈跟踪
     * @param message
     * @param cause
     * @param enableSuppression 是否启用抑制功能
     * @param writableStackTrace 堆栈跟踪是否应该可写
     */
    protected Exception(String message, Throwable cause,
                        boolean enableSuppression,
                        boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
