/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package serializacion;

import java.io.*;
public class PersistenciaUsuarios {
    Usuario u;
    //generamos el metodo para serializar nuestro usuario
public  void guardar(){
        //para serializar el primer paso es generar el archivo fisico donde estara noestro objeto  de tipo usuario
        File file=new File("archivaldo.yo");
        //despues lo abrimos para escribir sobre el y la clase se llama FileOutputStream esta se ocupa mucho en java
        try {
        FileOutputStream fos = new FileOutputStream(file);
                //luego lo serializamos
                ObjectOutputStream oos=new ObjectOutputStream(fos);
        //guardamos nuestros usuarios
        oos.writeObject(u);
        //ponemos un mensaje
            System.out.println("objeto guardado con exito()");
    } catch (Exception e) {
       
    }
}
        
    
    public Usuario getU() {
        return u;
    }

    public void setU(Usuario u) {
        this.u = u;
    }
    
        
    
}
