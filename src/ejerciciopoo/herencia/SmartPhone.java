package ejerciciopoo.herencia;

import ejerciciopoo.clases.SmartDevice;

public class SmartPhone extends SmartDevice {

    public String llamadas;

    public SmartPhone(){
    }

    public SmartPhone(double camara, double ram, String mensajes, String carga, String pantalla, String procesador, int precio, String llamadas) {
        super(camara, ram, mensajes, carga, pantalla, procesador, precio);
        this.llamadas = llamadas;
    }
}
