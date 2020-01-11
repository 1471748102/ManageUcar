package bean;

import java.io.Serializable;

public class User implements Serializable {

    private String name;
    private String password;

    public User(){ }

    public User(String name,String password){
        super();
        this.name=name;
        this.password=password;

    }

    public String getName() {
        return name;
    }

    public String getPassword() {
        return password;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
