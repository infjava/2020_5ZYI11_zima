
public class Ucet {
    private long stavVCentoch;
    private String menoMajitela;
    private int urokovaSadzba;
    private String cisloUctu;
    private Banka banka;
    
    public Ucet(Banka banka, String menoMajitela, int urokovaSadzba, String cisloUctu) {
        this.stavVCentoch = 0;
        this.menoMajitela = menoMajitela;
        this.urokovaSadzba = urokovaSadzba;
        this.cisloUctu = cisloUctu;
        this.banka = banka;
    }
    
    public String getCisloUctu() {
        return this.cisloUctu;
    }
    
    public void vlozPeniaze(int eur, int centov) {
        if (centov >= 100 || centov < 0) {
            System.out.println("Neplatná hodnota centov");
            return;
        }
        
        if (eur < 0) {
            System.out.println("Neplatná hodnota eur");
            return;
        }
        
        this.stavVCentoch += eur * 100 + centov;
    }
    
    public void vyberPeniaze(int eur, int centov) {
        if (centov >= 100 || centov < 0) {
            System.out.println("Neplatná hodnota centov");
            return;
        }
        
        if (eur < 0) {
            System.out.println("Neplatná hodnota eur");
            return;
        }
        
        if (eur * 100 + centov > this.stavVCentoch) {
            System.out.println("!!! Nemáš toľko peňazí na účte !!!");
            return;
        }
        
        this.stavVCentoch -= eur * 100 + centov;
    }
    
    public String getStav() {
        return String.format("%d,%02d €", this.stavVCentoch / 100, this.stavVCentoch % 100);
    }
    
    public void vlozUroky() {
        this.stavVCentoch += this.stavVCentoch * this.urokovaSadzba / 100;
    }
    
    public void prevedPeniaze(String naUcet, int eur, int centov) {
        if (centov >= 100 || centov < 0) {
            System.out.println("Neplatná hodnota centov");
            return;
        }
        
        if (eur < 0) {
            System.out.println("Neplatná hodnota eur");
            return;
        }
        
        if (eur * 100 + centov > this.stavVCentoch) {
            System.out.println("!!! Nemáš toľko peňazí na účte !!!");
            return;
        }
        
        Ucet cielovy = this.banka.getUcet(naUcet);
        
        if (cielovy == null) {
            System.out.println("!!! Taký účet neexistuje !!!");
            return;
        }
        
        this.stavVCentoch -= eur * 100 + centov;
        cielovy.stavVCentoch += eur * 100 + centov;
    }
}
