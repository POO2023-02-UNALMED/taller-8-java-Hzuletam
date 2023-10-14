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

    public boolean jugarConLasManos(Futbolista futbolista1, Futbolista futbolista2 ){
        edadf1 = futbolista1.getEdad;
        edadf2 = futbolista2.getEdad;
        if (edadf1 > edadf2){
           return edadf1-edadf2;
        }else{
            return edadf2-edadf1
        }
        return false;
    }


}