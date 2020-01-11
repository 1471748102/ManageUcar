package control.Infor;

import com.opensymphony.xwork2.ActionSupport;
import dao.DataDAO;
import dao.DataDAOImp;

public class InforDelete extends ActionSupport {

    private String carid;

    public String getCarid() {
        return carid;
    }

    public void setCarid(String carid) {
        this.carid = carid;
    }

    public String execute() throws Exception {

        boolean isSuc = false;
        DataDAO data = new DataDAOImp();
        try {
            isSuc = data.infordelete(carid);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return isSuc? SUCCESS : ERROR;

    }
}
