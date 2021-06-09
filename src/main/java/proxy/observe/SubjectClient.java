package proxy.observe;


/**
 * 抽象主题
 */
public class SubjectClient extends AbstractSubject{

    @Override
    void notifyAllObserve() {
        for (Observe o : super.observeList){
            o.response();
        }
    }
}
