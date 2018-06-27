package LogicGame;

import LogicGame.objects.Puzzle;

import java.util.Arrays;

/**
 *   puzzle came from SudokuPuzzle.org
 */
public class InputPuzzle {

    public InputPuzzle() {
        input1();
    }

    /**
     *  diff = 1
     */
    private void input1(){
        // puzzle 1.1
        Integer[] pf110 = new Integer[]{-1,-1,-1,-1,-1,-1, 2,-1, 3,
                                        -1,-1, 7,-1,-1,-1,-1,-1, 6,
                                        -1,-1, 4,-1, 1,-1,-1,-1,-1,
                                        -1, 2,-1, 3, 5, 1,-1,-1,-1,
                                        -1,-1, 3,-1, 8, 6, 9,-1,-1,
                                         6, 7, 5, 4,-1, 9,-1, 1, 8,
                                         4, 1, 2, 5, 7, 8,-1,-1, 9,
                                         7, 9, 6,-1, 4, 3, 5, 8, 2,
                                         3,-1,-1,-1, 6, 2, 4, 7, 1};
        Integer[] pf111 = new Integer[]{5,6,1,8,9,7,2,4,3,
                                        9,8,7,2,3,4,1,5,6,
                                        2,3,4,6,1,5,8,9,7,
                                        8,2,9,3,5,1,7,6,4,
                                        1,4,3,7,8,6,9,2,5,
                                        6,7,5,4,2,9,3,1,8,
                                        4,1,2,5,7,8,6,3,9,
                                        7,9,6,1,4,3,5,8,2,
                                        3,5,8,9,6,2,4,7,1};
        Integer[][] p110 = new Integer[9][];
        Integer[][] p111 = new Integer[9][];
        int j = 0;
        for (int i =0; i <81; i =i +9 ){
            Integer[] e = Arrays.copyOfRange(pf110,i,i+8);
            Integer[] a = Arrays.copyOfRange(pf111,i,i+8);
            p110[j] = e;
            p111[j++] = a;
        }
        Library.d1.addPuzzle(new Puzzle(p110,p111));
    }
}
