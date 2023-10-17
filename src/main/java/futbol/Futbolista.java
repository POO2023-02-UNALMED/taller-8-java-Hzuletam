package futbol;

public abstract class Futbolista implements Comparable<Object>{

    private String nombre;
    private int edad;
    private final String posicion;

    public Futbolista(){
        this("Maradona", 30, "delantero");
    }

    public Futbolista(String nombre, int edad, String posicion){
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

    @Override
    public int compareTo( Object futbolista){
        Futbolista futbol = (Futbolista) futbolista;
        return Math.abs(this.getEdad()-futbol.getEdad());
    }

    public boolean equals(Futbolista f){
        return this == f;
    }

    public abstract boolean jugarConLasManos();

    
    public String ToString(){
        return  ("El futbolista " + this.getNombre() + " tiene " + this.getEdad() + ", y juega de " + this.getPosicion());
    }
}