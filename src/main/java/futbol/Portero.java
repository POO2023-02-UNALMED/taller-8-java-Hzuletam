package futbol;

public class Portero extends Futbolista{
    public short golesRecibidos;
    public byte dorsal;

    public Portero(String nombre, int edad, short golesRecibidos, byte dorsal){
        super(nombre, edad, "Portero");
        this.golesRecibidos = golesRecibidos ;
        this.dorsal = dorsal;

    }

    public short getGolesRecibidos(){
        return this.golesRecibidos;
    }

    public void setGolesRecibidos(short goles){
        this.golesRecibidos = goles;
    }

    public byte getDorsal(){
        return this.dorsal;
    }

    public void setDorsal(byte dorsal){
        this.dorsal = dorsal;
    }

    @Override
    public int compareTo(Object portero){
        Portero port = (Portero) portero;
        return Math.abs(this.golesRecibidos - port.getGolesRecibidos());
    }

    @Override
    public String toString(){
        return ("El futbolista " + this.getNombre() + " tiene " + this.getEdad() + ", y juega de " + this.getPosicion() + " con el dorsal " + this.dorsal + ". Le han marcado " + this.golesRecibidos);
    } 
    @Override
    public boolean jugarConLasManos(){
        return true;
    }

}