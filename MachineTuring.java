public class MachineTuring {
    private static int MAX_INSTRUCTION = 1000;

    private Tape ruban;
    private int etat;
    private instruction[] programme;
    private int nBinstruction;
    
    MachineTuring(int tailleRuban) {
        ruban = new Tape(tailleRuban);
        etat = 0;
        nBinstruction=0;
        programme= new instruction[tailleRuban];
    }
    MachineTuring() {
        nBinstruction=0;
        ruban = new Tape();
        etat = 0;
        nBinstruction=0;
        programme= new instruction[1000];
    }
    MachineTuring(String ru) {
        ruban = new Tape(ru.length());
        etat = 0;
        for (int i = 0; i < ru.length(); i++) {
            if (ru.charAt(i) == '1') {
                ruban.write();
            }
            ruban.goRight();
        }
        for (int i = 0; i < ru.length(); i++) {
            ruban.goLeft();
        }
        programme= new instruction[MAX_INSTRUCTION];

    }
    @Override
    public String toString() {
        return ruban.toString();
    }
    public static void main(String[] args) {
        MachineTuring m = new MachineTuring("00111011111000");
        System.out.println(m);
    }
}
