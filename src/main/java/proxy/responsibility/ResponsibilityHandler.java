package proxy.responsibility;

/**
 * 责任链处理者抽象类
 */
public abstract class ResponsibilityHandler {

    private ResponsibilityHandler responsibilityHandler;

    public void setNextHandler(ResponsibilityHandler nextHandler) {
        this.responsibilityHandler = nextHandler;
    }

    public ResponsibilityHandler getNextHandler() {
        return responsibilityHandler;
    }

    /**
     * 处理方法
     */
    public abstract void handle(String request);
}
