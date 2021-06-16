package responsibility;

/**
 * 责任链客户端类
 */
public class ResponsibilityClient {
    public static void main(String[] args) {
        //设置责任链1
        ResponsibilityHandler oneHandler = new OneHandler();
        //设置责任链2
        ResponsibilityHandler twoHandler = new TwoHandler();
        //设置责任链1的下一个责任链2
        oneHandler.setNextHandler(twoHandler);
        //调用处理请求
        oneHandler.handle("one");
    }
}
