public class Animals {

    public String species;
    public String name;
    public String color;
    private int age;
    private boolean popular;

    public Animals() {
    }


    public String getSpecies() {
        return species;
    }

    public void setSpecies(String species) {
        this.species = species;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean isPopular() {
        return popular;
    }

    public void setPopular(boolean popular) {
        this.popular = popular;
    }

    public Animals(String species, String name, String color, int age, boolean popular){
        this.species = species;
        this.name = name;
        this.color = color;
        this.popular = popular;
        this.age = age;

    }



    public void printInfo(){
        System.out.println(name + " is a " + color + " " + species + ". He is " + age + " years old. Popular animal?: " + popular);
    }

    public void dyePink() {
        this.color = "Pink";
    }

    public void becomeFlamingo(){
        if (color.equals("Pink")) {
            this.species = "Flamingo";
            this.popular = true;
            System.out.println(name + " is now a flamingo and popular.");
        } else {
            System.out.println("CANNOT BECOME FLAMINGO");
        }
    }




    public static void main(String[] args) {
        Animals james = new Animals("Horse", "James", "Brown", 29, false);
        james.printInfo();
        james.dyePink();
        james.becomeFlamingo();


    }

}
