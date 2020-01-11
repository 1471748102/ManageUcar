package bean;

public class Normal {
    private String useid;
    private String usename;
    private String usesex;
    private String usetel;
    private String useaddress;
    private String useindex;

    public Normal(){ }

    public Normal(String useid,String usename,String usesex,String usetel,String useaddress,String useindex){
        super();
        this.useid=useid;
        this.usename=usename;
        this.usesex=usesex;
        this.usetel=usetel;
        this.useaddress=useaddress;
        this.useindex=useindex;

    }

    public String getUseid() {
        return useid;
    }

    public String getUsename() {
        return usename;
    }

    public String getUsesex() {
        return usesex;
    }

    public String getUsetel() {
        return usetel;
    }

    public String getUseaddress() {
        return useaddress;
    }

    public String getUseindex() {
        return useindex;
    }

    public void setUseid(String useid) {
        this.useid = useid;
    }

    public void setUsename(String usename) {
        this.usename = usename;
    }

    public void setUsesex(String usesex) {
        this.usesex = usesex;
    }

    public void setUsetel(String usetel) {
        this.usetel = usetel;
    }

    public void setUseaddress(String useaddress) {
        this.useaddress = useaddress;
    }

    public void setUseindex(String useindex) {
        this.useindex = useindex;
    }
}
