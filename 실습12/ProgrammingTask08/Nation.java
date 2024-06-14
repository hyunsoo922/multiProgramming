package chap12.ProgrammingTask08;

public class Nation {
    private String name;
    private String type; // LAND or ISLAND
    private String nation; // 선진국 or 개도국

    public Nation(String name, String type, String classification) {
        this.name = name;
        this.type = type;
        this.nation = classification;
    }

    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }

    public String getNation() {
        return nation;
    }

    @Override
    public String toString() {
        return name;
    }
}
