package controllers;

public class BusquedaBinaria {
    public Integer busquedaBinaria(int[] arr, int objetivo){
        int izquierda = 0;
        int derecha = arr.length - 1;

        while(izquierda <= derecha){
            int medio = izquierda + (derecha - izquierda) / 2;
            // Primero validamos el medio
            if(arr[medio] == objetivo){
                return arr[medio];
            }
            // Segundo ya que no entro a ese bucle, decido si busco a la derecha o a la izquierda y eso se hace con un if
            if(arr[medio] < objetivo){            //ascendentemente ordenado
                izquierda = medio + 1;  
            } else {
                derecha = medio - 1;
            }
        }
        return null;
    }

    public void bubbleSort(int[] arr){
        int n = arr.length;
        boolean swapped = false;
        for(int i = 0; i < n - 1; i++){
            for(int j = 0; j < n - i - 1; j++){
                if(arr[j] > arr[j + 1]){
                    // Intercambio
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swapped = true;
                }
            }
            if(!swapped){
                break;
            }
        }
    }
}
