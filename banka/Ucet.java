public class Ucet {
    private long stavVCentoch;
    private String menoMajitela;
    private int urokovaSadzba;
    private String cisloUctu;
    
    public Ucet(String menoMajitela, int urokovaSadzba, String cisloUctu) {
        this.stavVCentoch = 0;
        this.menoMajitela = menoMajitela;
        this.urokovaSadzba = urokovaSadzba;
        this.cisloUctu = cisloUctu;
    }
}
