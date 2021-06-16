package adapter.classadapter;

/**
 * 适配目标
 */
public class AdapterTest {

    public static void main(String[] args) {
        AdaptTarget adapter = new AdapterOne();
        adapter.request();
    }

}
