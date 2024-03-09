package src.chapter3recursive;

public class RecursiveFatorialNumber {

    // Método para calcular o fatorial de um número de forma recursiva
    public int calculateFatorial(int input){
        int number = input; // Variável local para armazenar o valor de entrada

        if(number == 1){ // Verifica se o número é igual a 1 (condição de parada)
            number = 1; // Se for igual a 1, retorna 1 (fatorial de 1 é 1)
        } else {
            // Se o número não for igual a 1, chama recursivamente o método com number - 1
            // e multiplica o número atual pelo resultado da chamada recursiva
            return number * calculateFatorial(number - 1);
        }
        return number; // Retorna o valor do fatorial
    }

    // Método principal do programa
    public static void main(String[] args){
        RecursiveFatorialNumber fatorial = new RecursiveFatorialNumber(); // Cria uma instância da classe src.arrays.recursive.RecursiveFatorialNumber
        int result = fatorial.calculateFatorial(5); // Calcula o fatorial de 5

        // Imprime o resultado na saída padrão
        System.out.println("\n \t " + result);
    }
}
