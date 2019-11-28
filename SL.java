import java.util.*;
public class SL
{Scanner sc= new Scanner(System.in);
   int player(int x,char a,char b,char coin)
   { System.out.println("\nplayer "+a+" press only Y to play or any key to terminate");
        String AYN= sc.next();
        if(AYN.equalsIgnoreCase("y"))
        { x=game(x,a);
          x=sl(x,a,coin);
         if(x==100)
          {System.out.println("player "+a+" won");
           System.exit(0);
          }
        }
        else
          {System.out.println("Player "+a+" resigns so player "+b+" won");
           System.exit(0);
          }
     return x;      
   }
 int game( int x,char c)
 {
  Random randm=new Random();
  int rand=randm.nextInt(6 - 1 + 1) + 1;
  System.out.println("Dies obtained  "+rand);
  switch (rand)
   {case 1 : if(x<100)  x+=rand;break;
    case 2 : if(x<99)   x+=rand;break; 
    case 3 : if(x<98)   x+=rand;break; 
    case 4 : if(x<97)   x+=rand;break; 
    case 5 : if(x<96)   x+=rand;break; 
    case 6 : if(x<95)   x+=rand;break; 
   }
  return x;
 }
 int sl(int h,char c,char co)
 {int r;
   switch(h)
   {case 4: r=14;System.out.println("Player "+c+" at "+co+h+" ladder so climbs to "+co+r+" ****\n");break;

    case 9: r=31;System.out.println("Player "+c+" at "+co+h+" ladder so climbs to "+co+r+" ****\n");break;

    case 17: r=7;System.out.println("Player "+c+" at "+co+h+" snake so falls at "+co+r+" ****\n");break;

    case 20: r=38;System.out.println("Player "+c+" at "+co+h+" ladder so climbs to "+co+r+" ****\n");break;

    case 28: r=84;System.out.println("Player "+c+" at "+co+h+" ladder so climbs to "+co+r+" ****\n");break;

    case 40: r=59;System.out.println("Player "+c+" at "+co+h+" ladder so climbs to "+co+r+" ****\n");break;

    case 54: r=34;System.out.println("Player "+c+" at "+co+h+" snake so falls at "+co+r+" ****\n");break;

    case 62: r=18;System.out.println("Player "+c+" at "+co+h+" snake so falls at "+co+r+" ****\n");break;

    case 63: r=81;System.out.println("Player "+c+" at "+co+h+" ladder so climbs to "+co+r+" ****\n");break;

    case 64: r=60;System.out.println("Player "+c+" at "+co+h+" snake so falls at "+co+r+" ****\n");break;

    case 71: r=91;System.out.println("Player "+c+" at "+co+h+" ladder so climbs to "+co+r+" ****\n");break;
    case 87: r=24;System.out.println("Player "+c+" at "+co+h+" snake so falls at "+co+r+" ****\n");break;

    case 93: r=73;System.out.println("Player "+c+" at "+co+h+" snake so falls at "+co+r+" ****\n");break;

    case 95: r=75;System.out.println("Player "+c+" at "+co+h+" snake so falls at "+co+r+" ****\n");break;

    case 99: r=78;System.out.println("Player "+c+" at "+co+h+" snake so falls at "+co+r+" ****\n");break;

    default :r=h;System.out.println ("Player "+c+" at "+co+h+" ****\n");
   }
   return r;
 }
}
