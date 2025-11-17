package views;

public class ShowConsole {
    public void showResult(Integer result){
        if(result != null){
            System.out.println("Elemento encontrado: " + result);
        } else {
            System.out.println("El elemento " + result + " no se encuentra en el arreglo.");
        }   

    }
}
