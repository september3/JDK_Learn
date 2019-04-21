package java.util;


public class FormatFlagsConversionMismatchException extends IllegalFormatException {
    private static final long serialVersionUID = 19120414L;

    //标志
    private String f;
    //转换
    private char c;

    /***
     * 构造具有指定标志和转换方式的FormatFlagsConversionMismatchException
     * @param f f
     * @param c c
     */
    public FormatFlagsConversionMismatchException(String f, char c) {
        if (f == null)
            throw new NullPointerException();
        this.f = f;
        this.c = c;
    }


    /**
     * 返回不相容的标志
     * @return
     */
     public String getFlags() {
        return f;
    }

    /**
     *返回不相容的转换
     * @return
     */
    public char getConversion() {
        return c;
    }

    public String getMessage() {
        return "Conversion = " + c + ", Flags = " + f;
    }
}
