public class Conversion4 {
    public  static void main(String [] args){
        char f= 'f';
        Character F = new Character(f);
        String strF = F.toString();
        System.out.println(strF);

        int g = 0x0067;
        char G = (char)g;
        System.out.println(G);
        Character gg = new Character(G);
        String strG= gg.toString();
        System.out.println(strG);

        char h='\u0068';
        System.out.println(h);
        Character H= new Character(h);
        String strH= H.toString();
        System.out.println(strH);

        byte i = (byte) 0x84;
        System.out.println((int)i);
        System.out.println(((int)i ) & 0xFF);

    }
}
