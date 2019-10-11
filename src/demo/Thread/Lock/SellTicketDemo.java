package demo.Thread.Lock;

public class SellTicketDemo {
    //Object对象，用于同步锁
    public static Object LOCK = new Object();
    private static int tickets = 100;
    public static String sellTicket(){
        try {
            //由于一百张票数量过少，cpu切换线程的次数较少，休眠已降低线程的执行速度
            Thread.sleep(20);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return ("已成功售票，剩余票量"+--tickets+"张");
    }
    public static void main(String[] args){
        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                while (true){
                    synchronized (LOCK){
                        if(tickets <= 0){
                            break;
                        }
                        System.out.println("1号窗口" + sellTicket());
                    }
                }
            }
        });
        Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                while (true){
                    synchronized (LOCK){
                        if(tickets <= 0){
                            break;
                        }
                        System.out.println("2号窗口" + sellTicket());
                    }
                }
            }
        });
        thread1.start();
        thread2.start();
    }
}
