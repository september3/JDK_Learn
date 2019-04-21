package java.util;

/**
 * 当精度比其他 -1负值未经检查的异常，转换不支持的精度，或者值在其他方面不受支持。
 */
public class IllegalFormatPrecisionException extends IllegalFormatException {

    private static final long serialVersionUID = 18711008L;

    //Precision 精度
    private int p;


    public IllegalFormatPrecisionException(int p) {
        this.p = p;
    }


    public int getPrecision() {
        return p;
    }

    public String getMessage() {
        return Integer.toString(p);
    }
}
