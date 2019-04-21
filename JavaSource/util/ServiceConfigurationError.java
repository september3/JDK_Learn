
public class ServiceConfigurationError extends Error {

    private static final long serialVersionUID = 74132770414881L;

    /**
     * 构建一个具有特定信息的NoSuchElementException
     * @param msg
     */
    public ServiceConfigurationError(String msg) {
        super(msg);
    }

    public ServiceConfigurationError(String msg, Throwable cause) {
        super(msg, cause);
    }

}
