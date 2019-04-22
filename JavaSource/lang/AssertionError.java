package java.lang;

/**
 * 断言失败异常
 */
public class AssertionError extends Error {
    private static final long serialVersionUID = -5013299493970297370L;


    public AssertionError() {
    }


    private AssertionError(String detailMessage) {
        super(detailMessage);
    }


    /**
     * 将断言错误信息转换成为Object输出
     * @param detailMessage
     */
    public AssertionError(Object detailMessage) {
        this(String.valueOf(detailMessage));
        if (detailMessage instanceof Throwable)
            initCause((Throwable) detailMessage);
    }

    /**
     * 断言错误转换成为boolean进行输出
     * @param detailMessage
     */
    public AssertionError(boolean detailMessage) {
        this(String.valueOf(detailMessage));
    }

    /**
     * Constructs an AssertionError with its detail message derived
     * from the specified <code>char</code>, which is converted to a
     * string as defined in section 15.18.1.1 of
     * <cite>The Java&trade; Language Specification</cite>.
     *
     * @param detailMessage value to be used in constructing detail message
     */
    public AssertionError(char detailMessage) {
        this(String.valueOf(detailMessage));
    }

    /**
     * Constructs an AssertionError with its detail message derived
     * from the specified <code>int</code>, which is converted to a
     * string as defined in section 15.18.1.1 of
     * <cite>The Java&trade; Language Specification</cite>.
     *
     * @param detailMessage value to be used in constructing detail message
     */
    public AssertionError(int detailMessage) {
        this(String.valueOf(detailMessage));
    }

    /**
     * Constructs an AssertionError with its detail message derived
     * from the specified <code>long</code>, which is converted to a
     * string as defined in section 15.18.1.1 of
     * <cite>The Java&trade; Language Specification</cite>.
     *
     * @param detailMessage value to be used in constructing detail message
     */
    public AssertionError(long detailMessage) {
        this(String.valueOf(detailMessage));
    }

    /**
     * Constructs an AssertionError with its detail message derived
     * from the specified <code>float</code>, which is converted to a
     * string as defined in section 15.18.1.1 of
     * <cite>The Java&trade; Language Specification</cite>.
     *
     * @param detailMessage value to be used in constructing detail message
     */
    public AssertionError(float detailMessage) {
        this(String.valueOf(detailMessage));
    }

    /**
     * Constructs an AssertionError with its detail message derived
     * from the specified <code>double</code>, which is converted to a
     * string as defined in section 15.18.1.1 of
     * <cite>The Java&trade; Language Specification</cite>.
     *
     * @param detailMessage value to be used in constructing detail message
     */
    public AssertionError(double detailMessage) {
        this(String.valueOf(detailMessage));
    }


    public AssertionError(String message, Throwable cause) {
        super(message, cause);
    }
}
