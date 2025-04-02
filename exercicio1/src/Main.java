public class Main {
    public static void main(String[] args) {
        // Criando objetos usando diferentes construtores
        Person pessoa1 = new Person(); // Usando construtor padrão
        Person pessoa2 = new Person(); // Usando construtor com nome, idade e ID
        Person pessoa3 = new Person();

        // Usando o terceiro objeto para cálculos
        int imcResultado = pessoa3.calcularIMC();
        boolean maiorDeIdade = pessoa3.isOldOfAge();

        // Exibindo resultados
        System.out.println(pessoa3);
        System.out.println("IMC: " + imcResultado);

        // Mensagens dependendo do IMC
        if (imcResultado == -1) {
            System.out.println("Carlos está abaixo do peso.");
        } else if (imcResultado == 0) {
            System.out.println("Carlos está com peso saudável.");
        } else {
            System.out.println("Carlos está com sobrepeso.");
        }

        // Mensagem sobre maioridade
        if (maiorDeIdade) {
            System.out.println("Carlos é maior de idade.");
        } else {
            System.out.println("Carlos é menor de idade.");
        }
    }
}