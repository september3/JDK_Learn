package java.util;


/**
 *当格式字符串包含与给定参数不兼容的非法语法或格式说明符时抛出未检查的异常。
 * 应该实例化仅对应于特定错误的异常的显式子类型。
 */
public class IllegalFormatException extends IllegalArgumentException {

    private static final long serialVersionUID = 18830826L;

    // package-private to prevent explicit instantiation
    //package-private以防止显式实例化
    IllegalFormatException() { }
}
