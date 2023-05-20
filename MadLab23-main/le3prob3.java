public class le3prob3 {
    interface SwimBehavior {
        void swim();
    }

    interface FlyBehavior {
        void fly();
    }

    interface QuackBehavior {
        void quack();
    }

    class RubberDuck implements SwimBehavior, QuackBehavior {
        public void swim() {
            System.out.println("Rubber duck swimming");
        }

        public void quack() {
            System.out.println("Rubber duck squeaking");
        }
    }

    class WoodenDuck implements SwimBehavior {
        public void swim() {
            System.out.println("Wooden duck swimming");
        }
    }

    class RedHeadDuck implements SwimBehavior, FlyBehavior, QuackBehavior {
        public void swim() {
            System.out.println("RedHead duck swimming");
        }

        public void fly() {
            System.out.println("RedHead duck flying");
        }

        public void quack() {
            System.out.println("RedHead duck quacking");
        }
    }

    class LakeDuck implements SwimBehavior, FlyBehavior, QuackBehavior {
        public void swim() {
            System.out.println("Lake duck swimming");
        }

        public void fly() {
            System.out.println("Lake duck flying");
        }

        public void quack() {
            System.out.println("Lake duck quacking");
        }
    }
}
