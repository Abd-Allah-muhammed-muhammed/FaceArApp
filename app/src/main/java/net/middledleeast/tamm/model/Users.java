package net.middledleeast.tamm.model;

public class Users {
    String name;
    String phone;
    String image;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public Users(String name, String phone, String image) {
        this.name = name;
        this.phone = phone;
        this.image = image;
    }

    public Users() {
    }
}