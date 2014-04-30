public class MunchyCritterRunner(){


        public static void main(String[] args){

                ActorWorld world = new ActorWorld();

                MunckyCritter alice = new MunchyCritter();

                alice.setColor(Color.ORANGE);

                world.add(new Location(7,8), alice);

                world.show();

}
