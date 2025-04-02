public class Main {
    public static void main(String[] args) {
        Person pessoa1 = new Person();
        Person pessoa2 = new Person();
        Person pessoa3 = new Person();

        int imcResultado = pessoa3.calcularIMC();
        boolean maiorDeIdade = pessoa3.isOldOfAge();

        System.out.println(pessoa3);
        System.out.println("IMC: " + imcResultado);

        if (imcResultado == -1) {
            System.out.println("Carlos está abaixo do peso.");
        } else if (imcResultado == 0) {
            System.out.println("Carlos está com peso saudável.");
        } else {
            System.out.println("Carlos está com sobrepeso.");
        }

        if (maiorDeIdade) {
            System.out.println("Carlos é maior de idade.");
        } else {
            System.out.println("Carlos é menor de idade.");
        }
    }
}