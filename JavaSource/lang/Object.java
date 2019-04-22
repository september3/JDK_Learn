package java.lang;

/**
 * Object工具类
 */
public class Object {

    private static native void registerNatives();
    static {
        registerNatives();
    }

    /**
     * 返回当前object的运行时类
     * 实际结果的类型是Class<? extends |X|>其中|X|是静态类型上其表达的擦除getClass被调用
     * Number n = 0;
     * Class<? extends Number> c = n.getClass();
     * @return
     */
    public final native Class<?> getClass();

    /**
     * 返回当前对象的hashcode
     *      1、只要在执行Java应用程序时多次在同一个对象上调用该方法，hashCode方法必须始终
     *      返回相同的整数，前提是修改了对象中equals比较中的信息。
     *      2、如果根据equals(Object)方法两个对象相等，则在两个对象中的每个对象上
     *      调用hashCode方法必须产生相同的整数结果。
     * @return
     */
    public native int hashCode();

    /**
     * 判断指定对象和当前对象是否相等
     * equals方法在非空对象引用上实现等价关系：
     * 自反性 ：对于任何非空的参考值x ， x.equals(x)应该返回true 。
     * 对称性：对于任何非空引用值x和y ， x.equals(y)应该返回true当且仅当y.equals(x)返回true 。
     * 传递性 ：对于任何非空引用值x ， y和z ，如果x.equals(y)回报true个y.equals(z)返回true ，然后x.equals(z)应该返回true 。
     * 它是一致的 ：对于任何非空引用值x和y ，多次调用x.equals(y)始终返回true或始终返回false ，没有设置中使用的信息equals比较上的对象被修改。
     * 对于任何非空的参考值x ， x.equals(null)应该返回false
     * @param obj
     * @return
     */
    public boolean equals(Object obj) {
        return (this == obj);
    }


    /**
     * 创建并返回此对象的副本
     * 该方法执行的是浅拷贝
     * @return
     * @throws CloneNotSupportedException 如果对象的类不支持Cloneable接口。 覆盖clone方法的子类也可以抛出此异常以指示实例无法克隆
     */
    protected native Object clone() throws CloneNotSupportedException;

    /**
     * 返回对象的字符串表示形式
     * @return
     */
    public String toString() {
        return getClass().getName() + "@" + Integer.toHexString(hashCode());
    }


    /**
     /* *
     * 唤醒正在等待对象监视器的单个线程
     * 如果任何线程正在等待这个对象，其中任意一个被选择被唤醒
     * @throws java.lang.IllegalMonitorStateException 如果当前线程不是此对象的监视器的所有者
     */
    public final native void notify();

    /**
     * 唤醒正在等待对象监视器的所有线程
     */
    public final native void notifyAll();

    /**
     * 导致当前线程等待，直到另一个线程调用此对象的notify()方法或notifyAll()方法，或指定的时间已过。
     * 当前的线程必须拥有该对象的monitor
     *
     * 此方法使当前线程（称为T ）将其放置在该对象的等待集中，然后放弃对该对象的任何和所有同步声明。 线程T变得禁用线程调度目的，并且休眠，直到发生四件事情之一：
     *
     * 一些其他线程调用该对象的notify方法，并且线程T恰好被任意选择为被唤醒的线程。
     * 某些其他线程调用此对象的notifyAll方法。
     * 一些其他线程interrupts线程T。
     * 指定的实时数量已经过去，或多或少。 然而，如果timeout为零，则不考虑实时，线程等待直到通知。
     * 然后从该对象的等待集中删除线程T ，并重新启用线程调度。 然后它以通常的方式与其他线程竞争在对象上进行同步的权限; 一旦获得了对象的控制，其对对象的所有同步声明就恢复到现状 - 也就是在调用wait方法之后的情况。 线程T然后从调用wait方法返回。 因此，从返回wait方法，对象和线程的同步状态T正是因为它是当wait被调用的方法。
     * @param timeout
     * @throws InterruptedException
     */
    public final native void wait(long timeout) throws InterruptedException;


    public final void wait(long timeout, int nanos) throws InterruptedException {
        if (timeout < 0) {
            throw new IllegalArgumentException("timeout value is negative");
        }

        if (nanos < 0 || nanos > 999999) {
            throw new IllegalArgumentException(
                                "nanosecond timeout value out of range");
        }

        if (nanos >= 500000 || (nanos != 0 && timeout == 0)) {
            timeout++;
        }

        wait(timeout);
    }


    public final void wait() throws InterruptedException {
        wait(0);
    }

    /**
     * 当垃圾收集确定不再有对该对象的引用时，垃圾收集器在对象上调用该对象。
     *
     * finalize方法从不被任何给定对象的Java虚拟机调用多次。
     *
     * finalize方法抛出的任何异常都会导致该对象的终止被停止，否则被忽略。
     * @throws Throwable
     */
    protected void finalize() throws Throwable { }
}
