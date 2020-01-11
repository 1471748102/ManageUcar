package control.Normal;


import com.opensymphony.xwork2.ActionSupport;
import dao.DataDAO;
import dao.DataDAOImp;

public class NormalDelete extends ActionSupport {
    private String useid;

    public String getUseid() {
        return useid;
    }

    public void setUseid(String useid) {
        this.useid = useid;
    }

    public String execute() throws Exception {

        boolean isSuc = false;
        DataDAO data = new DataDAOImp();
        try {
            isSuc = data.delete(useid);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return isSuc? SUCCESS : ERROR;

    }
}
