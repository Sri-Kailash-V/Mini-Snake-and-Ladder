
public class Board {

    void board(int xx, int yy) {
        int col, r = 100, t = 91;
        System.out.printf("Players current position");
        for (int lin = 1; lin <= 5; lin++) {
            System.out.printf("\n---------------------------------------------------\n| ");
            for (col = r; col >= t; col--) {
                if (col == xx && col == yy) {
                    System.out.printf("@& | ");
                } else if (col == xx) {
                    System.out.printf(" @ | ");
                } else if (col == yy) {
                    System.out.printf(" & | ");
                } else if (col == 100) {
                    System.out.printf(col + "| ");
                } else {
                    System.out.printf(col + " | ");
                }
            }
            r -= 10;
            t -= 10;
            System.out.printf("\n---------------------------------------------------\n| ");
            for (col = t; col <= r; col++) {
                if (col == xx && col == yy) {
                    System.out.printf("@& | ");
                } else if (col == xx) {
                    System.out.printf(" @ | ");
                } else if (col == yy) {
                    System.out.printf(" & | ");
                } else if (col < 10) {
                    System.out.printf(col + "  | ");
                } else {
                    System.out.printf(col + " | ");
                }
            }
            r -= 10;
            t -= 10;
        }
        System.out.printf("\n---------------------------------------------------\n");
    }

    void intro() {
        System.out.println("Please read information about the game before starting");
        System.out.println("ladder to climbs \n 4 to 14\n 9 to 31\n 20 to 38");
        System.out.println(" 28 to 84\n 40 to 59\n 63 to 81\n 71 to 91");
        System.out.println("snake to fall \n 17 to 7\n 54 to 34\n 62 to 18");
        System.out.println(" 64 to 60\n 87 to 24\n 93 to 73\n 95 to 75\n 99 to 78");
        System.out.println("Player A is @ coin\nPlayer b is & coin\n");
    }
}
