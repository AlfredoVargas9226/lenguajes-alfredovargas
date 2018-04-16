
package Thread;

public class TerceraForma {
    
    public static void main(String args[]){
        Thread t1 = new Thread(new Runnable(){

            public void run() {
                System.out.println("Yo soy un thread bueno");
            }
            
        });
        
        t1.start();
    }
    
}
