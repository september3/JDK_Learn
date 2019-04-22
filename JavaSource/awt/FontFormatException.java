package java.awt;

public class FontFormatException extends Exception {

    private static final long serialVersionUID = -4481290147811361272L;

    /**
     * 构造具有特定原因的FontFarmatException
     * @param reason 表明font不被接受的原因
     */
    public FontFormatException(String reason) {
      super (reason);
    }
}
