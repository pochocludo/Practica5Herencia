/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package uabc.p5herencia;

/**
 *
 * @author jossu
 */
public class Pantalla extends ComponenteElectronico {
    private final int resolucionX;
    private final int resolucionY;

    public Pantalla(String fabricante, String numeroSerie, String marca, String nombre, float costo,
                    int resolucionX, int resolucionY) {
        super(fabricante, numeroSerie, marca, nombre, costo);
        this.resolucionX = resolucionX;
        this.resolucionY = resolucionY;
    }
    
    public int getResolucionX() {
        return resolucionX;
    }

    public int getResolucionY() {
        return resolucionY;
    }

    @Override
    public String toString() {
        return super.toString()+ "Pantalla{" + "resolucionX=" + resolucionX + ", resolucionY=" + resolucionY + '}';
    }
    
}