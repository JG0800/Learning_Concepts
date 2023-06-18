public class Multythreading {
    public static void main(String[] args) {

        for (int i = 0; i <= 5; i++){
            MultyThread2 thread = new MultyThread2(i);
//            thread.start(); //alternativ
            Thread myThread = new Thread(thread);
            myThread.start();

            //freeze the Program until the thread is done
            try {
                myThread.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
