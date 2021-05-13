package proxy.jdk;

/**
 * 客户端类
 * 动态代理和静态代理的区别是：
 * 静态代理需要手动调用代理对象的方法完成代理，如果被代理类新增了方法，则代理类需要同步新增该方法；
 * 动态代理的代理类无需实现和实际主题类相同的接口，只需要实现jdk的invocationHandler接口；
 * 实例化代理对象是由jdk内部接口来完成
 */
public class RunDemoJdkProxy {

    public static void main(String[] args) {
        DemoJdkProxy jdkProxy = new DemoJdkProxy();
        DemoJdkSubject instance = jdkProxy.getInstance(new DemoJdkRealSubject());
        instance.operate();
    }
}
