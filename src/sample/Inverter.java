package sample;

import java.util.ArrayList;
import java.util.Arrays;

public class Inverter {
    static String inverterDigitos(String number) {
        String[] numberArr = number.split("");
        ArrayList<String> invertedNumbers = new ArrayList<String>(Arrays.asList(numberArr));
        String invertedNumber = "";

        int numberArrLength = numberArr.length - 1;
        for(int index = 0; index < numberArr.length; index++){
            invertedNumbers.set(numberArrLength, numberArr[index]);
            numberArrLength -= 1;
        }

        for (int index = 0; index < invertedNumbers.size(); index++) {
            invertedNumber += invertedNumbers.get(index);
        }

        return invertedNumber;
    }
}
