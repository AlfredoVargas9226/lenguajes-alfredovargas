
package thread1;

public class TareaX extends Thread{

    @Override
    public void run() {
        
        System.out.println("Soy un thread muy sencillito"
                + "y me llamo " + Thread.currentThread().getName());
        
    }
    
}
