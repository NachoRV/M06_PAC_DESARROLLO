import dto.Alumno;
import dto.Modulo;
import dto.Profesor;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.omg.PortableServer.LIFESPAN_POLICY_ID;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class HibernateMain {

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        List l = new ArrayList();
        Modulo m = new Modulo();
        m.setCodigo("M06");
        m.setNombre("Acceso a datos");
        Modulo m2 = new Modulo();
        m.setCodigo("M08");
        m.setNombre("Programación multimedia");
        l.add(m);
        l.add(m2);

        Alumno a = new Alumno();
        a.setEdad(22);
        a.setModulos(l);
        a.setNacionalidad("Español");
        a.setNombre("Ignacio Royo-Villanova");
        a.setSexo("Hombre");

        Profesor p = new Profesor();
        p.setNombre("Alvaro");
        p.setSexo("Hombre");


        Configuration cfg = new Configuration().configure();
        SessionFactory sessionFactory = cfg.buildSessionFactory(new StandardServiceRegistryBuilder().configure().build());
        Session session = sessionFactory.openSession();
        Transaction tx = session.beginTransaction();
        session.save(m);
        session.save(a);
        session.save(p);
        tx.commit();
        session.close();
        sessionFactory.close();

        serializar s = new serializar();
        s.serializarObjeto(m, "modulo.dat");
        s.serializarObjeto(a, "alumno.dat");
        s.serializarObjeto(p, "profesor.dat");

        s.leerObjetos();


    }

}
