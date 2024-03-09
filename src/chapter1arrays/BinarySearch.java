package src.chapter1arrays;

public class BinarySearch {

    // Método para imprimir o resultado encontrado
    public static void printResult(int result){
        System.out.println("Resultado encontrado no arranjo: " + result  );
    }

    // Método para realizar a busca binária
    public static int findElement(int[] arr, int element){

        // Inicialização dos índices baixo e alto
        int baixo = 0;
        int alto = arr.length - 1;

        // Enquanto o índice baixo for menor ou igual ao índice alto
        while (baixo <= alto){
            // Calcula o índice do elemento médio
            int media = (baixo + alto) / 2;

            // Se o elemento médio for igual ao elemento procurado
            if(arr[media] == element){
                return arr[media]; // Retorna o elemento encontrado
            }
            // Se o elemento médio for menor que o elemento procurado
            else if (arr[media] < element){
                baixo = media + 1; // Atualiza o índice baixo para a metade superior do arranjo
            }
            // Se o elemento médio for maior que o elemento procurado
            else {
                alto = media - 1; // Atualiza o índice alto para a metade inferior do arranjo
            }
        }

        return -1; // Retorna -1 caso o elemento não seja encontrado
    }

    public static void main(String[] args) {
        int[] myArray = {7, 9, 15, 21, 77, 100, 777}; // Array ordenado
        int result = findElement(myArray, 21); // Procura o elemento 21 no array

        printResult(result); // Imprime o resultado

    }
}
