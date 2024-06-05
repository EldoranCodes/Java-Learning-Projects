package OOP.Encapsulation.User;

public class User {
    private int userID;
    private String username;
    private String firstName, lastName;

    User(int UserID, String username, String firstname, String lastname){
        this.userID = userID;
        this.username = username;
        this.firstName = firstname;
        this.lastName = lastname;       
    }
    //this is a sample of setter method
    void setUserID(int UserID){
        this.userID = userID;
    }
    // this is a sample getter method
    int getUserID(){
        return userID; 
    }
}
