/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clases;

import java.util.logging.Level;
import java.util.logging.Logger;


/**
 *
 * @author Alumno
 */
public class Hilo extends Thread{
    Tablero lamina;
    
    public Hilo(Tablero lamina){
        
        this.lamina=lamina;
    }
    
    @Override
    public void run(){
        
        while(true){
            lamina.repaint();
            try {
                Thread.sleep(1);
            } catch (InterruptedException ex) {
                Logger.getLogger(Hilo.class.getName()).log(Level.SEVERE, null, ex);
            }
            
        }
    }
}
