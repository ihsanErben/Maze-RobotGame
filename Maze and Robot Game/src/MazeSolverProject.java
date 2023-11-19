
import java.util.Scanner;

public class MazeSolverProject {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int grid = 5;
        int[][] maze = getMaze(grid);

        Stack path = new Stack();

        int a = 1;
        int b = 1;
        maze[a][b] = 2;
        MazeUtility.plotMaze(maze);

        Stack x = new Stack();
        String konum = "[" + a + "]" + "[" + b + "]";
        x.push(konum);

        int q = 1;
        while (q == 1) {
            if (maze[9][9] == 2) {
                q = 0;
                MazeUtility.plotMaze(maze);
                x.print();
                System.out.println("");
                System.out.println("-------  M A Z E   C O M P L E T E D  -------");
                return;
            }
            System.out.println("           8)Up");
            System.out.print("4)Left");
            System.out.println("              6)Right");
            System.out.println("           2)Down");
            
            System.out.println("");
            System.out.println("5)Display all movements");
            System.out.println("0)Exit");
            System.out.print("Option: ");
            int secim = input.nextInt();
            if (secim == 0) {
                q = 0;
                return;
            }
            if (secim == 6) {
                if (maze[a][b + 1] == 0) {
                    maze[a][b] = 0;
                    maze[a][b + 1] = 2;
                    b = b + 1;
                    String konum1 = "[" + a + "]" + "[" + b + "]";
                    x.push(konum1);
                    System.out.println("");
                    System.out.println("Current Location: " + konum1);
                } else if (maze[a][b + 1] == 1) {
                    System.out.println("-------------------");
                    System.out.println("--- CLOSED ROAD ---");
                    System.out.println("-------------------");
                }
                MazeUtility.plotMaze(maze);
            } else if (secim == 4) {
                if (maze[a][b - 1] == 0) {
                    maze[a][b] = 0;
                    maze[a][b - 1] = 2;
                    b = b - 1;
                    String konum2 = "[" + a + "]" + "[" + b + "]";
                    x.push(konum2);
                    System.out.println("");
                    System.out.println("Current Location: " + konum2);
                } else if (maze[a][b - 1] == 1) {
                    System.out.println("-------------------");
                    System.out.println("--- CLOSED ROAD ---");
                    System.out.println("-------------------");
                }
                MazeUtility.plotMaze(maze);

            } else if (secim == 8) {
                if (maze[a - 1][b] == 0) {
                    maze[a][b] = 0;
                    maze[a - 1][b] = 2;
                    a = a - 1;
                    String konum3 = "[" + a + "]" + "[" + b + "]";
                    x.push(konum3);
                    System.out.println("");
                    System.out.println("Current Location: " + konum3);
                } else if (maze[a - 1][b] == 1) {
                    System.out.println("-------------------");
                    System.out.println("--- CLOSED ROAD ---");
                    System.out.println("-------------------");
                }
                MazeUtility.plotMaze(maze);

            } else if (secim == 2) {
                if (maze[a + 1][b] == 0) {
                    maze[a][b] = 0;
                    maze[a + 1][b] = 2;
                    a = a + 1;
                    String konum4 = "[" + a + "]" + "[" + b + "]";
                    x.push(konum4);
                    System.out.println("");
                    System.out.println("Current Location: " + konum4);
                } else if (maze[a + 1][b] == 1) {
                    System.out.println("-------------------");
                    System.out.println("--- CLOSED ROAD ---");
                    System.out.println("-------------------");
                }
                MazeUtility.plotMaze(maze);

            } else if (secim == 5) {
                x.print();
            } else {
                System.out.println("!!! INVALID VALUE !!!");
                System.out.println("");
                MazeUtility.plotMaze(maze);
            }
            System.out.println("-------------------------------------------------------------------------------------------------------------------------------------------");
        }

        // To do: starting from the coordinates [1,1], use the path stack to navigate in the maze and 
        // find a way to [2*grid-1, 2*grid-1] coordinates
        // use the following code to print the maze at each step
        // MazeUtility.plotMaze(maze);  
        // DO NOT change any of the given code
    }

    public static int[][] getMaze(int grid) {
        MazeGenerator maze = new MazeGenerator(grid);
        String str = maze.toString();

        int[][] maze2D = MazeUtility.Convert2D(str);
        return maze2D;
    }
}
