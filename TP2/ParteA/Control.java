
package prog3tp1;

import prog3tp2.EstadoControl;

/*
 * @author JuliKM
 */
public class Control {

    private int id; //PK
    private String denominacion;
    private boolean esObligatorio;
    private EstadoControl estadoControl;

    public Control(int id, String denominacion, boolean esObligatorio) {
        this.id = id;
        this.denominacion = denominacion;
        this.esObligatorio = esObligatorio;
    }

    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDenominacion() {
        return denominacion;
    }

    public void setDenominacion(String denominacion) {
        this.denominacion = denominacion;
    }

    public boolean esObligatorio() {
        return esObligatorio;
    }

    public void setEsObligatorio(boolean esObligatorio) {
        this.esObligatorio = esObligatorio;
    }

    public EstadoControl getEstadoControl() {
        return estadoControl;
    }

    public void setEstadoControl(EstadoControl estadoControl) {
        this.estadoControl = estadoControl;
    }
    
    
}
