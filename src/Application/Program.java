package Application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Map<String, Integer> mapVotos = new LinkedHashMap<>();
        String maisVotado = null;
        Integer maisVotos = 0;

        System.out.println("Digite o caminho do arquivo:");
        String patch = sc.nextLine();

        try (BufferedReader br = new BufferedReader(new FileReader(patch))) {

            String line = br.readLine();
            while (line != null) {
                String[] fields = line.split(",");
                String nome = fields[0];
                Integer qtdVoto = Integer.parseInt(fields[1]);

                if (mapVotos.containsKey(nome)) {
                    Integer somaVoto = mapVotos.get(nome);
                    mapVotos.put(nome, qtdVoto + somaVoto);
                } else {
                    mapVotos.put(nome, qtdVoto);
                }
                line = br.readLine();
            }
            for (String chave : mapVotos.keySet()) {
                System.out.println(chave + ": " + mapVotos.get(chave));
            }
            for (Map.Entry<String, Integer> entry : mapVotos.entrySet()) {
                String candidato = entry.getKey();
                Integer votos = entry.getValue();
                if (votos > maisVotos) {
                    maisVotado = candidato;
                    maisVotos = votos;
                }
            }
            System.out.println("\nCandidato " + maisVotado + " venceu a eleicao com " + maisVotos + " votos!");
        } catch (IOException e) {
            System.out.println("Erro :" + e.getMessage());
        }
    }
}
