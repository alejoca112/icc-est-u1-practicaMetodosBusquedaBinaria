
import controllers.BusquedaBinaria;
import models.Persona;
import views.ShowConsole;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Estudiante: Geovanny Cabrera");

        ShowConsole sC = new ShowConsole();
        BusquedaBinaria bB = new BusquedaBinaria();
        int[] arr = new int[] { 10 , 2, 4, 6, 7, 8, 13, 20};
        bB.bubbleSort(arr);
        Integer result = bB.busquedaBinaria(arr, 10 );

        sC.showResult(result);
        Persona[] people = new Persona[] {
            new Persona("Juan", 25),
            new Persona("Ana", 30),
            new Persona("Pedro", 20),
            new Persona("Maria", 28),
            new Persona("Luis", 22),
            new Persona("Carmen", 27),
            new Persona("Sofia", 24),
        };
    }

}
