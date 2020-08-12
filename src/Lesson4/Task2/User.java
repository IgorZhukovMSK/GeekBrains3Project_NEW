package Lesson4.Task2;

public class User extends Main {

    private String name;
    private String mfu;

    public User(String name, String mfu) {
        this.name = name;
        this.mfu = mfu;
    }

    public String getName() {
        return name;
    }

    public String getMfu() {
        return mfu;
    }
}
