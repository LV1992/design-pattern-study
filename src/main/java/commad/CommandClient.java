package commad;

/**
 * 最终调用类
 */
public class CommandClient {

    public static void main(String[] args) {
        CommandInvoker commandInvoker = new CommandInvoker();
        commandInvoker.setCommand(new CommandA());
        commandInvoker.handle();
    }
}
