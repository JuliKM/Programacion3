package modelo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.PrimaryKeyJoinColumn;

@Entity
@PrimaryKeyJoinColumn(name = "id_persona")
public class Empleado extends Persona {

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_empleado", unique = true, nullable = false)
    private int idExpleado;
   
    @Column(name = "nro", unique = true, nullable = false,length = 10)
    private int nroLegajo;
    
    @Column(name = "sueldo",length = 10)
    private double sueldo;

    public int getIdExpleado() {
        return idExpleado;
    }

    public void setIdExpleado(int idExpleado) {
        this.idExpleado = idExpleado;
    }

    public int getNroLegajo() {
        return nroLegajo;
    }

    public void setNroLegajo(int nroLegajo) {
        this.nroLegajo = nroLegajo;
    }

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

}
