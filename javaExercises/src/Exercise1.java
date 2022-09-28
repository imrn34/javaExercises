import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Exercise1 {
    public static void main(String[] args) {
        String hi = "Hello, My first number is: ";
        String yeap = "Have a fun.";
        int dayNumber = 2;
        int total = 0;
        int sayi1 = 220, sayi2 = 284, toplam1 = 0, toplam2 = 0;

        dayNumber--;
        dayNumber++;
        String dayString = "";
        int myNumber = (2 * 8) / 3;
        double secondNumber = (myNumber * 2) + 1.7;
        int minValue = Integer.MIN_VALUE;
        int maxValue = Integer.MAX_VALUE;
        byte minBtValue = Byte.MIN_VALUE;
        byte maxBtValue = Byte.MAX_VALUE;
        Short minShValue = Short.MIN_VALUE;
        Short maxShValue = Short.MAX_VALUE;
        long minLgValue = Long.MIN_VALUE;
        long maxLgValue = Long.MAX_VALUE;
        float minFtValue = Float.MIN_VALUE;
        float maxFtValue = Float.MAX_VALUE;
        char myChar = 'A';
        char myUnicode = '\u0041';
        boolean isEven = false;
        boolean isOdd = isEven ? false : true;
        String messageText = "";
        int[] valueList = {3, 5, 9};
        int biggestValue = valueList[0];
        // String[] yourList={"D","E","F"};
        List<String> myList = new ArrayList<>();


        for (int i = 0; i < valueList.length; i++) {
            if (valueList[i] > biggestValue) {
                biggestValue = valueList[i];
                i = 0;
            }
        }

        myList.add("A-One");
        myList.add("B-Two");
        myList.add("C-Three");


        //myList.remove(2);


        for (int i = 0; i < myList.size(); i++) {
            if (myList.get(i).contains("A")) {
                messageText += "\n" + myList.get(i) + " is deleted. Because it has an A mark. ";
                myList.remove(i);

            }
        }

        for (String listItem : myList) {
            if (listItem.contains("B")) {
                messageText += "\n" + listItem + " is deleted. Because it has an B mark. ";
                myList.remove(listItem);
            }
        }


        if (secondNumber % 2 == 0) {
            isEven = true;
            messageText += "\n" + secondNumber + " is even. ";
        } else {
            messageText += "\n" + secondNumber + " is odd. ";
        }


        switch (dayNumber) {
            case 1:
                dayString = "Monday";
                break;
            case 2:
                dayString = "Tuesday";
                break;
            case 3:
                dayString = "Wednesday";
                break;
            case 4:
                dayString = "Thursday";
                break;
            case 5:
                dayString = "Friday";
                break;
            case 6:
                dayString = "Saturday";
                break;
            default:
                dayString = "Sunday";
                break;
        }

        switch (myChar) {
            case 'A':
            case 'I':
            case 'O':
            case 'U':
                messageText += "\n" + myChar + " is bold vowel";
                break;
            default:
                messageText += "\n" + myChar + " is thin vowel";
        }


        for (int i = 0; i < dayNumber; i++) {
            if (i % 2 == 0) {
                total += i;
            }
        }
        if (total == dayNumber) {
            messageText += "\nDay number is a super number";
        } else {
            messageText += "\nDay number is not a super number";
        }


        if (dayNumber >= 6 && dayNumber <= 7) messageText += "\nGreat! Day number is between 6 and 7";
        else messageText += "\nSory. Day number is not between 6 and 7";

        if (dayString != "Sunday" && dayString != "Saturday") messageText += "\nFuck! Today is not holiday. ";
        else messageText += "\nToday is holiday. Lets go to the bar.";

        for (int i = 1; i < sayi1; i++) {
            if (sayi1 % i == 0) {
                toplam1 += i;
            }
        }

        for (int i = 1; i < sayi2; i++) {
            if (sayi2 % i == 0) {
                toplam2 += i;
            }
        }
        if (sayi1 == toplam2 && sayi2 == toplam1) {
            messageText += "\n" + sayi1 + " and " + sayi2 + " are friend number";
        } else {
            messageText += "\n" + sayi1 + " and " + sayi2 + " are not friend number";
        }

        char[] charactersX = new char[9];
        hi.getChars(0, 6, charactersX, 0);
        yeap.getChars(0, 3, charactersX, 6);

        String replacedHi = hi.replace("i", "1");
        replacedHi = replacedHi.replace("e", "3");
        System.out.println(hi + myNumber +
                "\nMerge of Strings: " + hi.concat(yeap) +
                "\ni is " + hi.indexOf("i") + " th character of hi text" +
                "\ne is " + yeap.lastIndexOf("e") + " th character of yeap value from the end." +
                "\nReplaced Hi string: " + replacedHi +

                "\nCropped first 3 characters: " + replacedHi.substring(3) +
                "\nCropped between 3th and 7th characters: " + replacedHi.substring(3, 7) +
                "\nMix of string characters: " + Arrays.toString(charactersX) +
                "\n9th character of the text above: " + hi.charAt(8) +
                "\nSecond number is: " + secondNumber +
                "\nUpper amd Lowercase of hi string " + hi.toUpperCase() + " " + hi.toLowerCase() +
                "\nMy string list length is: " + myList.size() +
                "\nMy list elements are; " + String.join(",", myList) +
                "\nValues are:" + Arrays.toString(valueList) + " and the biggest value is: " + biggestValue +
                messageText +
                "\nThe Day is; " + dayString +
                "\nInteger min value: " + minValue + " and max value is: " + maxValue +
                "\nByte min value: " + minBtValue + " and max value is: " + maxBtValue +
                "\nShort min value: " + minShValue + " and max value is: " + maxShValue +
                "\nLong min value: " + minLgValue + " and max value is: " + maxLgValue +
                "\nFloat min value: " + minFtValue + " and max value is: " + maxFtValue +
                "\nChar value is: " + myChar + " and char as unicode value is: " + myUnicode +
                "\nReverse of false is: " + String.valueOf(isOdd) +
                "\nSplit with space replaced Hi string: "

        );
        for (String word : replacedHi.split(" ")
        ) {
            System.out.println(word);

        }

        // System.out.println(charactersX);


    }
}
