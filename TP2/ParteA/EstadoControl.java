
package prog3tp2;

import java.util.ArrayList;

/*
 * @author JuliKM
 */
public class EstadoControl {

    private long id; //PK
    private boolean aprobado;
    private ArrayList<Control> controles =  new ArrayList();

    public EstadoControl(long id, boolean aprobado) {
        this.id = id;
        this.aprobado = aprobado;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public boolean isAprobado() {
        return aprobado;
    }

    public void setAprobado(boolean aprobado) {
        this.aprobado = aprobado;
    }

    public ArrayList<Control> getControles() {
        return controles;
    }

    public void setControles(ArrayList<Control> controles) {
        this.controles = controles;
    }
    
}
