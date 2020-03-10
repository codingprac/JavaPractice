package d3.strings;

public class ASCIIStrings {

    public static void main(String[] args) {
        String s = " !\"#$%&\\'()*+,-./0123456789:;<=>?@ABCDEFGHIJKLMNOPQRSTUVWXYZ[\\\\]^_`abcdefghijklmnopqrstuvwxyz{|}~";
        int count = 0;
        for(char str : s.toCharArray()) {
            count++;
            int val = str;
            System.out.println("str = " + str);
        }
        System.out.println("count = " + count);
        System.out.println("CharArray Length: "+s.toCharArray().length);
    }
}