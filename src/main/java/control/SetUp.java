package control;

import bean.User;
import com.opensymphony.xwork2.ActionSupport;
import dao.DataDAO;
import dao.DataDAOImp;

public class SetUp extends ActionSupport {
    private User ua,ub;

    public User getUa() {
        return ua;
    }

    public void setUa(User ua) {
        this.ua = ua;
    }

    public String execute() throws Exception {
        DataDAO data = new DataDAOImp();
        boolean bol = data.inter(ua);
        if(bol)
            return ERROR;
        else{
        int flags = data.add(ua);
        if(flags!=0) {
            return "input";
        }
        else
            return SUCCESS;
    }
    }
}
