public class MunchyCritterRunner(){


        public static void main(String[] args){

                ActorWorld world = new ActorWorld();

                MunckyCritter alice = new MunchyCritter();
                Rock r1 = new Rock()
                Flower f1 = new Flower();
                Bug b1 = new Bug();
                Critter c1 = new Critter();

                alice.setColor(Color.ORANGE);

        //Test 1
                world.add(new Location(7,8), alice);

                world.add(new Location(6,9), b1);
                world.add(new Location(3,8), b1);
                world.add(new Location(1,2), b1);
                world.add(new Location(5,6), f1);
                world.add(new Location(8,1), f1);


        //Test 2
        /*
                world.add(new Location(7,8), alice);

                world.add(new Location(6,9), r1);
                world.add(new Location(3,8), r1);
                world.add(new Location(1,2), r1);
                world.add(new Location(5,6), r1);
                world.add(new Location(8,1), r1);

        */
        
        //Test 5
        /*
                world.add(new Location(7,8), alice);

                world.add(new Location(6,7), r1);
                world.add(new Location(6,8), r1);
                world.add(new Location(6,9), r1);
                world.add(new Location(7,7), r1);
                world.add(new Location(7,9), r1);
                world.add(new Location(8,7), r1);
                world.add(new Location(8,8), r1);
                world.add(new Location(8,9), r1);
        */
        
        


                world.show();

}
