package Question4;

public class User {

    //CLASS VARIABLE
    private String name;
    private String id;

    public User(String name, String id) {
        this.name = name;
        this.id = id;
    }


    //GETTERS AND SETTERS
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }
}
