package algorithms.mazeGenerators;

public class Main {
    public static void main(String[] args) {
        EmptyMazeGenerator m = new EmptyMazeGenerator();
        Maze tmp = m.generate(3,3);
        tmp.toString();
        System.out.print("bye bye");




    }
}
