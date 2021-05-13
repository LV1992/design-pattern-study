package proxy.demo;

/**
 * 开始代理,这种实现为静态代理，代理类和具体实现类要实现同一个接口，以保证代理类和委托的类表现一致
 * 这里是静态代理模式，代理模式的要素有subject（主题，一般是接口或抽象类）/realSubject（具体主题，具体要完成什么事）
 * /proxy（代理类，负责在代理时处理一些业务，一般实现subject接口）/client（客户端，客户端调用proxy）
 */
public class RunProxy {
    public static void main(String[] args) {
        Subject subject = new RealSubject();
        ProxySubject proxySubject = new ProxySubject(subject);
        proxySubject.operate();
    }
}
