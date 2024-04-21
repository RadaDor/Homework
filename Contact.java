package Phone;

public class Contact {
    public String getName;
    private String name;
    private String phone;

    public Contact(String name, String phone) {
        this.name = name;
        this.phone = phone;
    }
    public String getName() {
        return name;
    }    public String getPhone() {
        return phone;
    }

    public void setName (String newName){
            this.name = newName;
        } public void setPhone (String newPhone){
            this.phone = newPhone;
        }


    }















