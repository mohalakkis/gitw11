public class Person implements PessoaInterface {
    private String nome;
    private int idade;
    private String id;
    private double peso;
    private double altura;



    // Construtores (já discutidos anteriormente)

    // Implementação do método calcularIMC()
    @Override
    public int calcularIMC() {
        double imc = peso / Math.pow(altura, 2);
        if (imc < 20) {
            return -1; // Abaixo do peso
        } else if (imc >= 20 && imc <= 25) {
            return 0; // Peso saudável
        } else {
            return 1; // Sobrepeso
        }
    }

    // Implementação do método isOldOfAge()
    @Override
    public boolean isOldOfAge() {
        return idade >= 18;
    }

    // Método toString() (já discutido anteriormente)
}