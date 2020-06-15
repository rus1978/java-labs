import com.google.gson.Gson;

public class MyPerson {
    private int id;
    private String firstName;
    private String lastName;

    public int getId() { return id; }
    public void setId(int id) { this.id = id;}

    public String getFirstName() { return firstName; }
    public void setFirstName(String firstName) { this.firstName = firstName; }
    public String getLastName() { return lastName; }
    public void setLastName(String lastName) { this.lastName = lastName; }

    @Override
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj == null || obj.getClass() != this.getClass()) {
            return false;
        }

        MyPerson client = (MyPerson) obj;
        return id == client.id
                && (firstName == client.firstName || (firstName != null && firstName.equals(client.getFirstName())))
                && (lastName  == client.lastName  || (lastName  != null && lastName .equals(client.getLastName ())));
    }

    public String toJson(Object obj){
        Gson gson = new Gson();
        return gson.toJson(obj);
    }
}