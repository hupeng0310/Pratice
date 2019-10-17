package demo.Thread.Lock;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class SellTicketDemo {
	public static int tickets = 100;
	public static Lock lock = new ReentrantLock();
    public static String sellTicket(){
        try {
            //由于一百张票数量过少，cpu切换线程的次数较少，休眠已降低线程的执行速度
            Thread.sleep(20);
            return ("已成功售票，剩余票量"+--tickets+"张");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return "发生错误，售票失败";
    }
	public static void main(String[] args) {
		new Thread(new Runnable() {
			public void run() {
				while(true) {
					lock.lock();
					if(tickets <= 0) {
						break;
					}
					System.out.println("1号窗口" + sellTicket());
					lock.unlock();
				}
			}
		}).start();
		new Thread(new Runnable() {
			public void run() {
				while(true) {
					lock.lock();
					if(tickets <= 0) {
						break;
					}
					System.out.println("2号窗口" + sellTicket());
					lock.unlock();
				}
			}
		}).start();
	}

}
