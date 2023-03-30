public class Whistle { // class
    private String sound;

    public Whistle(String whistleSound) { // Constructor
        this.sound = whistleSound;
    }

    public void sound() {
        System.out.println("That is the sound of " + this.sound );
    }

    public static void main(String[] args) {
        Whistle duckWhistle = new Whistle("Kvaak");
        Whistle roosterWhistle = new Whistle("Peef");

        duckWhistle.sound();
        roosterWhistle.sound();
        duckWhistle.sound();
    }
}
