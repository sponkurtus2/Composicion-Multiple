package auto;

public class Chasis {
    private EnumChasis tipo;

    public Chasis() {
        this(EnumChasis.MONOCASCO);
    }

    public Chasis(EnumChasis tipo) {
        this.tipo = tipo;
    }


    @Override
    public String toString() {
        return "Chasis: [ tipo: " + this.tipo + " ] " + "\n"; 
    }

    public EnumChasis getTipo() {
        return tipo;
    }

    public void setTipo(EnumChasis tipo) {
        this.tipo = tipo;
    }

    
}