package dev.asjordi.model;

/**
 *
 * @author Jordi <ejordi.ayala@gmail.com>
 */
public class Owner {
    
    private Integer id;
    private String name;
    private String phone;
    private String address;

    public Owner() {}

    public Owner(String name, String phone, String address) {
        this.name = name;
        this.phone = phone;
        this.address = address;
    }

    public Owner(Integer id, String name, String phone, String address) {
        this(name, phone, address);
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

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

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Owner{");
        sb.append("id=").append(id);
        sb.append(", name=").append(name);
        sb.append(", phone=").append(phone);
        sb.append(", address=").append(address);
        sb.append('}');
        return sb.toString();
    }
    
}
