package java.util;

/**
 * UnknownFormatConversionException  未知格式扎转换异常
 */
public class UnknownFormatConversionException extends IllegalFormatException {

    private static final long serialVersionUID = 19060418L;

    //Unknown conversion 未知转换
    private String s;

    public UnknownFormatConversionException(String s) {
        if (s == null) {
            throw new NullPointerException();
        }
        this.s = s;
    }

    public String getConversion() {
        return s;
    }

    // javadoc inherited from Throwable.java
    public String getMessage() {
        return String.format("Conversion = '%s'", s);
    }
}
