package com.amitdwivedie.core.object.orientation;

/**
 * @author Amit Dwivedi
 *
 */
public class ShapesTest {

    public static void main(String[] args) {
        PlayerPiece piece = new PlayerPiece();
        piece.dispayShape();
        piece.movePiece();

        doShape(piece);
        TilePiece tile = new TilePiece();
        doShape(tile);
    }

    public static void doShape(GameShape shape){
        shape.dispayShape();
    }
}

class GameShape{

    public void dispayShape(){
        System.out.println("displaying shape...");
    }
}

class PlayerPiece extends GameShape{

    public void movePiece(){
        System.out.println("Moving game piece...");
    }
}

class TilePiece extends GameShape{
    public void getAdjacent(){
        System.out.println("Getting adjacent tiles...");
    }
}