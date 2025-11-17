package views;
import models.Persona;

public class ShowConsole {
    public void showResult(Integer result){
        if(result != null){
            System.out.println("Elemento encontrado: " + result);
        } else {
            System.out.println("El elemento " + result + " no se encuentra en el arreglo.");
        }   

    }

    public void showResult(Persona people){
        if(people != null){
            System.out.println("Persona encontrada: " + people.toString());
        } else {
            System.out.println("No se encontro la persona.");
        }
    }
}
