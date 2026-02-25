public class Q3 {
    static int[][] maze = {
            {0, 1, 0, 0, 0},
            {0, 0, 0, 1, 0},
            {1, 1, 0, 1, 0},
            {0, 0, 0, 0, 0},
            {0, 1, 1, 1, 0}
    };

    public static void main(String[] args) throws InterruptedException {
        if (escape(0, 0)) {
            System.out.println("Escaped!");
        } else {
            System.out.println("No path found.");
        }
    }

    public static boolean escape(int row, int col) throws InterruptedException {
        // Base Cases
        if (row < 0 || row > 4 || col < 0 || col > 4) return false; // Out of bounds
        if (maze[row][col] == 1 || maze[row][col] == 2) return false; // Wall or visited

        maze[row][col] = 2; // Mark current path
        printGrid();
        Thread.sleep(500); // Frame-by-frame pause

        if (row == 4 && col == 4) return true; // Exit reached

        // Recursive Step: Right then Down
        if (escape(row, col + 1)) return true;
        if (escape(row + 1, col)) return true;

        // Backtrack
        maze[row][col] = 0;
        return false;
    }

    public static void printGrid() {
        System.out.println("\n--- MAZE ---");
        for (int[] row : maze) {
            for (int cell : row) {
                if (cell == 2) System.out.print("X ");
                else System.out.print(cell + " ");
            }
            System.out.println();
        }
    }
}