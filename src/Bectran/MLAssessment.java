package Bectran;

import java.util.Arrays;

public class MLAssessment {

    private int getMaximumCoordinate(int initialCoins, int[] points, int[] coins){

        int n = points.length;

        int max = Arrays.stream(points).max().getAsInt();
        int min = Arrays.stream(points).min().getAsInt();

        if(initialCoins < min) return initialCoins;

        for(int i=0, j=0; i<=max; i++){

            if(initialCoins == 0){
                return i;
            }

            initialCoins--;
            if(i == points[j]){
                initialCoins += coins[j];
                j++;
            }
        }

        return initialCoins;
    }

    public static void main(String[] args) {

        MLAssessment mlAssessment = new MLAssessment();

        int initialCoins = 3;

        int[] points = {2, 5};

        int[] coins = {1, 10};

        System.out.println(mlAssessment.getMaximumCoordinate(initialCoins, points, coins));
        System.out.println(mlAssessment.getClass());
    }
}
