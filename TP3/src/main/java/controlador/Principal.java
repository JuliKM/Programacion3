package controlador;

import java.util.GregorianCalendar;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import modelo.Empleado;
import sun.util.calendar.Gregorian;

public class Principal {

    private static EntityManager manager;
    private static EntityManagerFactory emf;

    public static void main(String[] args) {

        emf = Persistence.createEntityManagerFactory("Persistencia");
        manager = emf.createEntityManager();

       
    }

  

}
