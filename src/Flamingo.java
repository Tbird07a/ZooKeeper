public class Flamingo extends Animals{
    int hours_dancing;


    public Flamingo(String name, String species, int hours_dancing) {
        this.name = name;
        this.species = "Flamingo";
        this.hours_dancing = hours_dancing;

    }



    public String dance() {
        hours_dancing ++;
        return ("MY NAME IS " + name + ". I LOVE TO DANCE!!!! " + " I have danced for" + hours_dancing + " hours!!!!!!!!!!!!!");
    }



    public static void main(String[] args) {
        Flamingo Elephant = new Flamingo("Elephant", "Flamingo", 100000);
        System.out.println(Elephant);
        System.out.println(Elephant.dance());
    }
}
