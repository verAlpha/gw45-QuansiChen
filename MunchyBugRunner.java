public class MunchyCritterRunner(){


        public static void main(String[] args){

                ActorWorld world = new ActorWorld();

                BoxBug alice = new BoxBug(6);

                alice.setColor(Color.ORANGE);

                BoxBug bob = new BoxBug(3);

                world.add(new Location(7,8), alice);

                world.add(new Location(5,5), bob);

                world.show();

}
