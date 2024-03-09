package src.chapter2orderarray;

import java.util.Arrays;

public class OrderArrayLowerToHigher {
    private int smallestIndex = 0; // Índice do menor elemento

    // Encontra o índice do menor elemento em um array
    public int findSmallest(int[] arr){
        int smallest = arr[0]; // Assume que o primeiro elemento é o menor

        for (int i = 0; i < arr.length; i++){
            if (arr[i] <= smallest){ // Atualiza o índice do menor elemento
                smallest = arr[i];
                smallestIndex = i;
            }
        }
        return smallestIndex; // Retorna o índice do menor elemento
    }

    // Ordena um array do menor para o maior usando o método de seleção
    public int[] orderBySelection(int[] arr){
        int[] result = new int[arr.length]; // Array para armazenar o resultado ordenado
        int[] newArray = Arrays.copyOf(arr, arr.length); // Copia do array original

        for (int j = 0; j < arr.length; j++) {
            int smallest = findSmallest(newArray);  // Encontra o menor elemento no array atual

            result[j] = newArray[smallest]; // Adiciona o menor elemento ao array result
            newArray[smallest] = Integer.MAX_VALUE; // Substitui o menor elemento por um valor alto
        }
        return result; // Retorna o array ordenado
    }


    public static void main(String Args[]){
        OrderArrayLowerToHigher sorter = new OrderArrayLowerToHigher();
        int[] myArray = {100, 0, 50, 21, 900}; // Array original

        // Ordena o array e imprime o resultado

        int[] sortedResult = sorter.orderBySelection(myArray);
       System.out.println(Arrays.toString(sortedResult));

    }
}

