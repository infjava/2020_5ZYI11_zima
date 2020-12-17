import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Random;

public class GeneratorTetromin {
    private ArrayList<boolean[][]> tvary;
    
    public GeneratorTetromin() throws IOException {
        this.tvary = new ArrayList<boolean[][]>();
        
        this.nacitanieTvarov();
    }
    
    private void nacitanieTvarov() throws IOException {
        File subor = new File("data/tetrominoes.txt");
        Scanner citac = new Scanner(subor);
        
        while (citac.hasNextLine()) {
            int sirka = citac.nextInt();
            int vyska = citac.nextInt();
            
            citac.nextLine();
            
            boolean[][] svietiacePixely = new boolean[vyska][sirka];
            
            for (int y = 0; y < vyska; y++) {
                String riadok = citac.nextLine();
                
                for (int x = 0; x < sirka; x++) {
                    char znak = riadok.charAt(x);
                    
                    svietiacePixely[y][x] = (znak == '*');
                }
            }
            
            this.tvary.add(svietiacePixely);
        }
        
        citac.close();
    }
    
    public Tetromino vytvorNahodne() {
        Random nahodneCisla = new Random();
        
        int indexTvaru = nahodneCisla.nextInt(this.tvary.size());
        
        boolean[][] svietiacePixely = this.tvary.get(indexTvaru);
        
        return new Tetromino(svietiacePixely);
    }
}
