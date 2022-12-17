package ejerciciopoo.clases;

import ejerciciopoo.herencia.SmartPhone;
import ejerciciopoo.herencia.SmartWach;

public class Main {
    public static void main(String[] args) {

        SmartWach relojAPPLE = new SmartWach(1.6, 4.5, "wassap", "rapida", "amolet", "APPLE 19", 0, "En la muñeca");

        relojAPPLE.costo(800000);
        System.out.println(relojAPPLE.precio);
        System.out.println(relojAPPLE.camara);
        System.out.println(relojAPPLE.ram);
        System.out.println(relojAPPLE.mensajes);
        System.out.println(relojAPPLE.carga);
        System.out.println(relojAPPLE.pantalla);
        System.out.println(relojAPPLE.procesador);
        System.out.println(relojAPPLE.formaDeUSo);



        SmartPhone redmiNoteOnce = new SmartPhone(25.0, 6.0, "Texto y wassap", "Turbó", "amolet", "snapdragon 680", 0, "por sim y redes sociales");

        redmiNoteOnce.costo(769000);
        System.out.println(redmiNoteOnce.precio);
        System.out.println(redmiNoteOnce.camara);
        System.out.println(redmiNoteOnce.ram);
        System.out.println(redmiNoteOnce.mensajes);
        System.out.println(redmiNoteOnce.carga);
        System.out.println(redmiNoteOnce.pantalla);
        System.out.println(redmiNoteOnce.procesador);
        System.out.println(redmiNoteOnce.llamadas);


    }



}


