package nameThatNumber;

import java.util.Scanner;
  
/**
 * @author Weizhuo Wu
 * @author Zhou Tan
 *
 */
public class NameThatNumber {
    Scanner scanner = new Scanner(System.in); // This is "global"
  
    public static void main(String[] args) {
        new NameThatNumber().run();
    }
    
    /**
     * read in text from the keyboard. It then prints out the same text, 
     * except that it turns every integer number between 0 and 9999, 
     * inclusive, into words.
     */
    void run() {
        String line;
        do {
            System.out.print("Type something (*end* to quit): ");
            line = scanner.nextLine();
            System.out.println(numbersToWords(line));
        } while (!(line.equals("*end*")));
        System.out.println("Goodbye.");
    }
    
    /**
     * Replaces each sequence of digits in text 
     * with the corresponding English words.
     * 
     * @param text
     *            Input word sequence captured from keyboard  
     * @return
     *        The translated word sequence          
     */
    String numbersToWords(String text)
    {
        String translatedText = "";
        int i = 0;
        int parsedInt = 0;
        while (i < text.length())
        {
            if (text.charAt(i) < '0' || text.charAt(i) > '9')
            {
                translatedText += text.charAt(i);   //directly append non numerical values
                i++;
            }
            else
            {
                String parsedString = "";
                while(i < text.length() && text.charAt(i) >= '0' && text.charAt(i) <= '9')
                {
                    parsedString += text.charAt(i++);
                }
                parsedInt = Integer.parseInt(parsedString);
                if (parsedInt > 9999)
                {
                    translatedText += "BIG NUMBER";
                }
                else
                {
                    translatedText += nameOf(parsedInt);
                }
            }
        }
        return translatedText;
    }
    
    /**
     * Given any number in the range 0 to 9999, returns the word or words 
     * representing that number. Words in the string are separated by exactly 
     * one space; the returned string does not begin or end with a space.
     * 
     * @param number
     *              An integer number in the range 0 to 9999
     * @return
     *        The word or words representing that number
     */
    String nameOf(int number)
    {   
        int thousand = number / 1000;
        int hundred = (number % 1000) / 100;
        int ten = (number % 100) / 10;
        int single = number % 10;
        String translatedInt = "";
        
        if (number == 0)
            return "zero";
        if(thousand != 0){
            translatedInt += nameOfDigit(thousand) + " thousand";
        }
        if(hundred != 0){
            if (thousand != 0)
            {
                translatedInt += " ";
            }
            translatedInt += nameOfDigit(hundred) + " hundred";
        }
        if(ten != 0){
            if (hundred != 0 || thousand != 0)
            {
                translatedInt += " ";
            }
            if(ten == 1){ 
                translatedInt += nameOfTeens(ten * 10 + single);
                return translatedInt; 
                }
            else{
                translatedInt += nameOfTensDigit(ten);
            }
        }
        if(single != 0){
            if (ten != 0 || hundred != 0 || thousand != 0)
            {
                translatedInt += " ";
            }
            translatedInt += nameOfDigit(single);
        }
        return translatedInt;
    }

    /**
     * Given any number in the range 0 to 9, returns a single word 
     * representing that number (zero through nine).
     * 
     * @param number
     *              Any number in the range 0 to 9
     * @return
     *        A single word representing the given number
     */
    String nameOfDigit(int number)
    {
        switch(number){
        case 0: return "zero";
        case 1: return "one";
        case 2: return "two";
        case 3: return "three";
        case 4: return "four";
        case 5: return "five";
        case 6: return "six";
        case 7: return "seven";
        case 8: return "eight";
        case 9: return "nine";
        default:
            return null;
        }
    }
    
    /**
     * Given any number in the range 1 to 9, returns a word representing 
     * that number of tens.
     * 
     * @param number
     *              Any number in the range 1 to 9
     * @return
     *        A word representing the number of tens of given number
     */
    String nameOfTensDigit(int number)
    {
        switch(number){
        case 1: return "ten";
        case 2: return "twenty";
        case 3: return "thirty";
        case 4: return "forty";
        case 5: return "fifty";
        case 6: return "sixty";
        case 7: return "seventy";
        case 8: return "eighty";
        case 9: return "ninety";
        default:
            return null;     
        }
    }
    
    /**
     * Given any number in the range 10 to 19, returns a word 
     * representing that number.
     * 
     * @param number
     *              Any number in the range 10 to 19
     * @return
     *        A word representing the given number
     */
    String nameOfTeens(int number)
    {
        switch(number){
        case 10: return "ten";
        case 11: return "eleven";
        case 12: return "twelve";
        case 13: return "thirteen";
        case 14: return "fourteen";
        case 15: return "fifteen";
        case 16: return "sixteen";
        case 17: return "seventeen";
        case 18: return "eighteen";
        case 19: return "nineteen";
        default:
            return null;     
        }        
    }
}
