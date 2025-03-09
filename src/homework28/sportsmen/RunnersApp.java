package homework28.sportsmen;

    public class RunnersApp {
        public static void main(String[] args) {
            Human human = new Human();

            AmateurRunner amateur = new AmateurRunner();

            human.run();

            amateur.run();

            ProfRunner prof = new ProfRunner();

            Human[] humans = new Human[3];
            humans[0] = human;
            humans[1] = amateur;
            humans[2] = prof;

            System.out.println("\n ===============");

            for (int i = 0; i < humans.length; i++) {
                humans[i].run();
            }


        }
    }


