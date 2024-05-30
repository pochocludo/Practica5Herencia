/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package uabc.p5herencia;

/**
 *
 * @author jossu
 */
import javax.swing.*;
import java.awt.*;
public class AppDemoHerencia {
       public static void main(String[] args) {
        JFrame frame = new JFrame("Demo IU DispositivoElectronico");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(800, 600);
        frame.setLayout(new GridLayout(1, 2));  // Utilizamos un GridLayout para organizar los componentes

        // Crear objetos Pantalla, Sensor y Microprocesador
        Pantalla pantalla1 = new Pantalla("Samsung", "12345", "Samsung", "Pantalla OLED", 250.0f, 1920, 1080);
        Sensor sensor1 = new Sensor("Sony", "67890", "Sony", "Sensor de Huella", 75.0f, "Huella Digital", "DPI", 500);
        Microprocesador cpu1 = new Microprocesador("Intel", "11111", "Intel", "Core i7", 300.0f, 8, 3600L);

        // Crear objetos Television y Smartphone
        Television television = new Television("LG", "22222", "LG", "Smart TV", 800.0f, pantalla1);
        Smartphone smartphone = new Smartphone("Apple", "33333", "Apple", "iPhone 12", 999.0f, cpu1, 4000L, sensor1, pantalla1);

        // Crear IU para cada dispositivo y añadirlos al frame
        IUTelevision iuTelevision = new IUTelevision("tv_image.png", television);
        IUSmartphone iuSmartphone = new IUSmartphone("smartphone_image.png", smartphone);
        
        System.out.print(television.toString());
        System.out.print(smartphone.toString());

        frame.add(iuTelevision);
        frame.add(iuSmartphone);

        frame.setVisible(true);
    }
}