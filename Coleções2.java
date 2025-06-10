package mod12;

public class Coleções2 {

    public static void main(String[] args) {

        String[] nomes = {"Ana", "Carlos", "Beatriz", "João", "Maria", "Pedro"};
        char[] sexos = {'F', 'M', 'F', 'M', 'F', 'M'};

        System.out.println("=== Grupo Masculino ===");
        for (int i = 0; i < nomes.length; i++) {
            if (sexos[i] == 'M') {
                System.out.println(nomes[i]);
            }
        }

        System.out.println("\n=== Grupo Feminino ===");
        for (int i = 0; i < nomes.length; i++) {
            if (sexos[i] == 'F') {
                System.out.println(nomes[i]);
            }
        }
    }
}
