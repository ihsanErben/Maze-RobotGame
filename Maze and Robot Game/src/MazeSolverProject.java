
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

        int q = 1;
        while (q == 1) {
            if(maze[9][9] == 2){
                q = 0;
                System.out.println("-----  LABIRENT COZULDU  -----");
                return;
            }
            System.out.println("1-sag");
            System.out.println("2-sol");
            System.out.println("3-yukari");
            System.out.println("4-asagi");
            System.out.print("secim: ");
            int secim = input.nextInt();
            if(secim == 0){
                q = 0;
                return;
            }
            if (secim == 1) {
                if(maze[a][b+1] == 0){
                    maze[a][b] = 0;
                    maze[a][b+1] = 2;
                    b = b+1;
                }else if(maze[a][b+1] == 1){
                    System.out.println("--- YOL KAPALI ---");
                }
                System.out.println("");
                MazeUtility.plotMaze(maze);

            } else if (secim == 2) {
                if(maze[a][b-1] == 0){
                    maze[a][b] = 0;
                    maze[a][b-1] = 2;
                    b = b-1;
                }else if(maze[a][b-1] == 1){
                    System.out.println("--- YOL KAPALI ---");
                }
                System.out.println("");
                MazeUtility.plotMaze(maze);

            } else if (secim == 3) {
                if(maze[a-1][b] == 0){
                    maze[a][b] = 0;
                    maze[a-1][b] = 2;
                    a = a-1;
                }else if(maze[a-1][b] == 1){
                    System.out.println("--- YOL KAPALI ---");
                }
                System.out.println("");
                MazeUtility.plotMaze(maze);

            } else if (secim == 4) {
                if(maze[a+1][b] == 0){
                    maze[a][b] = 0;
                    maze[a+1][b] = 2;
                    a = a+1;
                }else if(maze[a+1][b] == 1){
                    System.out.println("--- YOL KAPALI ---");
                }
                System.out.println("");
                MazeUtility.plotMaze(maze);

            } else {
                System.out.println("--- INVALID VALUE ---");
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
