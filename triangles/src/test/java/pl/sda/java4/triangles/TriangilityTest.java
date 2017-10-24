package pl.sda.java4.triangles;

import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class TriangilityTest {

    Triangility sut;

    @Before
    public void setup() {
        sut = new Triangility();
    }

    @Test
    public void toJestTrójkat() {
//        boolean isTriangle = sut.isTriangle(3, 4, 5);
//        assertTrue(isTriangle);

        assertTrue(sut.isTriangle(3, 4, 5));
    }

    @Test
    public void toNieJestTrójkąt() {
        assertFalse(sut.isTriangle(3, 4, 10));
    }

    @Test
    public void takKiedyWszystkieBokiRówne() {
        assertTrue(sut.isTriangle(6, 6, 6));
    }


    @Test
    public void takKiedyPierwszyIDrugiBokiRówne() {
        assertTrue(sut.isTriangle(2, 2, 3));
    }

    @Test
    public void takKiedyDrugiITrzeciBokiRówne() {
        assertTrue(sut.isTriangle(3, 2, 2));
    }


    @Test
    public void takKiedyPierwszyITrzeciBokiRówne() {
        assertTrue(sut.isTriangle(4, 2, 4));
    }

    @Test
    public void nieKiedyPierwszyBokRównyZero() {
        assertFalse(sut.isTriangle(0, 2, 5));
    }

    @Test
    public void nieKiedyDrugiBokRównyZero() {
        assertFalse(sut.isTriangle(1,0,1));
    }


    @Test
    public void nieKiedyTrzeciBokRównyZero() {
        assertFalse(sut.isTriangle(4, 7,0));
    }


    @Test
    public void nieKiedyPierwszyBokMniejszyOdZera() {
        assertFalse(sut.isTriangle(-1, 5, 8));
    }


    @Test
    public void nieKiedyDrugiBokMniejszyOdZera() {
        assertFalse(sut.isTriangle(2, -5, 4));
    }


    @Test
    public void nieKiedyTrzeciBokMniejszyOdZera() {
        assertFalse(sut.isTriangle(3, 6, -1));
    }

    @Test
    public void nieKiedyWszystkieBokiRówneZero() {
        assertFalse(sut.isTriangle(0, 0, 0));
    }

    @Test
    public void nieKiedyPierwszyIDrugiBokSąRówneTrzeciemu() {
        assertFalse(sut.isTriangle(5, 5, 10));
    }

    @Test
    public void nieKiedyDrugiITrzeciSąBokRównePierwszemu() {
        assertFalse(sut.isTriangle(10, 5, 5));
    }

    @Test
    public void nieKiedyPierwszyITrzeciBokSąRówneDrugiemu() {
        assertFalse(sut.isTriangle(5, 10, 5));
    }


    @Test
    public void nieKiedyWszystkieBokiMniejszeOdZera() {
        assertFalse(sut.isTriangle(-1, -5, -3));
    }
}