//Priyanna Patel and Travis Clark

import info.gridworld.world.World;
import info.gridworld.grid.Grid;
import info.gridworld.grid.BoundedGrid;
import info.gridworld.grid.Location;
import info.gridworld.actor.Actor;
import info.gridworld.actor.ActorWorld;

import java.util.Scanner;
public class MineSweeperRunner
{
   public static void main(String[] args)
   {
      Scanner scan = new Scanner(System.in);
      System.out.println("Do you want to play an easy game or a hard one? ");
      String levelOfGame = scan.next();
      //while loop tbd for multiple games        
      Grid<Actor> grid;
      ActorWorld world;
      if(levelOfGame.equals("hard"))
      {
                  //play hard version of the game = makes grid
                  grid = new BoundedGrid<Actor>(15, 15);
                 
      }
      else
      {
                  //play easy version of the game - makes grid
                  grid = new BoundedGrid<Actor>(10, 10);
                  

         
      }
      world = new ActorWorld(grid);
      world.show();


//public void locationClicked(Location loc)// placed in runner 
  // {
//tap(loc);
//}

      
   }
}