public class teste {
    public static void main(String[] args) {
        String numeroString = "pao"; // String que queremos converter
        int numeroInt;

        // Conversão de String para int
        try {
            numeroInt = Integer.parseInt(numeroString);
            System.out.println("A string '" + numeroString + "' foi convertida para o inteiro: " + numeroInt);
        } catch (NumberFormatException e) {
            System.out.println("Erro: A string não pode ser convertida para um inteiro.");
        }
    }
}
