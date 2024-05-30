/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package uabc.p5herencia;

/**
 *
 * @author jossu
 */
public class Microprocesador extends ComponenteElectronico {
    private final int cacheRAM;
    private final long velocidadHz;

    public Microprocesador(String fabricante, String numeroSerie, String marca, String nombre, float costo,
                            int cacheRAM, long velocidadHz) {
        super(fabricante, numeroSerie, marca, nombre, costo);
        this.cacheRAM = cacheRAM;
        this.velocidadHz = velocidadHz;
    }

    public int getCacheRAM() {
        return cacheRAM;
    }

    public long getVelocidadHz() {
        return velocidadHz;
    }

    @Override
    public String toString() {
        return super.toString()+ "Microprocesador{" + "cacheRAM=" + cacheRAM + ", velocidadHz=" + velocidadHz + '}';
    }
    
}
