import java.util.ArrayList;
import java.util.Random;
import java.math.BigInteger;

public class Banka {
    private String kodBanky;
    private ArrayList<Ucet> ucty;
    
    public Banka(String kodBanky) {
        this.kodBanky = kodBanky;
        this.ucty = new ArrayList<Ucet>();
    }
    
    public Ucet zalozUcet(String menoMajitela) {
        Random nahodneCisla = new Random();
        
        long bban = Math.abs(nahodneCisla.nextLong()) % 10000000000L;
        
        BigInteger ibanPreKontrolu = BigInteger.valueOf(bban)
                                        .multiply(BigInteger.valueOf(1000000))
                                        .add(BigInteger.valueOf(2820 * 100))
                                        .add(
                                            new BigInteger(this.kodBanky)
                                                .multiply(BigInteger.valueOf(10).pow(22))
                                        );
        
        int kontrolneCislo = 98 - ibanPreKontrolu
                                .mod(BigInteger.valueOf(97))
                                .intValue();
        
        int urokovaSadzba = 1;
        String cisloUctu = String.format("SK%02d%s000000%010d", kontrolneCislo, this.kodBanky, bban);
        
        Ucet novyUcet = new Ucet(this, menoMajitela, urokovaSadzba, cisloUctu);
        
        this.ucty.add(novyUcet);
        
        return novyUcet;
    }
    
    public void zaratajUroky() {
        for (Ucet aktualny : this.ucty) {
            aktualny.vlozUroky();
        }
    }
    
    public Ucet getUcet(String cisloUctu) {
        for (Ucet aktualny : this.ucty) {
            if (aktualny.getCisloUctu().equals(cisloUctu)) {
                return aktualny;
            }
        }
        
        return null;
    }
}
