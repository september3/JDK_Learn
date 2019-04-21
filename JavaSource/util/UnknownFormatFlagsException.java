package java.util;

/**
 * UnknownFormatFlagsException   未知格式化标志异常
 */
public class UnknownFormatFlagsException extends IllegalFormatException {

    private static final long serialVersionUID = 19370506L;

    //未知标志的格式标志集
    private String flags;

    public UnknownFormatFlagsException(String f) {
        if (f == null)
            throw new NullPointerException();
        this.flags = f;
    }


    public String getFlags() {
        return flags;
    }

    // javadoc inherited from Throwable.java
    public String getMessage() {
        return "Flags = " + flags;
    }
}
