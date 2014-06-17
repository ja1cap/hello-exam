import java.io.Serializable;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Data implements Serializable, Cloneable {

    private String email;

    private Integer phone;

    public Data(String email, Integer phone) {
        this.email = email;
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public Integer getPhone() {
        return phone;
    }

    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Data)) return false;

        Data data = (Data) o;

        if (!email.equals(data.email)) return false;
        if (!phone.equals(data.phone)) return false;

        return true;
    }

    public int hashCode() {
        return 31 * email.hashCode() + phone.hashCode();
    }

    protected Data clone() throws CloneNotSupportedException {
        Data data = (Data)super.clone();
        data.email = "clone@email.com";
        return data;
    }

    public void print(){

        System.out.print("email: " + this.getEmail() + ", ");
        System.out.print("phone: " + this.getPhone() + ", ");
        System.out.println("hash code: " + this.hashCode());

    }

    private void writeObject(ObjectOutputStream o)
            throws IOException {

        o.writeObject(phone);
        o.writeObject(email);

    }

    private void readObject(ObjectInputStream o)
            throws IOException, ClassNotFoundException {

        phone = (Integer) o.readObject();
        email = (String) o.readObject();

    }
}
