/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package uabc.p5herencia;

/**
 *
 * @author jossu
 */
public class Sensor extends ComponenteElectronico {
    private final String tipo;
    private final String unidadDeMedida;
    private final int valor;


    public Sensor(String fabricante, String numeroSerie, String marca, String nombre, float costo,
                  String tipo, String unidadDeMedida, int valor) {
        super(fabricante, numeroSerie, marca, nombre, costo);
        this.tipo = tipo;
        this.unidadDeMedida = unidadDeMedida;
        this.valor = valor;
    }

    public String getTipo() {
        return tipo;
    }

    public String getUnidadDeMedida() {
        return unidadDeMedida;
    }

    public int getValor() {
        return valor;
    }

    @Override
    public String toString() {
        return super.toString()+ "Sensor{" + "tipo=" + tipo + ", unidadDeMedida=" + unidadDeMedida + ", valor=" + valor + '}';
    }
    
}
