package ejerciciopoo.clases;

public class SmartDevice {

    // 1. Atributos

    protected double camara;
    protected double ram;
    protected String marca;
    protected String mensajes;
    protected String carga;
    protected String pantalla;
    protected String procesador;
    protected int precio;

    // 2. Constructor

    public SmartDevice() {
    }

    public SmartDevice(double camara, double ram, String mensajes, String carga, String pantalla, String procesador, int precio) {
        this.camara = camara;
        this.ram = ram;
        this.mensajes = mensajes;
        this.carga = carga;
        this.pantalla = pantalla;
        this.procesador = procesador;
        this.precio = 0;
    }



    //3. metodo(comportamientos)

    public void costo (int valor){
        this.precio += valor;
    }
}
