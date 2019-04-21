package java.util;

/**
 * 通过Locale和Locale.Builder中的方法抛出，以表明参数不是一个格式正确的BCP 47标签。
 */
public class IllformedLocaleException extends RuntimeException {

    private static final long serialVersionUID = -5245986824925681401L;

    private int _errIdx = -1;

    /**
     * 构造一个新的 IllformedLocaleException ，没有详细信息，-1作为错误索引。
     */
    public IllformedLocaleException() {
        super();
    }

    /**
     * 构造一个没有详细消息的新的 IllformedLocaleException和-1作为错误索引。
     * @param message
     */
    public IllformedLocaleException(String message) {
        super(message);
    }

    /**
     * 构造一个新的IllformedLocaleException与给定的消息和错误索引。
     * @param message the message
     * @param errorIndex the index
     */
    public IllformedLocaleException(String message, int errorIndex) {
        super(message + ((errorIndex < 0) ? "" : " [at index " + errorIndex + "]"));
        _errIdx = errorIndex;
    }

    /**
     * 返回发现错误的索引。 负值表示错误索引不适用或未知。
     * @return the error index
     */
    public int getErrorIndex() {
        return _errIdx;
    }
}
