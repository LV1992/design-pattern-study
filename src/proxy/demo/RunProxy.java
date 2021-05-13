package proxy.demo;

/**
 * 开始代理,这种实现为静态代理，代理类和具体实现类要实现同一个接口，以保证代理类和委托的类表现一致
 */
public class RunProxy {
    public static void main(String[] args) {
        Subject subject = new RealSubject();
        ProxySubject proxySubject = new ProxySubject(subject);
        proxySubject.operate();
    }
}
