public class MazeCreator {
    int rowSize = 10;
    int colSize = 15;
    Coordinate[][] board = new Coordinate[rowSize][colSize];
    char[] elements = {'W', 'P', 'S', 'E'};

    public MazeCreator(int x, int y) {
        this.rowSize = x;
        this.colSize = y;
    }

    public MazeCreator() {
    }

    //Populate Maze with Coordinates
    public void createMaze() {
        for(int x = 0; x < this.rowSize; x++) {
            for(int y = 0; y < this.colSize; y++) {
                board[x][y] = new Coordinate(x, y, 'F');
            }
        }
        this.installEdge();
    }

    //Puts walls on the edges of the Maze
    public void installEdge() {
        int lastX =  board.length - 1;
        int lastY = board[0].length - 1;
        System.out.println(lastX + " " + lastY);
 
        for(int count = lastY; count < lastY; count++) {
            board[0][count] = new Coordinate(0, count, 'W');
            board[count][0] = new Coordinate(count, 0, 'W');
        }

        for(int count = lastX; count >= 0; count--) {
            board[lastX][count] = new Coordinate(lastX, count, 'W');
            board[count][lastX] = new Coordinate(count, lastX , 'W');
        }
    }

    //Prints out the maze on the console
    public void printMaze() {
        for(int x = 0; x < this.rowSize; x++) {
            for(int y = 0; y < this.colSize; y++) {
                System.out.print(board[x][y].getE());
            }
            System.out.println();
        }
    }

    public void generateMaze() {

    }

    public static void main(String[] args) {
        MazeCreator maze = new MazeCreator();
        maze.createMaze();
        maze.printMaze();
    }

}
