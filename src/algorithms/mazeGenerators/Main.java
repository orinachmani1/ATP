package algorithms.mazeGenerators;

public class Main {
    public static void main(String[] args) {
        /*EmptyMazeGenerator m = new EmptyMazeGenerator();
        Maze tmp = m.generate(4,3);
        tmp.toString();*/

        MyMazeGenerator my = new MyMazeGenerator();
        Maze tmpMy = my.generate(10,10);
        tmpMy.toString();
        System.out.print("bye bye");




    }
}
