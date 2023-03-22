package auto;

public class Motor {
    private double volumen;

    public Motor(double volumen) {
        this.volumen = volumen;
    }

    public Motor() {
        this(5.0);
    }
    
    @Override
    public String toString() {
        return "Motor: [ Volumen: " + this.volumen + " ] " + "\n";
    }

    public double getVolumen() {
        return volumen;
    }

    public void setVolumen(double volumen) {
        this.volumen = volumen;
    }

    

}
