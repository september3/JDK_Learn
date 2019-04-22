package java.util;

import java.util.function.Supplier;

/**
 * This class consists of {@code static} utility methods for operating
 * on objects.  These utilities include {@code null}-safe or {@code
 * null}-tolerant methods for computing the hash code of an object,
 * returning a string for an object, and comparing two objects.
 *
 * @since 1.7
 */
public final class Objects {
    private Objects() {
        throw new AssertionError("No java.util.Objects instances for you!");
    }

    /**
     * 比较两个对象是否相等
     * @param a
     * @param b
     * @return
     */
    public static boolean equals(Object a, Object b) {
        return (a == b) || (a != null && a.equals(b));
    }

    /**
     * 深层次比较两个对象是否相等
     * @param a
     * @param b
     * @return
     */
    public static boolean deepEquals(Object a, Object b) {
        if (a == b)
            return true;
        else if (a == null || b == null)
            return false;
        else
            return Arrays.deepEquals0(a, b);
    }

    /**
     * 返回指定对象的hashcode
     * @param o
     * @return
     */
    public static int hashCode(Object o) {
        return o != null ? o.hashCode() : 0;
    }


    /**
     * 为输入值序列生成哈希码。
     * 生成哈希码，就好像将所有输入值都放入数组一样，并且该数组通过调用Arrays.hashCode(Object[])进行哈希处理。
     *
     * 当提供单个对象引用时，返回的值不等于该对象引用的哈希码。
     * @param values
     * @return
     */
    public static int hash(Object... values) {
        return Arrays.hashCode(values);
    }


    public static String toString(Object o) {
        return String.valueOf(o);
    }


    public static String toString(Object o, String nullDefault) {
        return (o != null) ? o.toString() : nullDefault;
    }

    /**
     * 返回0，如果参数都是相同的， c.compare(a, b)其他。
     * 因此，如果两个参数都为null则返回0。
     * @param a
     * @param b
     * @param c
     * @param <T>
     * @return
     */
    public static <T> int compare(T a, T b, Comparator<? super T> c) {
        return (a == b) ? 0 :  c.compare(a, b);
    }

    /**
     * 检查指定的对象引用不是null 。
     * 该方法主要用于在方法和构造函数中进行参数验证，
     * 如下所示：
     *  public Foo(Bar bar) {
     *      this.bar = Objects.requireNonNull(bar);
     *  }
     *
     * @param obj 检查无效的对象引用
     * @param <T>
     * @return
     */
    public static <T> T requireNonNull(T obj) {
        if (obj == null)
            throw new NullPointerException();
        return obj;
    }

    /**
     * 带message的参数校验
     * @param obj
     * @param message
     * @param <T>
     * @return
     */
    public static <T> T requireNonNull(T obj, String message) {
        if (obj == null)
            throw new NullPointerException(message);
        return obj;
    }

    /**
     * 当object==null,返回true；否则，返回false
     * @param obj
     * @return
     */
    public static boolean isNull(Object obj) {
        return obj == null;
    }

    /**
     * 当object不为null时，返回true
     * @param obj
     * @return
     */
    public static boolean nonNull(Object obj) {
        return obj != null;
    }

    /**
     * 检查指定的对象引用不是null并抛出自定义的NullPointerException（如果是）。
     * @param obj 检查无效的对象引用
     * @param messageSupplier
     * @param <T>
     * @return
     */
    public static <T> T requireNonNull(T obj, Supplier<String> messageSupplier) {
        if (obj == null)
            throw new NullPointerException(messageSupplier.get());
        return obj;
    }
}
