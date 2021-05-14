package proxy.cglib;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

public class RunProxySampleClass {

    public static void main(String[] args) {
        Enhancer enhancer = new Enhancer();
        //设置父类
        enhancer.setSuperclass(SampleClass.class);
        //具体代理开始
        enhancer.setCallback(new MethodInterceptor() {
            @Override
            public Object intercept(Object o, Method method, Object[] args, MethodProxy methodProxy) throws Throwable {
                System.out.println("开始代理");
                //回调父类
                Object invoke = methodProxy.invokeSuper(o, args);
                System.out.println("代理结束");
                return invoke;
            }
        });
        //获取被代理的对象
        SampleClass sampleClass = (SampleClass) enhancer.create();
        sampleClass.runIt();
    }
}
