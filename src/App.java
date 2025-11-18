
import controllers.BusquedaBinaria;
import models.Persona;
import views.ShowConsole;
import controllers.PersonaController;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Estudiante: Geovanny Cabrera");

        ShowConsole sC = new ShowConsole();
        BusquedaBinaria bB = new BusquedaBinaria();
        int[] arr = new int[] { 10 , 2, 4, 6, 7, 8, 13, 20};
        bB.bubbleSort(arr);
        Integer result = bB.busquedaBinaria(arr, 10 );

        sC.showResult(result);
        PersonaController pC = new PersonaController();
        Persona[] people = new Persona[] {
            new Persona("Pablo", 4),
            new Persona("Maria", 5),
            new Persona("Juan", 18),
            new Persona("David", 60),
            new Persona("Mateo", 25),
            new Persona("Diego", 12),
            new Persona("Ana", 8),
            new Persona("Alicia",9),
            new Persona("Jaime", 40),
        };
        pC.bubbleSortByAge(people);
        for(Persona p : people){
            System.out.print(p.getEdad() + " ");
        }
        System.out.println("\n");
        Persona result2 = pC.findPersonaByAge(people, 18);
        sC.showResult(result2);
    }

}
