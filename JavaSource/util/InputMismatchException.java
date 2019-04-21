package java.util;

public class InputMismatchException extends NoSuchElementException {
    private static final long serialVersionUID = 8811230760997066428L;


    /**
     * 构造一个以null作为错误信息的InputMismatchException
     */
    public InputMismatchException() {
        super();
    }


    public InputMismatchException(String s) {
        super(s);
    }
}
