package auto;

public class Carroceria {
    private String color;
    private EnumCarroceria tipo;

    public Carroceria() {
        this("Blanco", EnumCarroceria.AUTOPORTANTE);
    }
    
    public Carroceria(String color, EnumCarroceria tipo) {
        this.color = color;
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return "Carroceria: [ Color: " + this.color + " Tipo : " + this.tipo + " ] " + "\n";
    }

    public EnumCarroceria getTipo() {
        return tipo;
    }

    public void setTipo(EnumCarroceria tipo) {
        this.tipo = tipo;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    
    
}
