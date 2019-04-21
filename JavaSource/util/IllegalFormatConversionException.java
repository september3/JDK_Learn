package java.util;

public class IllegalFormatConversionException extends IllegalFormatException {

    private static final long serialVersionUID = 17000126L;

    //Conversion  不适用的转换
    private char c;
    //不匹配参数的类
    private Class<?> arg;


    public IllegalFormatConversionException(char c, Class<?> arg) {
        if (arg == null)
            throw new NullPointerException();
        this.c = c;
        this.arg = arg;
    }


    public char getConversion() {
        return c;
    }

    /**
     * 返回不匹配参数的类
     * @return
     */
    public Class<?> getArgumentClass() {
        return arg;
    }

    // javadoc inherited from Throwable.java
    public String getMessage() {
        return String.format("%c != %s", c, arg.getName());
    }
}
