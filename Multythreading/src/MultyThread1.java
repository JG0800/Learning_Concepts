public class MultyThread1 extends Thread{

    private int threadNumber;

    public MultyThread1(int threadNumber){
        this.threadNumber = threadNumber;
    }
    @Override
    public void run(){
        for (int i = 1; i <= 5; i++){
            System.out.println(i + " from Thread: " + threadNumber);
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
