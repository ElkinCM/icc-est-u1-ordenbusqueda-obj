package controllers;

import models.Persona;

public class PersonaController {

    public void sortByDireccionCodigo(Persona[] personas) {
        for (int i = 1; i < personas.length; i++) {
            Persona key = personas[i];
            int j = i - 1;
            while (j >= 0 && personas[j].getCodigoDireccion() > key.getCodigoDireccion()) {
                personas[j + 1] = personas[j];
                j--;
            }
            personas[j + 1] = key;
        }
    }

    public Persona findByCodigo(Persona[] personas, int codigo) {
        int bajo = 0;
        int alto = personas.length - 1;

        while (bajo <= alto) {
            int medio = (bajo + alto) / 2;
            int valorMedio = personas[medio].getCodigoDireccion();

            if (valorMedio == codigo) {
                return personas[medio];
            } else if (valorMedio < codigo) {
                bajo = medio + 1;
            } else {
                alto = medio - 1;
            }
        }
        return null;
    }
}
