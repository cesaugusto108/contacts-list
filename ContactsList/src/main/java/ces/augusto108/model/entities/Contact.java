package ces.augusto108.model.entities;

import java.io.Serializable;

public class Contact implements Serializable {
    private static final long serialVersionUID = -8367428337895567750L;

    private String id;
    private String contactName;
    private String email;
    private String telephone;

    public Contact(String id, String contactName, String email, String telephone) {
        this.id = id;
        this.contactName = contactName;
        this.email = email;
        this.telephone = telephone;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getContactName() {
        return contactName;
    }

    public void setContactName(String contactName) {
        this.contactName = contactName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }
}
