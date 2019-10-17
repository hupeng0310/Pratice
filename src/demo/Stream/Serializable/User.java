package demo.Stream.Serializable;

import java.io.Serializable;

public class User implements Serializable {
    private String userName;
    private String password;
    public boolean setUserName(String userName){
        if(userName != null){
            this.userName = userName;
            return true;
        }else {
            return false;
        }
    }
    public boolean setPassword(String password){
        if(password != null){
            this.password = password;
            return true;
        }else {
            return false;
        }
    }
    public String toString(){
        return "username: " + this.userName + "\n" + "password: " +this.password + "\n";
    }
    public User(String userName,String password){
        this.userName = userName;
        this.password = password;
    }
}
