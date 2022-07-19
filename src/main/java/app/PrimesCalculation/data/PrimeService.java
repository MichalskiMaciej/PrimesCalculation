package app.PrimesCalculation.data;

import org.springframework.stereotype.Service;

@Service
public class PrimeService {
    static int count;
    static int maxDivisor;

    public static boolean isPrime(int turn) {
        if (turn <= 1) return false;
        if (turn == 2) return true;
        if (turn > 2 && (turn%2) == 0) return false;

        //calc maximum divisor for reduction calculation time
        maxDivisor = (int) Math.floor(Math.sqrt(turn));
        for (int divisor= 3; divisor < maxDivisor+1; divisor = divisor+2) {
            if((turn % divisor) == 0) return false;
        }
        return true;
    }

    public static int primeCalculations(int startValue, int endValue) {
        count = 0;
        for(int turn=startValue; turn <=endValue; turn++){
            if(isPrime(turn)){
                count++;
            }
        }
        return count;
    }
}
