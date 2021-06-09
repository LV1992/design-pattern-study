package proxy.responsibility;

/**
 * 责任链处理者类2
 */
public class TwoHandler extends ResponsibilityHandler {

    @Override
    public void handle(String request) {
        if ("two".equals(request)) {
            System.out.println("第二个处理者处理===");
        } else {
            System.out.println("不需要第二个处理者处理===");
        }
        ResponsibilityHandler nextHandler = getNextHandler();
        if (nextHandler != null) {
            nextHandler.handle(request);
        }
    }
}
