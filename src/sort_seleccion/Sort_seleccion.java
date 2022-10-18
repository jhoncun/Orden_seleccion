/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sort_seleccion;
import java.util.Scanner;
import java.util.Arrays;
/**
 *
 * @author JENG-PC
 */
public class Sort_seleccion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int tamaño,intercambio,bandera=1;
        int arreglo[];
        Scanner leer = new Scanner(System.in);
        System.out.print("Digite el tamaño del arreglo: ");
        tamaño = leer.nextInt();
        arreglo = new int[tamaño];
        //Inicio de la asignacion de valores al arreglo
        for(int i=0;i<tamaño;i++){
            System.out.print("Digite el valor para la posición " + i + ": ");
            arreglo[i] = leer.nextInt();           
        }   
        Sort_seleccion seleccion = new Sort_seleccion();
        System.out.print(Arrays.toString(seleccion.seleccion(arreglo, tamaño)));       
              
    }    
     //fin de la asignacion de valores al arreglo
        //Inicio algoritmo de Orden por selección
   public int[] seleccion(int arreglo[],int tamaño){
        int bandera=1,intercambio;
         for(int j=0;j<=tamaño && bandera==1;j++){
            bandera=0;
                for(int k=0;k<tamaño-1;k++){
                    if(arreglo[k]>arreglo[k+1]){
                        bandera=1;
                        intercambio = arreglo[k];
                        arreglo[k] = arreglo[k+1];
                        arreglo[k+1] = intercambio;                       
                    }
                }
                
        }       
        return arreglo;
    }
    
}
