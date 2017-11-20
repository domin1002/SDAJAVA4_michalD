package pl.sda.java4.triangles;

import junitparams.JUnitParamsRunner;
import junitparams.Parameters;
import org.junit.Assert;
import org.junit.*;
import org.junit.runner.RunWith;

@RunWith(JUnitParamsRunner.class)
public class ParsingTest {

    private Parser sut;

    @Before
    public void setup() {
        sut = new Parser();
    }

    @Test
    @Parameters
    public void properInput(String input, int[] expectedOutput) {
        Assert.assertArrayEquals(expectedOutput, sut.parseTriple(input));
    }

    private Object parametersForProperInput() {
        return new Object[] {
                new Object[]{"3 4 5", new int []{3,4,5}},
                new Object[]{"  3      4  \t\t       5 ", new int []{3,4,5}},
                new Object[]{"100 10000 100", new int []{100, 10000, 100}},
                new Object[]{"-1 -1 -1", new int []{-1, -1, -1}}

        };
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
