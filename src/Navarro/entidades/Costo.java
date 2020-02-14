package Navarro.entidades;

/**
 *
 * @author H´P
 */
public class Costo {
    private int nro;
    private char codigo;
    private String ubicacion;
    private float costo;

    public Costo(int nro, char codigo, String ubicacion, float costo) {
        this.nro = nro;
        this.codigo = codigo;
        this.ubicacion = ubicacion;
        this.costo = costo;
    }

    public int getNro() {
        return nro;
    }

    public void setNro(int nro) {
        this.nro = nro;
    }

    public char getCodigo() {
        return codigo;
    }

    public void setCodigo(char codigo) {
        this.codigo = codigo;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    public float getCosto() {
        return costo;
    }

    public void setCosto(float costo) {
        this.costo = costo;
    }
    
    
}
