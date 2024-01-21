package uuids;

public class MyUuid {
    public static String getUuid(int digits) {
        String ret = "";
        final char A = 'A';
        final char ZERO = '0';
        for(int i=1;i<=digits;i++) {
            if (Math.random()>0.5) {
                ret += (char)((int)A+(int)(Math.random()*26));
            } else {
                ret += (char)((int)ZERO+(int)(Math.random()*10));
            }
        }
        return ret;
    }
}