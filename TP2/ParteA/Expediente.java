package prog3tp2;

import java.util.ArrayList;
import java.util.List;

/*
 * @author JuliKM
 */
public class Expediente {

    private int id;
    private String letra;
    private int numero;
    private String descripcion;
    private String tipo;
    private String ambito;
    private ArrayList<Control> controles = new ArrayList();
      private List<Expediente> expedientes = new ArrayList<>();

    private List controlesObligatorios;

    public Expediente(int id, String letra, int numero, String descripcion, String tipo, String ambito, List controlesObligatorios) {
        this.id = id;
        this.letra = letra;
        this.numero = numero;
        this.descripcion = descripcion;
        this.tipo = tipo;
        this.ambito = ambito;
        this.controlesObligatorios = controlesObligatorios;
    }

    public String getCaratulaExpediente() {
        return this.numero + "-" + this.letra + "-" + this.descripcion;
    }

    
    
    public String getControlesObligatorios() {
        for (Control c : controles) {
            if (c.esObligatorio() == true) {
                //controlesObligatorios.add(controle);
                return c.getDenominacion() + ", ";
            }
        }
        return "";
    }
    
    public boolean getEstadoControles() {
        for (Control c : controles) {
            if ((c.esObligatorio() == true) && c.getEstadoControl().isAprobado()){
                return true;
            }
        }
        return false;
    }
    
    public List <Expediente> listaExpedientes(){
        List<Expediente> lista = new ArrayList<>();
        recursionLista(this, lista);
        return this.expedientes;
    }
    
    public void recursionLista(Expediente exp, List<Expediente> listaExpedientes){
        listaExpedientes.add(exp);
        if (exp.getExpedientes() != null){
            for (Expediente expediente : exp.getExpedientes()) {
                recursionLista(expediente, listaExpedientes);
            }
        }
    }

    public List<Expediente> getExpedientes() {
        return expedientes;
    }

    public void setExpedientes(List<Expediente> expedientes) {
        this.expedientes = expedientes;
    }

}
