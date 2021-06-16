package commad;

/**
 * 抽象command类
 */
public class CommandA extends AbstractCommand{

    @Override
    void execute() {
        Receiver receiver = new Receiver();
        receiver.action();
    }
}
