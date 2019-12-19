public class Actor {

    String firstname;
    String lastname;

    public Actor(String firstname, String lastname) {
        this.firstname = firstname;
        this.lastname = lastname;

        System.out.println("CONSTRUCTOR CALLED");
    }

    public void act(){
        System.out.println("ACTING...");
    }


    public void play(){
        System.out.println("PLAYING...");
    }

}
