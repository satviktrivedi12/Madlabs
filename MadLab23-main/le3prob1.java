abstract class Bharatvanshi {
    abstract void fight();
}

abstract class Pandav extends Bharatvanshi {
    abstract void obey();

    abstract void kind();
}

class Arjun extends Pandav {
    @Override
    void fight() {
        System.out.println("Arjun fights with skill and bravery.");
    }

    @Override
    void obey() {
        System.out.println("Arjun obeys his elders and follows the rules of dharma.");
    }

    @Override
    void kind() {
        System.out.println("Arjun is kind and compassionate towards others.");
    }
}

class Bheem extends Pandav {
    @Override
    void fight() {
        System.out.println("Bheem fights with strength and power.");
    }

    @Override
    void obey() {
        System.out.println("Bheem obeys his elders and follows the rules of dharma.");
    }

    @Override
    void kind() {
        System.out.println("Bheem is kind, but can be fierce when provoked.");
    }
}

abstract class Kaurav extends Bharatvanshi {
}

class Duryodhan extends Kaurav {
    @Override
    void fight() {
        System.out.println("Duryodhan fights with strength and cunning.");
    }
}

class Vikarn extends Kaurav {
    @Override
    void fight() {
        System.out.println("Vikarn fights with skill and honor.");
    }

    void obey() {
        System.out.println("Vikarn obeys his elders and follows the rules of dharma.");
    }

    void kind() {
        System.out.println("Vikarn is kind and compassionate towards others.");
    }
}