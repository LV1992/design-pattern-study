package proxy.demo;

/**
 * 代理类
 */
public class ProxySubject implements Subject {

    private Subject subject;

    public ProxySubject(Subject subject) {
        this.subject = subject;
    }

    @Override
    public void operate() {
        System.out.println("开始代理前");
        subject.operate();
        System.out.println("开始代理后");
    }
}
