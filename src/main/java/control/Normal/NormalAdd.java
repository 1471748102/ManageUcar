package control.Normal;

import bean.Normal;
import com.opensymphony.xwork2.ActionSupport;
import dao.DataDAO;
import dao.DataDAOImp;

public class NormalAdd extends ActionSupport {

    private Normal uuk;
    private int flags;

    public Normal getUuk() {
        return uuk;
    }

    public void setUuk(Normal uuk) {
        this.uuk = uuk;
    }
    public String execute() throws Exception {
        DataDAO data = new DataDAOImp();
        flags =data.addnormal(uuk);
        if(flags!=0)
            return ERROR;
        else
        return SUCCESS;
    }

}
