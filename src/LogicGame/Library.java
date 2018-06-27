package LogicGame;

import LogicGame.objects.Puzzle;

import java.util.ArrayList;
import java.util.List;

public enum Library {
    d1 (0, new ArrayList<>()),
    d2 (0, new ArrayList<>()),
    d3 (0, new ArrayList<>()),
    d4 (0, new ArrayList<>()),
    d5 (0, new ArrayList<>());

    private int amounts;
    private List<Puzzle> puzzle;

    Library(int amounts, List<Puzzle> puzzle){
        this.amounts = amounts;
        this.puzzle = puzzle;
    }

    public Puzzle getPuzzle(int index){
        if (index >= this.amounts) throw new IndexOutOfBoundsException("Cannot get index out of amounts!");
        return this.puzzle.get(index);
    }

    public int addPuzzle(Puzzle puzzle){
        this.puzzle.add(puzzle);
        amounts++;
        return amounts;
    }
}
