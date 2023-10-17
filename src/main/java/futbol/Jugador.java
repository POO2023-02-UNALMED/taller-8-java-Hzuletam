import java.lang.compareTo;

public class Jugador extends Futbolista{

    public short golesMarcados;
    public byte dorsal;

    public Jugador(){
        super();
        this.golesMarcados = 289;
        this.dorsal = 7;
    }

    public Jugador(String nombre, String posicion, int edad, short golesMarcados, byte dorsal){
        super(nombre, posicion, edad);
        this.golesMarcados = golesMarcados;
        this.dorsal = dorsal;
    }

    public short getGolesMarcados(){
        return this.golesMarcados;
    }

    public void setGolesMarcados(short goles){
        this.golesMarcados = goles;
    }

    public byte getDorsal(){
        return this.dorsal;
    }

    public void setDorsal(byte dorsal){
        this.dorsal = dorsal;
    }
    @override
    public int compareTo(Jugador jugador){
        return math.abs(((Futbolista)jugador).getEdad(), ((Futbolista) this).getEdad());
    }

    @override
    public String toString(){
        return ("El futbolista " + this.getNombre() + " tiene " + this.getEdad() + " y juega de " + this.posicion + " con el dorsal " + this.dorsal + ". Ha marcado " + this.goles);
    }
    @override
    public boolean jugarConLasManos(Futbolista futbolista1, Futbolista futbolista2 ){
        return false;
    }


}