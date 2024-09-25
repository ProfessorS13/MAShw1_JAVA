package org.example;

public class NumberIdentifier {
    public static boolean isArabicNumber(String number){
        boolean isArabic = false;
        String[] arabicNumber = {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10"};
        for (int i = 0; i < arabicNumber.length; i++){
            if (arabicNumber[i].equals(number)){
                isArabic = true;
                break;
            }
            else isArabic = false;
        }
        return isArabic;
    }
    public static boolean isRomanNumber(String number) {
        boolean isRoman = false;
        String[] arabicNumber = {"I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX", "X"};
        for (int i = 0; i < arabicNumber.length; i++) {
            if (arabicNumber[i].equals(number)) {
                isRoman = true;
                break;
            }
            else {
                isRoman = false;
            }
        }
        return isRoman;
    }
}
