package java.awt;

/**
 * 表示AWT组件未处于所请求操作的适当状态。
 */
public class IllegalComponentStateException extends IllegalStateException {

     private static final long serialVersionUID = -1889339587208144238L;


    public IllegalComponentStateException() {
        super();
    }


    public IllegalComponentStateException(String s) {
        super(s);
    }
}
