package java.util;

/**
 * TooManyListenersException异常用作Java事件模型的一部分，
 * 用于注释和实现组播事件源的单播特殊情况。
 *
 * 在通常的多播“void addXyzEventListener”事件侦听器注册模式的任何给定具体实现中
 * 存在“throws TooManyListenersException”子句用于将该接口注释为实现单播侦听器特殊情况，
 * 即，该唯一的一个侦听器可能同时在特定事件侦听器源上注册。
 */
public class TooManyListenersException extends Exception {
    private static final long serialVersionUID = 5074640544770687831L;

    public TooManyListenersException() {
        super();
    }

    public TooManyListenersException(String s) {
        super(s);
    }
}
