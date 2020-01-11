package bean;

public class CarInfo {
    private String carid,cartype,carfix,worn,content,money,number,email,state;

    public CarInfo() {
    }

    public CarInfo(String carid, String cartype, String carfix, String worn, String content, String money, String number, String email, String state) {
        super();
        this.carid = carid;
        this.cartype = cartype;
        this.carfix = carfix;
        this.worn = worn;
        this.content = content;
        this.money = money;
        this.number = number;
        this.email = email;
        this.state = state;
    }

    public String getCarid() {
        return carid;
    }

    public String getCartype() {
        return cartype;
    }

    public String getCarfix() {
        return carfix;
    }

    public String getWorn() {
        return worn;
    }

    public String getContent() {
        return content;
    }

    public String getMoney() {
        return money;
    }

    public String getNumber() {
        return number;
    }

    public String getEmail() {
        return email;
    }

    public String getState() {
        return state;
    }

    public void setCarid(String carid) {
        this.carid = carid;
    }

    public void setCartype(String cartype) {
        this.cartype = cartype;
    }

    public void setCarfix(String carfix) {
        this.carfix = carfix;
    }

    public void setWorn(String worn) {
        this.worn = worn;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public void setMoney(String money) {
        this.money = money;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setState(String state) {
        this.state = state;
    }
}
