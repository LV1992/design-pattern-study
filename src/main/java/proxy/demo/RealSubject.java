package proxy.demo;

/**
 * 具体实现主题
 */
public class RealSubject implements Subject{

    @Override
    public void operate() {
        System.out.println("do it detail ...");
    }
}
