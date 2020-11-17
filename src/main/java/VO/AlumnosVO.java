package VO;

public class AlumnosVO {

/*Todo los atributos*/
    int idalumnos;
    String nombre;
    double nota;

public AlumnosVO(){}

/*Todo los codigos get*/
    public int getIdalumnos(){
        return idalumnos;
    }
    public String getNombre(){
        return nombre;
    }
    public double getNota(){
        return nota;
    }


/*Todo los codigos set*/
    public void setIdalumnos(int idalumnos){
        this.idalumnos = idalumnos;
    }
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    public void setNota(double nota){
        this.nota = nota;
    }

}
