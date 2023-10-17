import java.lang.compareTo;

public abstract class Futbolista implements Comparable<Futbolista>{

    private String nombre;
    private int edad;
    private final String posicion;

    public Futbolista(){
        this("Maradona","delantero",30);
    }

    public Futbolista(String nombre, String posicion, int edad){
        this.nombre = nombre;
        this.edad = edad;
        this.posicion = posicion;
    }

    public String getNombre(){
        return this.nombre;
    }

    public void setNombre(String nombre){
        this.nombre = nombre ;
    }

    public int getEdad(){
        return this.edad;
    }

    public void setEdad( int edad){
        this.edad = edad ;
    }

    public String getPosicion(){
        return this.posicion;
    }

    @override
    public boolean compareTo( Futbolista futbolista){
        return math.abs(this.getEdad()-futbolista.getEdad());
    }

    public boolean equals(Futbolista f){
        return this == futbolista
    }

    public abstract boolean jugarConLasManos();

    @override
    public String ToString(){
        return  "El futbolista " + this.nombre + " tiene " + this.edad + ", y juega de " + this.posicion;
    }
}