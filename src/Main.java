import java.util.concurrent.TimeUnit;


public class Main {

    private Boolean flag = true;

    public static void main(String[] args) throws Exception {
//        System.out.println(Integer.MAX_VALUE);
        Main ts = new Main();
        ts.test();
        for (; ; ) {
            System.out.println("thread: " + Thread.currentThread().getName());
            TimeUnit.SECONDS.sleep(10);
        }
    }

    public void test() throws Exception {
        Thread testThread = new Thread(new Runnable() {
            public void run() {
                int i = 0;
                while (flag) {
                    i++;
//                    System.out.println(Thread.currentThread().getName() + ",flag:" + flag + "i:" + i);
                }
            }
        });
        testThread.start();
        TimeUnit.SECONDS.sleep(1);
//        System.out.println(Thread.currentThread().getName() + ",flag:" + flag );
        flag = false;
    }
}
