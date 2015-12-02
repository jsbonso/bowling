package com.thoughtworks;

/**
 * Created by yongliuli on 15/12/2.
 */
public class BowlingCalculator {
    private int[] stringToArray(String numbersString) {
        String[] splitedStrs = numbersString.split("\\s+");
        int[] numbers = new int[splitedStrs.length];
        for (int i = 0; i < splitedStrs.length; i++) {
            numbers[i] = Integer.parseInt(splitedStrs[i]);
        }
        return numbers;

    }


    public void preCheck(int[] throwHits) {
        for (int i = 0; i < throwHits.length; i++) {
            if (throwHits[i] > 10 || throwHits[i] < 0) {
                throw new RuntimeException("illegal hit points!");
            }
        }
    }

    public int bowlingScore(String bowlingScore) {
        return bowlingScore(stringToArray(bowlingScore));
    }

    public int bowlingScore(int[] throwsHits) {
        preCheck(throwsHits);
        int index = 0;
        int sum = 0;
        while (index < throwsHits.length) {
            int thisThrowHits = throwsHits[index];
            if (thisThrowHits < 10) {

                int thisRound = thisThrowHits + throwsHits[index + 1];
                if (thisRound > 10) {
                    throw new RuntimeException("illegal hit points!");
                }
                sum += thisRound;
                if (thisRound == 10 && (index + 2) < throwsHits.length) {
                    int oneThrowAtNextRound = throwsHits[index + 2];
                    sum += oneThrowAtNextRound;
                }
                index += 2;

            } else if (thisThrowHits == 10) {
                sum += throwsHits[index];
                if (index + 1 < throwsHits.length) {
                    sum += throwsHits[index + 1];
                }
                if (index + 2 < throwsHits.length) {
                    sum += throwsHits[index + 2];
                }
                index += 1;
            }else{
                throw new RuntimeException("illegal hit points!");
            }
            if (index >= 10) {
                break;
            }
        }
        return sum;
    }
}
