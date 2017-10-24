package pl.sda.java4.triangles;

import org.junit.Assert;
import org.junit.*;

public class ParsingTest {

    private Parser sut;

    @Before
    public void setup() {
        sut = new Parser();
    }

    // a b c
    @Test
    public void regularTriangle() {
        Assert.assertArrayEquals(new int[]{3, 4, 5}, sut.parseTriple("3 4 5"));
        //       Assert.assertEquals(new Triple{3, 4, 5}, sut.parse("3 4 5"));
    }

    @Test
    public void spaceIsGood() {
        Assert.assertArrayEquals(new int[]{3, 4, 5}, sut.parseTriple("  3      4  \t\t       5"));
    }

    @Test
    public void allowLongerNumber() {
        Assert.assertArrayEquals(new int[]{100, 10000, 100}, sut.parseTriple("100 10000 100"));
    }

    @Test
    public void negativeNumbers() {
        Assert.assertArrayEquals(new int[]{-1, -1, -1}, sut.parseTriple("-1 -1 -1"));
    }

// Gdyby parseTriple zwracalo optional
/*
    public void notEnoughNumbers() {
        Assert.assertTrue(sut.parseTriple("1 2").isEmpty());
    }
*/

    @Test(expected = IllegalArgumentException.class)
    public void notEnoughNumbers() {
        sut.parseTriple("1 2");
    }

    @Test(expected = IllegalArgumentException.class)
    public void tooManyNumbers() {
        sut.parseTriple("1 2 3 4");
    }

    @Test(expected = IllegalArgumentException.class)
    public void onlyNumbersAllowed1() {
        sut.parseTriple("1 2 z");
    }

    @Test(expected = IllegalArgumentException.class)
    public void onlyNumbersAllowed2() {
        sut.parseTriple("1 @ 3");
    }

    @Test(expected = IllegalArgumentException.class)
    public void emptyString() {
        sut.parseTriple("");
    }

    @Test(expected = IllegalArgumentException.class)
    public void numberTooLarge() {
        sut.parseTriple("1 2 2147483648");
    }

}
