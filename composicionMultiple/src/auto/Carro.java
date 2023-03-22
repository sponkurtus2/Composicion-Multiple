package auto;

import java.util.ArrayList;
import java.util.List;

public class Carro {
    private Motor motor;
    private Chasis chasis;
    private Carroceria carroceria;
    private List<Llanta> llantas;

    public Carro() {
        this(100, EnumChasis.MONOCASCO, "Rojo", EnumCarroceria.TUBULAR, "Tesla", 195,15);
    }

    public Carro(int volumen, EnumChasis chasis,  String color, EnumCarroceria carroceria,
    String marca, int diametro, int anchura) {
        this.motor = new Motor(volumen);
        this.chasis = new Chasis(chasis);
        this.carroceria = new Carroceria(color, carroceria);
        this.llantas = new ArrayList<>();
        this.llantas.add(new Llanta());
        this.llantas.add(new Llanta());
        this.llantas.add(new Llanta());
        this.llantas.add(new Llanta());
    }
    
    @Override
    public String toString() {
        return "Carro: [ " + this.motor + this.chasis + this.carroceria + this.llantas + "]";
    }

    public Motor getMotor() {
        return motor;
    }

    public void setMotor(Motor motor) {
        this.motor = motor;
    }

    public Chasis getChasis() {
        return chasis;
    }

    public void setChasis(Chasis chasis) {
        this.chasis = chasis;
    }

    public Carroceria getCarroceria() {
        return carroceria;
    }

    public void setCarroceria(Carroceria carroceria) {
        this.carroceria = carroceria;
    }

    public List<Llanta> getLlantas() {
        return llantas;
    }

    public void setLlantas(List<Llanta> llantas) {
        this.llantas = llantas;
    }

    


}
