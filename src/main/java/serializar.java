import dto.Alumno;
import dto.Modulo;
import dto.Profesor;

import java.io.*;


public class serializar {

    public< C > void serializarObjeto(Object C , String fichero) throws IOException {
        ObjectOutputStream escribiendoFichero = new ObjectOutputStream(new FileOutputStream(fichero, false));
        escribiendoFichero.writeObject(C);
        escribiendoFichero.close();
    }

    public void leerObjetos ( ) throws IOException, ClassNotFoundException {

        ObjectInputStream leyendoFicheroAlumno = new ObjectInputStream(new FileInputStream("alumno.dat") );
        ObjectInputStream leyendoFicheroProfesor = new ObjectInputStream(new FileInputStream("profesor.dat") );
        ObjectInputStream leyendoFicheroModulo = new ObjectInputStream(new FileInputStream("modulo.dat") );
        Alumno a = (Alumno) leyendoFicheroAlumno.readObject();
        Profesor p = (Profesor) leyendoFicheroProfesor.readObject();
        Modulo m = (Modulo) leyendoFicheroModulo.readObject();
        leyendoFicheroAlumno.close();

        System.out.println( a.toString());
        System.out.println( p.toString());
        System.out.println( m.toString());

    }
}
