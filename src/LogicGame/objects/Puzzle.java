package LogicGame.objects;

import java.util.Arrays;

public class Puzzle {
    public final Integer[][] example;
    public final Integer[][] answer;

    public Puzzle(Integer[][] example){
        this.example = example;
        this.answer = null;
    }

    public Puzzle(Integer[][] example, Integer[][] answer){
        this.example = example;
        this.answer = answer;
    }

    @Override
    public String toString() {
        StringBuilder sB1 = new StringBuilder();
        StringBuilder sB2 = new StringBuilder();

        sB1.append("[ ");
        for (Integer[] t1: example){
            sB1.append(Arrays.toString(t1));
        }
        sB1.append(" ]");

        sB2.append("[ ");
        if (answer != null) {
            for (Integer[] t2 : answer) {
                sB2.append(Arrays.toString(t2));
            }
        }
        else {
            sB2.append(" ");
        }
        sB2.append(" ]");

        return "Example: " + sB1.toString()
                +"\n Answer: " + sB2.toString();
    }
}
