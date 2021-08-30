
package prog3tp2parteb;

import java.util.List;

/*
 * @author JuliKM
 */
public class Empleado {

    private String nombre;
    private long cuit;
    private String domicilio;
    private String email;

    public Empleado() {
    }

    public Empleado(String nombre, long cuit, String domicilio, String email) {
        this.nombre = nombre;
        this.cuit = cuit;
        this.domicilio = domicilio;
        this.email = email;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public long getCuit() {
        return cuit;
    }

    public void setCuit(long cuit) {
        this.cuit = cuit;
    }

    public String getDomicilio() {
        return domicilio;
    }

    public void setDomicilio(String domicilio) {
        this.domicilio = domicilio;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    
    public List<Asistencia> getAsistenciaXMesXAnio(int mes, int anio){

        return null;
    }
    public List<Tardanza> getDiasConTardanza(int mes, int anio){

        return null;
    }
}
