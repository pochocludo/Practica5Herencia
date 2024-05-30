/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package uabc.p5herencia;

/**
 *
 * @author jossu
 */
import java.util.ArrayList;
public class DispositivoElectronico {
     private final String fabricante;
    private final String numeroSerie;
    private final String marca;
    private final String nombre;
    private float costo;
    private ArrayList<ComponenteElectronico> componentes;

    // Constructor
    public DispositivoElectronico(String fabricante, String numeroSerie, String marca, String nombre, float costo) {
        this.fabricante = fabricante;
        this.numeroSerie = numeroSerie;
        this.marca = marca;
        this.nombre = nombre;
        this.costo = costo;
        this.componentes = new ArrayList<>();
    }

    // Getters
    public String getFabricante() {
        return fabricante;
    }

    public String getNumeroSerie() {
        return numeroSerie;
    }

    public String getMarca() {
        return marca;
    }

    public String getNombre() {
        return nombre;
    }

    public float getCosto() {
        return costo;
    }


    public void agregarComponente(ComponenteElectronico componente) {
        componentes.add(componente);
    }


    public void quitarComponente(ComponenteElectronico componente) {
        componentes.remove(componente);
    }

    public ArrayList<ComponenteElectronico> getComponentes() {
        return componentes;
    }

    @Override
    public String toString() {
        return "DispositivoElectronico{" + "fabricante=" + fabricante + ", numeroSerie=" + numeroSerie + ", marca=" + marca + ", nombre=" + nombre + ", costo=" + costo + ", componentes=" + componentes + '}';
    }
    
}
