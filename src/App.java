import java.io.File;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class App {
    public static void main(String[] args) {
        String filename = "/workspaces/data-analysis-project-HonoraryKacheri/pokemon.csv";
        File pokemonData = new File(filename);

        Scanner scan = new Scanner();
        int pokedexNumber = 1;
        for (int[] pokedexNumber : pokemonData){
            String pokemonName = "";
            String type1 = "";
            String type2 = "";
            int dexNumber = 0;
            for (int col : row){
                pokemonName = pokemonData[pokedexNumber][col];
    }

        }
    }
}