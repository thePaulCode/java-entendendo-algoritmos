public class RecursiveAlgorithm {

    // Método que demonstra recursão
    public int recursiveCase(int i){
        int number; // Variável local para armazenar o valor de i
        number = i; // Atribui o valor de i à variável number
        System.out.println("\n \t" + number); // Imprime o valor atual de number na saída padrão
        if (number >= 1){ // Condição de parada da recursão
            recursiveCase(number - 10); // Chamada recursiva com argumento reduzido
        }
        return number; // Retorna o valor atual de number
    }

    // Método principal do programa
    public static void main(String[] args){
        RecursiveAlgorithm re = new RecursiveAlgorithm(); // Cria uma instância da classe RecursiveAlgorithm
        re.recursiveCase(100); // Chama o método recursiveCase com o valor inicial de 100
    }
}
