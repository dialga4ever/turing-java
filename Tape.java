public class Tape{
    private boolean tape[];
    private int head;

    Tape(int sizeTruc){
        tape=new boolean[sizeTruc];
        head=0;

    }
    Tape(){
        tape=new boolean[1000];
        head=0;

    }
    boolean goRight(){
        if(head<tape.length-1){
            head++;
            return true;
        }
        return false;
    }
    boolean goLeft(){
        if(head>0){
            head--;
            return true;
        }
        return false;
    }
    void write(){
        tape[head]=true;
    }
    void erase(){
        tape[head]=false;
    }
    boolean read(){
        return tape[head];
    }
    @Override
    public String toString(){
        String s=new String();
        for(int i=0;i<tape.length;i++){
            if(i==head){
                s+= tape[i]==true ? "[1]" : "[_]";
            }
            else{
                
                s+= tape[i]==true ? "1" : "_";
            }
        }
        return s;
    }
    public static void main(String[] args) {
        Tape t=new Tape();
        t.write();
        for(int i=0;i<1000;i++){
            t.goRight();
            if(i%2==0){
                t.write();
            }
            
        }
        System.out.println(t);
    }
}