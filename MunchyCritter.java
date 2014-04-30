
import info.gridworld.actor.Actor;
import info.gridworld.actor.Critter;
import info.gridworld.grid.Location;

import java.util.ArrayList;

public class MunchyCritter extends Critter{

        private void processActors(ArrayList<Actors> actors){
                for( Actor a: actors){
                        a.removeSelfFromGrid();
                        if (a instanceOf Rock){
                                removeSelfFromGrid();
                        }
                }
        }
}
