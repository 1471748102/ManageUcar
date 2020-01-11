package control.Infor;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import dao.DataDAO;
import dao.DataDAOImp;

import java.util.Map;

public class BuyShop extends ActionSupport {
    private String carid;

    public String getCarid() {
        return carid;
    }

    public void setCarid(String carid) {
        this.carid = carid;
    }

    public String execute() throws Exception {
        DataDAO data = new DataDAOImp();
        data.buyshop(carid);
        return SUCCESS;
    }
}
