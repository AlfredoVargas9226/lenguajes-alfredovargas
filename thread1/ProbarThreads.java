
package thread1;

import java.time.LocalTime;
import java.util.logging.Level;
import java.util.logging.Logger;


//Segunda forma de crear threads: Implementando la interface Runnable
public class ProbarThreads implements Runnable {
    public static void main(String[] args) {
        
        //1.- Crear el thread
        TareaX t1 = new TareaX();
        TareaX t2 = new TareaX();
        Runnable r = new ProbarThreads();
        Thread t3 = new Thread(r);
        
        Thread t4 = new Thread( new Runnable() {
            @Override
            public void run() {
                
            }
        });
        
        //2. Inicializado
        t1.setName("Floky");
        t1.start();
        t2.start();
        t3.start();
        t4.start();
        
        //3. En ejecucion lo da la JVM decide
        
        //4. Pausa no lo vamos a poner aqui, es en caso de que haga algo
        //que dure cierto tiempo
        
        //5. Su muerte es cuando termina su proceso
    }

    @Override
    public void run() {
        
        while(true){
            LocalTime tiempo = LocalTime.now();
            int hora = tiempo.getHour();
            int minutos = tiempo.getMinute();
            int segundos = tiempo.getSecond();
            System.out.println("La hora es: " + hora + ":" + minutos + ":" + segundos);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException ex) {
                Logger.getLogger(ProbarThreads.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
        
    }
}
