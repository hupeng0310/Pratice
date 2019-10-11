package demo.Thread.Callab;

import java.util.concurrent.Callable;

public class CallableThread implements Callable {
    @Override
    public String call() {
        return "测试线程，基于实现了Callable接口的CallableThread类";
    }
}
