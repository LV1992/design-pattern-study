package proxy.observe;

import java.util.ArrayList;
import java.util.List;

/**
 * 抽象主题
 */
public abstract class AbstractSubject {

    List<Observe> observeList = new ArrayList<>();

    protected void addObserve(Observe o){
        observeList.add(o);
    }

    protected void removeObserve(Observe o){
        observeList.remove(o);
    }

    /**
     * 通知所有观察者
     */
    abstract void notifyAllObserve();

}
