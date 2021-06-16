package commad;

/**
 * command调用者
 */
public class CommandInvoker {
    private AbstractCommand command;

    void setCommand(AbstractCommand command){
        this.command = command;
    }

    void handle(){
        System.out.println("调用到commandA了");
        this.command.execute();
    }

}
