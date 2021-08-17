package BvnGenerationCentre;

public class BVNService {
    private static long currentBvn=0;
    private static long generateAccountNumber=0;



    public static long generateBvn(){
        currentBvn++;
        return currentBvn;

    }

    public static long generateAccountNumber() {
      ++generateAccountNumber;
      return generateAccountNumber;
    }

    public static long getCurrentBvn() {
        return currentBvn;
    }

    private static void setCurrentBvn(long currentBvn) {
        BVNService.currentBvn = currentBvn;
    }

    public static long getGenerateAccountNumber() {
        return generateAccountNumber;
    }

    private static void setGenerateAccountNumber(long generateAccountNumber) {
        BVNService.generateAccountNumber = generateAccountNumber;
    }
}

