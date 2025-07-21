package exercicioFixacaoMap;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Map<String, Integer> votos = new HashMap<>();

        System.out.print("Enter file full path: ");
        String path = sc.nextLine();

        try (BufferedReader br = new BufferedReader(new FileReader(path))) {
            String linha;

            while ((linha = br.readLine()) != null) {
                String[] partes = linha.split(",");
                String nome = partes[0].trim();
                int qtdVotos = Integer.parseInt(partes[1].trim());

                // Somar os votos acumulados
                if (votos.containsKey(nome)) {
                    votos.put(nome, votos.get(nome) + qtdVotos);
                } else {
                    votos.put(nome, qtdVotos);
                }
            }

            System.out.println("\nResultado da votação:");
            for (Map.Entry<String, Integer> entrada : votos.entrySet()) {
                System.out.println(entrada.getKey() + ": " + entrada.getValue());
            }

        } catch (IOException e) {
            System.out.println("Erro na leitura do arquivo: " + e.getMessage());
        }

        sc.close();
    }
}

