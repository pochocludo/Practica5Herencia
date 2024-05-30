/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package uabc.p5herencia;

/**
 *
 * @author jossu
 */
public class Smartphone extends Computadora {
    private final Sensor sensorDeHuella;
    private final Pantalla pantalla;
    public Smartphone(String fabricante, String numeroSerie, String marca, String nombre, float costo, 
                      Microprocesador cpu, long ramMB, Sensor sensorDeHuella, Pantalla pantalla) {
        super(fabricante, numeroSerie, marca, nombre, costo, cpu, ramMB);
        this.sensorDeHuella = sensorDeHuella;
        this.pantalla = pantalla;
    }

    public Sensor getSensorDeHuella() {
        return sensorDeHuella;
    }

    @Override
    public String toString() {
        return super.toString()+ "Smartphone{" + "sensorDeHuella=" + sensorDeHuella + ", pantalla=" + pantalla + '}';
    }

    public Pantalla getPantalla() {
        return pantalla;
    }
    
}