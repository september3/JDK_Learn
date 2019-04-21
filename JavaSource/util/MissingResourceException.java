package java.util;

/**
 * 资源缺失异常 MissingResourceException
 */
public class MissingResourceException extends RuntimeException {


    /**
     * 构造一个具有特定信息的MissingResourceException
     * @param s detail message
     * @param className className
     * @param key 缺失资源的key
     */
    public MissingResourceException(String s, String className, String key) {
        super(s);
        this.className = className;
        this.key = key;
    }


    MissingResourceException(String message, String className, String key, Throwable cause) {
        super(message, cause);
        this.className = className;
        this.key = key;
    }


    /**
     * 获取构造函数传递的参数
     * @return
     */
    public String getClassName() {
        return className;
    }

    public String getKey() {
        return key;
    }

    //============ privates ============

    private static final long serialVersionUID = -4876345176062000401L;


    /**
     * 用户请求的资源包的类名
     */
    private String className;


    /**
     * 用户请求的特定资源的名称
     */
    private String key;
}
