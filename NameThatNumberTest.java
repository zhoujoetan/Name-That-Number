package nameThatNumber;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class NameThatNumberTest {
    NameThatNumber nth = new NameThatNumber();

    @Before
    public void setUp() throws Exception {
    }

    @Test
    public void testNumbersToWords() {
        assertEquals("Hello world!", nth.numbersToWords("Hello world!"));
        assertEquals("Heone hundred ten wzeroroned!", nth.numbersToWords("He110 w0r1d!"));
        assertEquals("The time is now three:fifteen.", nth.numbersToWords("The time is now 3:15."));
        assertEquals("Pai = three.one thousand four hundred fifteen", nth.numbersToWords("Pai = 3.1415"));
        assertEquals("Tninehe quninety eightick brotwenty eightwn fthree hundred seventy eightox jueight hundred seventy sixmps oone thousandver the lathirty threezy doneotwog.", 
                nth.numbersToWords("T9he qu98ick bro28wn f378ox ju876mps o1000ver the la33zy d1o2g."));
        assertEquals("nine thousand nine hundred ninety nine", nth.numbersToWords("009999"));
        assertEquals("This is a BIG NUMBER.", nth.numbersToWords("This is a 10000."));
       }

    @Test
    public void testNameOf() {
        
        assertEquals("zero", nth.nameOf(0));
        assertEquals("ten", nth.nameOf(10));
        assertEquals("two hundred", nth.nameOf(200));
        assertEquals("three thousand three hundred thirty three", nth.nameOf(3333));
        assertEquals("one hundred one", nth.nameOf(101));
        assertEquals("one hundred ten", nth.nameOf(110));
        assertEquals("nine hundred ninety nine", nth.nameOf(999));
        assertEquals("one thousand", nth.nameOf(1000));
        assertEquals("two thousand eight", nth.nameOf(2008));
        assertEquals("two thousand thirty", nth.nameOf(2030));
        assertEquals("two thousand eleven", nth.nameOf(2011));
        assertEquals("two thousand two hundred one", nth.nameOf(2201));
        assertEquals("two thousand two hundred", nth.nameOf(2200));
        assertEquals("two thousand one hundred eleven", nth.nameOf(2111));
        assertEquals("nine thousand nine hundred ninety nine", nth.nameOf(9999));
       }

    @Test
    public void testNameOfDigit() {
        assertEquals("zero", nth.nameOfDigit(0));
        assertEquals("one", nth.nameOfDigit(1));
        assertEquals("two", nth.nameOfDigit(2));
        assertEquals("three", nth.nameOfDigit(3));
        assertEquals("four", nth.nameOfDigit(4));
        assertEquals("five", nth.nameOfDigit(5));
        assertEquals("six", nth.nameOfDigit(6));
        assertEquals("seven", nth.nameOfDigit(7));
        assertEquals("eight", nth.nameOfDigit(8));
        assertEquals("nine", nth.nameOfDigit(9));
        
       }

    @Test
    public void testNameOfTensDigit() {
        assertEquals("ten", nth.nameOfTensDigit(1));
        assertEquals("twenty", nth.nameOfTensDigit(2));
        assertEquals("thirty", nth.nameOfTensDigit(3));
        assertEquals("forty", nth.nameOfTensDigit(4));
        assertEquals("fifty", nth.nameOfTensDigit(5));
        assertEquals("sixty", nth.nameOfTensDigit(6));
        assertEquals("seventy", nth.nameOfTensDigit(7));
        assertEquals("eighty", nth.nameOfTensDigit(8));
        assertEquals("ninety", nth.nameOfTensDigit(9));
    }

    @Test
    public void testNameOfTeens() {
        assertEquals("ten", nth.nameOfTeens(10));
        assertEquals("eleven", nth.nameOfTeens(11));
        assertEquals("twelve", nth.nameOfTeens(12));
        assertEquals("thirteen", nth.nameOfTeens(13));
        assertEquals("fourteen", nth.nameOfTeens(14));
        assertEquals("fifteen", nth.nameOfTeens(15));
        assertEquals("sixteen", nth.nameOfTeens(16));
        assertEquals("seventeen", nth.nameOfTeens(17));
        assertEquals("eighteen", nth.nameOfTeens(18));
        assertEquals("nineteen", nth.nameOfTeens(19));
        
    }

}

