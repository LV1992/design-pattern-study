package proxy.observe;

/**
 * 观察者模式，观察者(具体观察者)
 */
public class Observe2 implements Observe{

    @Override
    public void response() {
        System.out.println("观察者2作出响应");
    }
}
