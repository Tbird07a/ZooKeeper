public class ZooKeeper extends Employee{


    private int animals_cared;


    public int getAnimals_cared() {
        return animals_cared;
    }

    public void setAnimals_cared(int animals_cared) {
        this.animals_cared = animals_cared;
    }

    public ZooKeeper(String name, int animals_cared) {
        this.name = name;
        this.position = "Zoo Keeper";
        this.animals_cared = animals_cared;
    }



    public String toString() {
        return this.name + " has cared for " + this.animals_cared + " animals.";
    }


    public static void main(String[] args) {
        ZooKeeper silly = new ZooKeeper("Silly", 26);
        System.out.println(silly);
        ZooKeeper bob = new ZooKeeper("Bob", 1);
        System.out.println(bob);



    }
}
