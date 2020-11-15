package models.Player;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


class PieceTest {
    @Test
    void getpostion(){


        Piece p = new Piece("bil",2);
        p.getPostion();
        assertEquals(2,p.getPostion());

    }










}