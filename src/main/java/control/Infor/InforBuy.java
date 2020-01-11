package control.Infor;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import dao.DataDAO;
import dao.DataDAOImp;

import java.util.Map;

public class InforBuy extends ActionSupport {
    private String carid;

    public String getCarid() {
        return carid;
    }

    public void setCarid(String carid) {
        this.carid = carid;
    }

    public String execute() throws Exception {
        Map session = ActionContext.getContext().getSession();
        String uid =(String)session.get("uid");
        DataDAO data = new DataDAOImp();
        data.inforbuy(uid,carid);
        return SUCCESS;
    }
}
