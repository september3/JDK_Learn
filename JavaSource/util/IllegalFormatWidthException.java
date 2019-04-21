package java.util;

/**
 * 当格式宽度比其他 -1负值或其他不受支持的未经检查的异常
 */
public class IllegalFormatWidthException extends IllegalFormatException {

    private static final long serialVersionUID = 16660902L;
    //width 宽度
    private int w;


    public IllegalFormatWidthException(int w) {
        this.w = w;
    }


    public int getWidth() {
        return w;
    }

    public String getMessage() {
        return Integer.toString(w);
    }
}
