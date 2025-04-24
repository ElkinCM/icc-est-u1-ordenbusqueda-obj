package views;
import models.Persona;

public class ViewConsole {
    public void printArray(Persona[] personas) {
        //imprimir array de personas ordenado por codigo de direccion de manera descendente
        for (int i = 0; i < personas.length; i++) {
            System.out.println(personas[i].toString());
        }
    }
}
