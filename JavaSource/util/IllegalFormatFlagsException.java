package java.util;

/**
 * 提供非法组合标志时抛出未检查的异常
 */
public class IllegalFormatFlagsException extends IllegalFormatException {

    private static final long serialVersionUID = 790824L;
    //包含非法组合的格式标志集
    private String flags;

    /**
     * 使用指定的标志构造此类的实例
     * @param f
     */
    public IllegalFormatFlagsException(String f) {
        if (f == null)
            throw new NullPointerException();
        this.flags = f;
    }

    /**
     * 返回包含非法组合的标志集。
     * @return
     */
    public String getFlags() {
        return flags;
    }

    public String getMessage() {
        return "Flags = '" + flags + "'";
    }
}
