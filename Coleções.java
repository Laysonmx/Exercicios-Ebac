package mod11.Tarefa_Coleções;

import java.util.*;

public class Coleções {

        public static void main(String[] args) {
                exemplolistasimples();
        }

        private static void exemplolistasimples() {
                List<String> lista = new ArrayList<String>();
                lista.add("Pedro - Masculino");
                lista.add("João - Masculino");
                lista.add("Alcino - Masculino");
                lista.add("Maria - Feminino");
                lista.add("Julia - Feminino");
                lista.add("Flavia - Feminino");

                Collections.sort(lista);
                System.out.println("Lista ordenada: " + lista);

                Map<String, List<String>> agrupadoPorSexo = new HashMap<>();

                for (String item : lista) {
                        String[] partes = item.split(" - ");
                        String nome = partes[0];
                        String sexo = partes[1];
                        
                        agrupadoPorSexo.putIfAbsent(sexo, new ArrayList<>());
                        agrupadoPorSexo.get(sexo).add(nome);
                }

                System.out.println("\nAgrupado por sexo:");
                for (Map.Entry<String, List<String>> entry : agrupadoPorSexo.entrySet()) {
                        System.out.println(entry.getKey() + ": " + entry.getValue());
                }
        }
}



