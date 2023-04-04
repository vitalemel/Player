public class Player implements Comparable<Player> {
    private int id;

    private String name;
    private int strength;

    public Player(int id, String name, String strength) {
        this.id = id;
        this.name = name;
        this.strength = Integer.parseInt(strength);
    }

    public Player(int id, String name, int strength) {
        this.id = id;
        this.name = name;
        this.strength = strength;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getStrength() {
        return strength;
    }

    public void setId(int id) {
        this.id = id;
    }


    @Override
    public int compareTo(Player o) {
        if (strength < o.getStrength()) {
            return -1;
        }
        if (strength > o.getStrength()) {
            return 1;
        }
        return 0;
    }
}
