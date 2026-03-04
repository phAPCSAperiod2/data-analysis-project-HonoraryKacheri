import java.io.File;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class App {
    public static void main(String[] args) {
        // TODO: Update this with your CSV file path
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
                
        // - Split each line by commas
        // - Convert text to numbers when needed
        // - Create new Data objects
        // - Add to your array


        // TODO: Call your analysis methods
        // Example:
        // double maxValue = findMaxValue(dataList);
        // double average = computeAverageValue(dataList);


        // TODO: Print insights
        // - Number of rows loaded
        // - Min, max, average, or any other findings
        // - Final answer to your guiding question


        // OPTIONAL TODO:
        // Add user interaction:
        // Ask the user what kind of analysis they want to see
    }


}
