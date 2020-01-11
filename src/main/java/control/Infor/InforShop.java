package control.Infor;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import dao.DataDAO;
import dao.DataDAOImp;

import java.util.Map;

public class InforShop extends ActionSupport {
    private String cis;

    public String getCis() {
        return cis;
    }

    public void setCis(String cis) {
        this.cis = cis;
    }

    public String execute() throws Exception {
        Map session = ActionContext.getContext().getSession();
        String uid =(String)session.get("uid");
        DataDAO data = new DataDAOImp();
        data.inforshop(uid,cis);
        return SUCCESS;
    }
}
