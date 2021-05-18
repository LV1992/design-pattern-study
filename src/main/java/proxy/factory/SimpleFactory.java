package proxy.factory;

/**
 * 简单工厂模式
 */
public class SimpleFactory {
    public interface Build {
        void buildProduct();
    }

    static class BuildOne implements Build {
        @Override
        public void buildProduct() {
            System.out.println("产品1");
        }
    }

    static class BuildTwo implements Build {
        @Override
        public void buildProduct() {
            System.out.println("产品2");
        }
    }

    static Build builder(int kind) {
        if (kind == 1) {
            Build build = new BuildOne();
            return build;
        } else if (kind == 2) {
            Build build = new BuildTwo();
            return build;
        } else {
            return null;
        }
    }

    public static void main(String[] args) {
        Build builder = SimpleFactory.builder(1);
        builder.buildProduct();
        Build builder2 = SimpleFactory.builder(2);
        builder2.buildProduct();
    }
}
