package demo.Thread.Callab;

import java.util.concurrent.*;

public class CallableTest {
    public static void main(String[] args){
        //创建线程池
        ExecutorService executorService = Executors.newCachedThreadPool();
        //使用lambda表达式实现Callable接口
        Callable callable = ()-> "测试线程，使用lambda表达式重写了Callable的call方法";
        Future future = executorService.submit(callable);
        Future <String>future1 = executorService.submit(new CallableThread());
        try {
            System.out.println(future.get());
            System.out.println(future1.get());
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }
        //两个线程执行完毕，关闭线程池
        executorService.shutdown();
    }
}
