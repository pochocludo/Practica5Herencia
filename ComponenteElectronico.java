/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package uabc.p5herencia;
public class ComponenteElectronico extends DispositivoElectronico {
    // Atributo mutable
    private DispositivoElectronico esParteDe;

    // Constructor
    public ComponenteElectronico(String fabricante, String numeroSerie, String marca, String nombre, float costo) {
        super(fabricante, numeroSerie, marca, nombre, costo);
        this.esParteDe = null;
    }

    // Getter y setter para esParteDe
    public DispositivoElectronico getEsParteDe() {
        return esParteDe;
    }

    public void setEsParteDe(DispositivoElectronico esParteDe) {
        this.esParteDe = esParteDe;
    }

    @Override
    public String toString() {
        return super.toString()+ "ComponenteElectronico{" + "esParteDe=" + esParteDe + '}';
    }
    
}

