package ssc_tetris;
public class Main {
    private static int[][] screen = {
            {1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1},
            {1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1},
            {1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1},
            {1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1},
            {1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1},
            {1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1},
            {1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1},
            {1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1},
            {1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1},
    };
    private int[][] arrayBlk = {
            {0, 1, 0},
            {1, 1, 1},
            {0, 1, 0},
    };
    public static void main(String[] args){
        drawScreen();
    }
    public static void drawScreen(){
        for (int i = 0; i < screen.length; i++){
            for (int j = 0; j < screen[0].length; j++){
                if (screen[i][j] == 1)
                    System.out.print("■");
                else
                    System.out.print("□");
            }
            System.out.println();
        }
        // screen[0][4]~screen[2][6] Block paste
    }
}