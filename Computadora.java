/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package uabc.p5herencia;

/**
 *
 * @author jossu
 */
public class Computadora extends DispositivoElectronicoDeConsumo {
    // Atributos mutables
    private Microprocesador cpu;
    private long ramMB;

    // Constructor
    public Computadora(String fabricante, String numeroSerie, String marca, String nombre, float costo, Microprocesador cpu, long ramMB) {
        super(fabricante, numeroSerie, marca, nombre, costo);
        this.cpu = cpu;
        this.ramMB = ramMB;
    }

    // Getters y setters para cpu y ramMB
    public Microprocesador getCpu() {
        return cpu;
    }

    public void setCpu(Microprocesador cpu) {
        this.cpu = cpu;
    }

    public long getRamMB() {
        return ramMB;
    }

    @Override
    public String toString() {
        return super.toString()+ "Computadora{" + "cpu=" + cpu + ", ramMB=" + ramMB + '}';
    }

    public void setRamMB(long ramMB) {
        this.ramMB = ramMB;
    }
}