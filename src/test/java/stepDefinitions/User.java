package stepDefinitions;

public class User {

    public String firstName;
    public String emailId;
    public String phoneNo;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getEmailId() {
        return emailId;
    }

    public void setEmailId(String emailId) {
        this.emailId = emailId;
    }

    public String getPhoneNo() {
        return phoneNo;
    }

    public void setPhoneNo(String phoneNo) {
        this.phoneNo = phoneNo;
    }

    public String toString(){

        String result = "[\n";
        result = result + firstName + "\n";
        result = result + emailId + "\n";
        result = result + phoneNo + "\n";
        result = result + "]";

        return result;
    }
}
