package demo.Thread.Runnable;

public class MyThread extends Thread{
    @Override
    public void run(){
        System.out.println("这是测试线程，基于继承了Thread类的MyThread类");
    }
}
