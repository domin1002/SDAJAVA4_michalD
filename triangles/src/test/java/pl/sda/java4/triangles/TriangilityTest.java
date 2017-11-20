package pl.sda.java4.triangles;

import junitparams.JUnitParamsRunner;
import junitparams.Parameters;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

@RunWith(JUnitParamsRunner.class)
public class TriangilityTest {

    Triangility sut;

    @Before
    public void setup() {
        sut = new Triangility();
    }

    @Test
    @Parameters({
            "3, 4, 5", //zwykły
            "6, 6, 6", //równoboczny
            "2147483647,2147483647,2147483647", // max zakresu
            "6, 6, 10", // równoramienny
            "10, 6, 6", // równoramienny
            "6, 10, 6"// równoramienny
    })
    public void properTriangle(int a, int b, int c) {
        assertTrue(sut.isTriangle(a, b, c));
    }

    @Test
    @Parameters({
            "3,4,10",
            "3,10,4",
            "10,3,4",

            "0,1,1",
            "1,0,1",
            "1,1,0",

            "-1,1,2",
            "2,-1,2",
            "1,2,-1",

            "5,5,10",
            "10,5,5",
            "5,10,5",

            "0,0,0",
            "-1,-1,-1"
    })
    public void invalidTriangle(int a, int b, int c) {
        assertFalse(sut.isTriangle(a, b, c));
    }

//    @Test
//    public void toJestTrójkat() {
////        boolean isTriangle = sut.isTriangle(3, 4, 5);
////        assertTrue(isTriangle);
//
//        assertTrue(sut.isTriangle(3, 4, 5));
//    }
//
//    @Test
//    public void toNieJestTrójkąt() {
//        assertFalse(sut.isTriangle(3, 4, 10));
//    }
//
//    @Test
//    public void takKiedyWszystkieBokiRówne() {
//        assertTrue(sut.isTriangle(6, 6, 6));
//    }
//
//
//    @Test
//    public void takKiedyPierwszyIDrugiBokiRówne() {
//        assertTrue(sut.isTriangle(2, 2, 3));
//    }
//
//    @Test
//    public void takKiedyDrugiITrzeciBokiRówne() {
//        assertTrue(sut.isTriangle(3, 2, 2));
//    }
//
//
//    @Test
//    public void takKiedyPierwszyITrzeciBokiRówne() {
//        assertTrue(sut.isTriangle(4, 2, 4));
//    }
//
//    @Test
//    public void nieKiedyPierwszyBokRównyZero() {
//        assertFalse(sut.isTriangle(0, 2, 5));
//    }
//
//    @Test
//    public void nieKiedyDrugiBokRównyZero() {
//        assertFalse(sut.isTriangle(1,0,1));
//    }
//
//
//    @Test
//    public void nieKiedyTrzeciBokRównyZero() {
//        assertFalse(sut.isTriangle(4, 7,0));
//    }
//
//
//    @Test
//    public void nieKiedyPierwszyBokMniejszyOdZera() {
//        assertFalse(sut.isTriangle(-1, 5, 8));
//    }
//
//
//    @Test
//    public void nieKiedyDrugiBokMniejszyOdZera() {
//        assertFalse(sut.isTriangle(2, -5, 4));
//    }
//
//
//    @Test
//    public void nieKiedyTrzeciBokMniejszyOdZera() {
//        assertFalse(sut.isTriangle(3, 6, -1));
//    }
//
//    @Test
//    public void nieKiedyWszystkieBokiRówneZero() {
//        assertFalse(sut.isTriangle(0, 0, 0));
//    }
//
//    @Test
//    public void nieKiedyPierwszyIDrugiBokSąRówneTrzeciemu() {
//        assertFalse(sut.isTriangle(5, 5, 10));
//    }
//
//    @Test
//    public void nieKiedyDrugiITrzeciSąBokRównePierwszemu() {
//        assertFalse(sut.isTriangle(10, 5, 5));
//    }
//
//    @Test
//    public void nieKiedyPierwszyITrzeciBokSąRówneDrugiemu() {
//        assertFalse(sut.isTriangle(5, 10, 5));
//    }
//
//
//    @Test
//    public void nieKiedyWszystkieBokiMniejszeOdZera() {
//        assertFalse(sut.isTriangle(-1, -5, -3));
//    }
}