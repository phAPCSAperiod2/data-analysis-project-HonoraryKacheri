import java.io.File;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

@SuppressWarnings("unused")

public class App {
    public static void main(String[] args) {
        String filename = "/workspaces/data-analysis-project-HonoraryKacheri/pokemon.csv";
        
        try (BufferedReader br = new BufferedReader(new FileReader(filename))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] row = line.split(",");
                for (String col : row) {
                    pokemonName = row[0];
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}