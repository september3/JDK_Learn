package java.util;

public class IllegalFormatCodePointException extends IllegalFormatException {

    private static final long serialVersionUID = 19080630L;
    //非法code point
    private int c;


    /**
     *返回由 Character.isValidCodePoint(int)定义的非法代码点
     * @param c 非法的代码点
     */
    public IllegalFormatCodePointException(int c) {
        this.c = c;
    }


    /**
     * 返回由Character#isValidCodePoint定义的非法code point
     * @return 非法code point
     */
    public int getCodePoint() {
        return c;
    }

    public String getMessage() {
        return String.format("Code point = %#x", c);
    }
}
