package clase05;

import java.io.Serializable;
import java.text.DecimalFormat;
import java.util.Objects;

public class Persona implements Serializable, Comparable<Persona> {
    private String nombre;
    private String apellido;
    private int edad;

    public Persona(String nombre, String apellido, int edad) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
    }

    @Override
    public String toString() {
        return "Persona{" + "nombre=" + nombre + ", apellido=" + apellido + ", edad=" + edad + '}';
    }

    @Override
    public int hashCode() {
        return toString().hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return this.hashCode()==obj.hashCode();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    @Override
    public int compareTo(Persona arg) {
        DecimalFormat df=new DecimalFormat("000");
        String thisP=apellido+","+nombre+","+df.format(edad);
        String argP=arg.getApellido()+","+arg.getNombre()+","+df.format(arg.getEdad());
        return thisP.compareTo(argP)*-1;
    }


    
}
