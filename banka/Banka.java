import java.util.Random;

public class Banka {
    private String kodBanky;
    
    public Banka(String kodBanky) {
        this.kodBanky = kodBanky;
    }
    
    public Ucet zalozUcet(String menoMajitela) {
        Random nahodneCisla = new Random();
        
        long bban = Math.abs(nahodneCisla.nextLong()) % 10000000000L;
        
        int urokovaSadzba = 1;
        String cisloUctu = String.format("SK90%s000000%010d", this.kodBanky, bban);
        
        return new Ucet(menoMajitela, urokovaSadzba, cisloUctu);
    }
}
