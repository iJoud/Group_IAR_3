
package RandJLawFirm;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class User extends Employee {

    public String password;
    public String email;
    public static ArrayList<User> UserDb = new ArrayList<>();
    public static File database = new File("UserDataBase.txt");
    private static String CurrentUserID;

    public User(String ID, String password, String email) {
        super(ID);
        this.password = password;
        this.email = email;
    }

    public User(String ID, String password) {
        super(ID);
        this.password = password;
    }

    static void ReadInformations() throws FileNotFoundException {
        if (UserDb.isEmpty()) {
            Scanner scan = new Scanner(database);
            while (scan.hasNextLine()) {
                UserDb.add(new User(scan.nextLine(), scan.nextLine(), scan.nextLine()));
            }
        }
    }

//    public static void ReadInformations() throws FileNotFoundException {
//
//        if (UserDb.isEmpty()) {// if not empty, thats mean it alredy enter this method
//            File UserFile = new File("UserDataBase.txt");
//            Scanner scan = new Scanner(UserFile);
//            while (scan.hasNextLine()) {
//                // add existing application users to arraylist
//                UserDb.add(new User(scan.nextLine(), scan.nextLine(), scan.nextLine()));
//            }
//        }
//    }
    public String getID() {
        return super.getID();
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    public static void RegisterUser(User newUser) throws FileNotFoundException, IOException {

        // Appened new information on existing file
        try (FileWriter UsersFile = new FileWriter("UserDataBase.txt", true);
                // BufferedWriter and Printer declaration
                BufferedWriter bufferWriter = new BufferedWriter(UsersFile);
                PrintWriter printer = new PrintWriter(bufferWriter)) {
            // add new user informations
            printer.println(newUser.getID());
            printer.println(newUser.getPassword());
            printer.println(newUser.getEmail());
            CurrentUserID = newUser.getID();

        } catch (IOException e) {

        }

    }

    public static Boolean isIDExist(String ID) {

        for (int i = 0; i < UserDb.size(); i++) {
            if (UserDb.get(i).getID().equals(ID)) {
                return true;
            }
        }
        return false;
    }

    public static boolean checkLogInInformation(String ID, String Password) throws FileNotFoundException {
        User.ReadInformations();
        Boolean Found = false;

        for (int i = 0; i < User.UserDb.size(); i++) {
            if (User.UserDb.get(i).getID().equals(ID) && User.UserDb.get(i).getPassword().equals(Password)) {
                Found = true;
                CurrentUserID = ID;
                break;
            }
        }
        return Found;
    }

    public static String getCurrentUserID() {
        return CurrentUserID;
    }

    
    @Override
    public String toString() {
        return super.toString(); //To change body of generated methods, choose Tools | Templates.
    }

}
