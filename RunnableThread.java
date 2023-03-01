package NRaju;
 class NewThread implements Runnable{

     Thread t;

      NewThread( ) {
         t =new Thread(this,"Runnable thread");
         t.start();
     }

     @Override
    public void run() {
         System.out.println("hello");
    }
}
public class RunnableThread {
    public static void main(String[] args) {
new NewThread();
    }
}
