/*****************************************************************
 * Sisi Zimmerman, Brian Quang, Ivetter Chen --- QuansiChen
 * APCS pd 8
 * HW#35 GridWorld, Part 4
 * 2014-05-01
 *
 * class MunchyCritter
 *
 * BEACUASE:
 * MunchyCritter's description was interesting
 *
 * SPECIFICATIONS:
 *MunchyCritter will extend Critter. A MunchyCritter looks at all of the neighbors within one step of its
        current location. It will then proceed to eat (remove) all actors within one stepo of its current 
        location. However, if the actor that is removed is a Rock, then the MunchyCritter dies. If there
        are no actors within a one step radius of its current location, the MunchyCritter will move in a 
        random direction for one step.
 *
 * TEST CASES:
 * First Test Case: A MunchyCritter is placed in a grid where there are only actors except for Rocks. 
        The MunchyCritter would be able to eat anything in its radius and keep moving if there is nothing to eat.
 *Second Test Case: A MunchyCritter is placed in a grid where there are only actors that are Rocks.
        The MunchyCritter move around and then if it encounters a rock, it will eat and then proceed to "die" or remove itself.
 *Third Test Case: A MunchyCritter is placed at the edge of the grid.
        It should be able to discern which direction is a valid location to step in and proceed to step in the correct path.
 *Fourth Test Case: When the MunchyCritter is surrounded by Actors other than Rocks.
        All Actors should be consumed.
 *Fifth Test Case: When the MunchyCritter is surrounde by Rocks
        All rocks should be consumed and the MunchyCritter will remove itself. 
 *
 * ERRATA:
 * <any extra test cases, any developer decisions, or
 * other judgment calls your team made to get the class working...>
 *****************************************************************/


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
