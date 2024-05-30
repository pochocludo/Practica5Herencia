/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package uabc.p5herencia;

/**
 *
 * @author jossu
 */
public class Television extends DispositivoElectronicoDeConsumo {
   
    private final Pantalla pantalla;

    
    public Television(String fabricante, String numeroSerie, String marca, String nombre, float costo, Pantalla pantalla) {
        super(fabricante, numeroSerie, marca, nombre, costo);
        this.pantalla = pantalla;
    }

    @Override
    public String toString() {
        return super.toString()+ "Television{" + "pantalla=" + pantalla + '}';
    }

    
    public Pantalla getPantalla() {
        return pantalla;
    }
}