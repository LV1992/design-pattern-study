package observe;


/**
 * 运行demo
 */
public class RunClient {

    public static void main(String[] args) {
        AbstractSubject client = new SubjectClient();
        Observe observe1 = new Observe1();
        Observe observe2 = new Observe2();
        client.addObserve(observe1);
        client.addObserve(observe2);
        client.notifyAllObserve();
    }
}
