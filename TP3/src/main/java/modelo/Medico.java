package modelo;

import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ForeignKey;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

@Entity
@PrimaryKeyJoinColumn(name = "id_persona")
public class Medico extends Persona implements java.io.Serializable {

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_medico", unique = true, nullable = false)
    private int idMedico;
    @Column(name = "matricula", nullable = false, length = 10)
    private int matricula;
    @Column(name = "celular")
    private long celular;

    @JoinTable(name = "rel_medico_especialidad",
            joinColumns = @JoinColumn(name = "id_medico", nullable = false),
            inverseJoinColumns = @JoinColumn(name = "id_especialidad", nullable = false)
    )
    @ManyToMany(cascade = CascadeType.ALL)
    private List<Especialidad> especialidades;
    @OneToMany(mappedBy = "medico", cascade = CascadeType.ALL)
    private List<Turno> turno;

    public Medico() {

    }

    public int getIdMedico() {
        return idMedico;
    }

    public void setIdMedico(int idMedico) {
        this.idMedico = idMedico;
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public long getCelular() {
        return celular;
    }

    public void setCelular(long celular) {
        this.celular = celular;
    }

    public List<Especialidad> getEspecialidades() {
        return especialidades;
    }

    public void setEspecialidades(List<Especialidad> especialidades) {
        this.especialidades = especialidades;
    }

    public List<Turno> getTurno() {
        return turno;
    }

    public void setTurno(List<Turno> turno) {
        this.turno = turno;
    }

}
