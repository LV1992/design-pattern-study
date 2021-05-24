package proxy.responsibility;

/**
 * 责任链处理者类1
 */
public class OneHandler extends ResponsibilityHandler {

    @Override
    public void handle(String request) {
        if ("one".equals(request)) {
            System.out.println("第一个处理者处理===");
        } else {
            System.out.println("不需要第一个处理者处理===");
        }
        ResponsibilityHandler nextHandler = getNextHandler();
        if (nextHandler != null) {
            nextHandler.handle(request);
        }
    }
}
