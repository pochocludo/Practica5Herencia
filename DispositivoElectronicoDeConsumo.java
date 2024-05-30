/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package uabc.p5herencia;

/**
 *
 * @author jossu
 */
public class DispositivoElectronicoDeConsumo extends DispositivoElectronico {
    private boolean encendido;

    public DispositivoElectronicoDeConsumo(String fabricante, String numeroSerie, String marca, String nombre, float costo) {
        super(fabricante, numeroSerie, marca, nombre, costo);
        this.encendido = false; 
    }

    public void encender() {
        this.encendido = true;
    }

    public void apagar() {
        this.encendido = false;
    }

    public boolean isEncendido() {
        return encendido;
    }

    @Override
    public String toString() {
        return super.toString()+ "DispositivoElectronicoDeConsumo{" + "encendido=" + encendido + '}';
    }
    
}
