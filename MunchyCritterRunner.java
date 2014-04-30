public class MunchyCritterRunner(){


        public static void main(String[] args){

                ActorWorld world = new ActorWorld();

                MunckyCritter alice = new MunchyCritter();
                Rock r1 = new Rock()

                alice.setColor(Color.ORANGE);


        //Test 1
                world.add(new Location(7,8), alice);

                world.add(new Location(6,9), r1);
                world.add(new Location(3,8), r1);
                world.add(new Location(1,2), r1);
                world.add(new Location(5,6), r1);
                world.add(new Location(8,1), r1);




                world.show();

}
