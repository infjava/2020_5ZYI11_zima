public class SegmentovyDisplej {
    private Obdlznik a;
    private Obdlznik b;
    private Obdlznik c;
    private Obdlznik d;
    private Obdlznik e;
    private Obdlznik f;
    private Obdlznik g;
    
    public SegmentovyDisplej() {
        this.a = new Obdlznik();
        this.b = new Obdlznik();
        this.c = new Obdlznik();
        this.d = new Obdlznik();
        this.e = new Obdlznik();
        this.f = new Obdlznik();
        this.g = new Obdlznik();
        
        this.a.zmenStrany(30, 5);
        this.g.zmenStrany(30, 5);
        this.d.zmenStrany(30, 5);
        
        this.b.zmenStrany(5, 30);
        this.c.zmenStrany(5, 30);
        this.e.zmenStrany(5, 30);
        this.f.zmenStrany(5, 30);
        
        this.a.posunVodorovne(5);
        this.g.posunVodorovne(5);
        this.d.posunVodorovne(5);
        
        this.b.posunVodorovne(35);
        this.c.posunVodorovne(35);
        
        this.f.posunZvisle(5);
        this.b.posunZvisle(5);
        
        this.g.posunZvisle(35);
        
        this.e.posunZvisle(40);
        this.c.posunZvisle(40);
        
        this.d.posunZvisle(70);
        
        this.a.zobraz();
        this.b.zobraz();
        this.c.zobraz();
        this.d.zobraz();
        this.e.zobraz();
        this.f.zobraz();
        this.g.zobraz();
    }
    
    public void zobrazCislicu(int cislica) {
        if (cislica == 0 || cislica == 2 || cislica == 3 || cislica > 4) {
            this.a.zobraz();
        } else {
            this.a.skry();
        }
        if (cislica < 5 || cislica > 6) {
            this.b.zobraz();
        } else {
            this.b.skry();
        }
        if (cislica != 2) {
            this.c.zobraz();
        } else {
            this.c.skry();
        }
        if (cislica == 0 || cislica == 2 || cislica == 3 || cislica == 5 || cislica == 6 || cislica == 8 || cislica ==9) {
            this.d.zobraz();
        } else {
            this.d.skry();
        }
        if (cislica == 0 || cislica == 2 || cislica == 6 || cislica == 8) {
            this.e.zobraz();
        } else {
            this.e.skry();
        }
        if (cislica == 0 || cislica == 4 || cislica == 5 || cislica == 6 || cislica > 7) {
            this.f.zobraz();
        } else {
            this.f.skry();
        }
        if (cislica != 0 && cislica != 1 && cislica != 7) {
            this.g.zobraz();
        } else {
            this.g.skry();
        }
        /*switch (cislica) {
            case 0:
                this.a.zobraz();
                this.b.zobraz();
                this.c.zobraz();
                this.d.zobraz();
                this.e.zobraz();
                this.f.zobraz();
                this.g.skry();
                break;
            case 1:
                this.a.skry();
                this.b.zobraz();
                this.c.zobraz();
                this.d.skry();
                this.e.skry();
                this.f.skry();
                this.g.skry();
                break;
            case 2:
                this.a.zobraz();
                this.b.zobraz();
                this.c.skry();
                this.d.zobraz();
                this.e.zobraz();
                this.f.skry();
                this.g.zobraz();
                break;
        }*/
    }
}
