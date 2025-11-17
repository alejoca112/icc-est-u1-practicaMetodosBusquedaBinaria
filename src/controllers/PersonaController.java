package controllers;
import models.Persona;

public class PersonaController {
    public void bubbleSortByName(Persona[] people){
        for (int i = 0; i < people.length; i++) {
            boolean swapped = false;
            for (int j = 0; j < people.length - i - 1; j++) {
                if (people[j].getNombre().compareTo(people[j + 1].getNombre()) > 0) {
                    // Intercambio
                    Persona temp = people[j];
                    people[j] = people[j + 1];
                    people[j + 1] = temp;
                    swapped = true;
                }
            }
            if(!swapped){
                break;
            }
        }
    }

    public Persona findPersonaByName(Persona[] people, String nombre){
        int izquierda = 0;
        int derecha = people.length - 1;

        while(izquierda <= derecha){
            int medio = izquierda + (derecha - izquierda) / 2;
            // Primero validamos el medio
            if(people[medio].getNombre().equals(nombre)){
                return people[medio];
            }
            // Segundo ya que no entro a ese bucle, decido si busco a la derecha o a la izquierda y eso se hace con un if
            if(people[medio].getNombre().compareTo(nombre) < 0){            //ascendentemente ordenado
                izquierda = medio + 1;  
            } else {
                derecha = medio - 1;
            }
        }
        return null;
    }


    // Metodo sin equals
    public Integer binarySearchPersonByName(Persona[] people, String targetName){
        int left = 0;
        int right = people.length -1;

        while(left <= right) {
            int mid = left + (right - left) / 2;
            int comparison = people[mid].getNombre().compareTo(targetName);

            if(comparison == 0){
                return mid; // Nombre encontrado
            } else if (comparison < 0){
                left = mid + 1; // Buscar en la mitad derecha
            } else {
                right = mid - 1; //Buscar en la mitad izquierda
            }
        }
        return null;   //Nombre no encontrado
    }
    
}
