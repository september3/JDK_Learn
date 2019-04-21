package java.util;

import java.io.NotSerializableException;
import java.io.IOException;

/**
 * 表明操作无法完成，因为输入不符合相应的XML文档类型属性的集合
 */
public class InvalidPropertiesFormatException extends IOException {

    private static final long serialVersionUID = 7763056076009360219L;


    public InvalidPropertiesFormatException(Throwable cause) {
        super(cause==null ? null : cause.toString());
        this.initCause(cause);
    }


    public InvalidPropertiesFormatException(String message) {
        super(message);
    }

    private void writeObject(java.io.ObjectOutputStream out)
        throws NotSerializableException
    {
        throw new NotSerializableException("Not serializable.");
    }


    /**
     *
     * @param in
     * @throws NotSerializableException 因为InvalidPropertiesFormatException对象不是可序列化的
     */
    private void readObject(java.io.ObjectInputStream in)
            throws NotSerializableException
    {
        throw new NotSerializableException("Not serializable.");
    }

}
