package algorithms.mazeGenerators;

public class Main {
    public static void main(String[] args) {
        EmptyMazeGenerator m = new EmptyMazeGenerator();
        SimpleMazeGenerator sm = new SimpleMazeGenerator();

        Maze tmp = m.generate(1,1);
        Maze tmp2 = sm.generate(4,4);

        tmp.toString();
        System.out.println("bye bye");
        tmp2.toString();
        System.out.println("bye bye");




    }
}
