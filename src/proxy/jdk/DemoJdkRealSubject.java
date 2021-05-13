package proxy.jdk;

/**
 * jdk动态代理的主题实现
 */
public class DemoJdkRealSubject implements DemoJdkSubject{

    @Override
    public void operate() {
        System.out.println("正在执行被代理实现");
    }
}
