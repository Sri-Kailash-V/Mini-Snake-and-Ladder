import java.util.*;
public class SNL
{ public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int x = 0, y = 0;
    Board b=new Board();
    SL p1 = new SL();
    SL p2 = new SL();
    System.out.println("Welcome to Snake And Ladder Game \nPress only Y to start or any key to terminate");
    String start = sc.next();
    if (start.equalsIgnoreCase("y"))
    { b.intro();
      b.board (x,y);
      while (x != 100 && y != 100) 
      { x = p1.player(x, 'A', 'B','@');
        y = p2.player(y, 'B', 'A','&');
        b.board (x,y);        
      }
    }
    else
      System.out.println("Game terminated");
    sc.close();
  }
}