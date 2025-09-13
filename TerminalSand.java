import java.util.Random;

public class TerminalSand {
    static final int WIDTH = 40;
    static final int HEIGHT = 20;
    static final char EMPTY = '.';
    static final char SAND = 'O';
    static char[][] grid = new char[HEIGHT][WIDTH];
    static Random rand = new Random();

    public static void main(String[] args) throws InterruptedException {
        initGrid();

        while (true) {
            spawnSand();
            update();
            render();

            // If you increase the 'int miliseconds' here, it will 'refresh' less frequently.
            Thread.sleep(50);
        }
    }

    static void initGrid() {
        for (int y = 0; y < HEIGHT; y++) {
            for (int x = 0; x < WIDTH; x++) {
                grid[y][x] = EMPTY;
            }
        }
    }

    static void spawnSand() {
        int x = rand.nextInt(WIDTH);
        if (grid[0][x] == EMPTY) {
            grid[0][x] = SAND;
        }
    }

    static void update() {
        for (int y = HEIGHT - 2; y >= 0; y--) {
            for (int x = 0; x < WIDTH; x++) {
                if (grid[y][x] == SAND) {
                    if (grid[y + 1][x] == EMPTY) {
                        grid[y + 1][x] = SAND;
                        grid[y][x] = EMPTY;
                    } else {
                        boolean moveLeft = rand.nextBoolean();
                        int dx = moveLeft ? -1 : 1;
                        if (x + dx >= 0 && x + dx < WIDTH && grid[y + 1][x + dx] == EMPTY) {
                            grid[y + 1][x + dx] = SAND;
                            grid[y][x] = EMPTY;
                        }
                    }
                }
            }
        }
    }

    static void render() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
        for (int y = 0; y < HEIGHT; y++) {
            for (int x = 0; x < WIDTH; x++) {
                System.out.print(grid[y][x]);
            }
            System.out.println();
        }
    }
}
