package ejerciciopoo.herencia;

import ejerciciopoo.clases.SmartDevice;

public class SmartWach extends SmartDevice {


    public String formaDeUSo;

    public SmartWach(){
    }

    public SmartWach(double camara, double ram, String mensajes, String carga, String pantalla, String procesador, int precio, String formaDeUSo) {
        super(camara, ram, mensajes, carga, pantalla, procesador, precio);
        this.formaDeUSo = formaDeUSo;
    }
}
