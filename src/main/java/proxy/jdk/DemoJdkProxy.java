package proxy.jdk;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * 基于jdk的动态代理实现例子（jdk动态代理只能对接口进行代理）
 * 1.提供实例化代理对象的getInstance方法，外部调用该方法来获取代理对象
 * 2.重写InvocationHandler的invoke方法，调用method.invoke
 */
public class DemoJdkProxy implements InvocationHandler {

    /**
     * 代理对象，这里需要外部调用getInstance来初始化
     */
    private DemoJdkSubject demoJdkSubject;

    public DemoJdkSubject getInstance(DemoJdkSubject subject) {
        demoJdkSubject = subject;
        Class<? extends DemoJdkSubject> clazz = subject.getClass();
        ClassLoader classLoader = clazz.getClassLoader();
        Class<?>[] interfaces = clazz.getInterfaces();
        //主要使用jdk这个方法来实例化代理对象（实例化接口）
        DemoJdkSubject instance = (DemoJdkSubject)Proxy.newProxyInstance(classLoader, interfaces, this);
        return instance;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("开始代理前");
        //这里调用了jdk的invoke方法，回调代理对象
        Object invoke = method.invoke(demoJdkSubject, args);
        System.out.println("代理后");
        return invoke;
    }
}
