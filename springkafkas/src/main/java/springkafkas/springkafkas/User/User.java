package springkafkas.springkafkas.User;
public class User {

    private String surname;
    private String departman;
    private String name;

    public User(String name, String surname, String departman) {
        this.name = name;
        this.surname = surname;
        this.departman = departman;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getDepartman() {
        return departman;
    }

    public void setDepartman(String departman) {
        this.departman = departman;
    }



}
