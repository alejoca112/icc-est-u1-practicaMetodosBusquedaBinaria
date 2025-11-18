package controllers;
import models.Persona;

public class PersonaController {
    public void bubbleSortByAge(Persona[] people){
        for (int i = 0; i < people.length; i++) {
            boolean swapped = false;
            for (int j = 0; j < people.length - i - 1; j++) {
                if (people[j].getEdad() > people[j + 1].getEdad()) {
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

    public Persona findPersonaByAge(Persona[] people, int objetivo){
        int izquierda = 0;
        int derecha = people.length - 1;
        while(izquierda <= derecha){
            int medio = izquierda + (derecha - izquierda)/2;
            int comparacion = people[medio].getEdad();

            printSarray(people, izquierda, derecha);

            String direccion;
            if(comparacion == objetivo){
                direccion = "Encontrado";
            } else if(comparacion < objetivo){
                direccion = "Derecha";
            } else {
                direccion = "Izquierda";
            }

            System.out.println("bajo= " + izquierda + " alto= " + derecha + " medio= " + medio + " valor medio= "
             + comparacion + " ->> " + direccion);

             if(comparacion == objetivo){
                System.out.println();
                return people[medio];
             } else if(comparacion < objetivo){
                izquierda = medio + 1;
             } else {
                derecha = medio - 1;
             }
             System.out.println();
        }
        return null;
    }

    public void printSarray(Persona[] people, int izquierda, int derecha){
        for(int i = izquierda; i <= derecha; i++){
            System.out.print(people[i].getEdad());
            if(i < derecha){
                System.out.print(" | ");
            }
        }
        System.out.println(); 
    }
    
}
