package lzf.design.mode.flyweight;

/**
 * Created by Administrator on 2017/7/31 0031.
 */
public class SignInfo {
    private String id;
    private String location;
    private String subject;
    private String address;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "SignInfo{" +
                "id='" + id + '\'' +
                ", location='" + location + '\'' +
                ", subject='" + subject + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}
