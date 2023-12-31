/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clases;

// IMPORTANT !!!!!!!!!
// cuando la bola toque un ladrillo, paso el ladrillo fuera de la ventana

import javax.swing.JFrame;
import clases.EventoTeclado;
/**
 *
 * @author ALUMNOS
 */
public class Panel extends JFrame{
    
    private final int ancho=810, alto=600;
    public static Tablero lamina_juego;
    public static TableroInicio lamina_inicio;
    private Hilo hilo;
    
    public Panel(){
        
        setTitle("Pong");
        setSize(ancho, alto);
        setLocationRelativeTo(null);
        setResizable(false);
        
        lamina_juego = new Tablero();
        lamina_inicio = new TableroInicio();
        
        
        
        addKeyListener(new EventoTeclado());
        
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        hilo = new Hilo(lamina_juego);
        hilo.start();
        
        setVisible(true);
    }
    
}
