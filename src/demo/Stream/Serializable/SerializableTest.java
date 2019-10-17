package demo.Stream.Serializable;

import java.io.*;

public class SerializableTest {
    public static void main(String[] args){
        User user = new User("hupeng","hupeng");
        File file = new File("Resource/Serializable/User.txt");
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
            objectOutputStream.writeObject(user);
            objectOutputStream.close();
            fileOutputStream.close();
            FileInputStream fileInputStream = new FileInputStream(file);
            ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
            try {
                User user1 = (User) objectInputStream.readObject();
                System.out.println(user1.toString());
            } catch (ClassNotFoundException e) {
                e.printStackTrace();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
