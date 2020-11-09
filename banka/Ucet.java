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
    
    public String getCisloUctu() {
        return this.cisloUctu;
    }
    
    public void vlozPeniaze(int eur, int centov) {
        this.stavVCentoch += eur * 100 + centov;
    }
    
    public void vyberPeniaze(int eur, int centov) {
        this.stavVCentoch -= eur * 100 + centov;
    }
    
    public String getStav() {
        return String.format("%d,%02d €", this.stavVCentoch / 100, this.stavVCentoch % 100);
    }
}
