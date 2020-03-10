package d3.interview.amazon.test;

import javax.lang.model.SourceVersion;
import java.math.BigInteger;

public class Find3rdCoordinate {

    public String solution(int AX, int AY, int BX, int BY) {
        int CX = BX - AX;
        int CY = BY - AY;
        //Rotate by 90 degrees
        int RX = CY;
        int RY = CX*(-1);
        //Normalize
        int norm = findGCD(Math.abs(RX), Math.abs(RY));
        int NX = RX/norm;
        int NY = RY/norm;
        return "" + (BX+NX)+ "," + (BY+NY) +"";
    }

    private static int findGCD(int number1, int number2) {
        if(number2 == 0){
            return number1;
        }
        return findGCD(number2, number1%number2);
    }

    public static void main(String[] args) {
        Find3rdCoordinate find3rdCoordinate = new Find3rdCoordinate();
        
        String result = find3rdCoordinate.solution(-1, 3, 3, 1);

        System.out.println("result = " + result);
    }
}
