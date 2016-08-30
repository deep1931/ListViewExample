package stem.list.model;

/**
 * Created by sandeep on 8/27/16.
 */

//another class to handle item's id and name
public class UserModel {

    public String emailId;
    public String name;
    public String timestamp;

    // constructor
    public UserModel(String email_id, String name, String timestamp) {
        this.emailId = email_id;
        this.name = name;
        this.timestamp = timestamp;
    }

    public String getEmailId() {
        return emailId;
    }

    public void setEmailId(String emailId) {
        this.emailId = emailId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(String timestamp) {
        this.timestamp = timestamp;
    }
}