package adapter.classadapter;

/**
 * 适配器1
 */
public class AdapterOne implements AdaptTarget{

    public void adaptRequest(){
        System.out.println("适配器1开始，适配了");
    }

    @Override
    public void request() {
        adaptRequest();
    }
}
