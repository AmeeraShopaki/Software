package t;

import java.util.logging.Level;
import java.util.logging.Logger;

public class patient {
    Logger logger
            = Logger.getLogger(patient.class.getName());
    private   String Pname;
    private  String address;
    private  String isbn;
    private String phone;

    public void setPname(String Pname) {
        this.Pname = Pname;
    }

    public void setAddress(String address) {
        this.address =address ;
    }

    public void setISBN(String isbn) {
        this.isbn = isbn;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getPname() {
        return Pname;
    }

    public  String getAddress() {
        return address;
    }

    public String getISBN() {
        return isbn;
    }

    public String getphone() { return phone; }





    public patient() {
    }

    public patient(String n, String a, String i, String ph){
    	setPname(n);
            setAddress(a);
            setISBN(i);
            setPhone(ph);
    }

   
    public void print(){
        String n =String.format(this.getAddress(),"\t"+this.getPname(),"\t"+this.getISBN(),"\t"+this.getphone(),"\n");
        logger.log(Level.INFO,n );
    }
}
