package control.Infor;

import bean.CarInfo;
import bean.Normal;
import com.opensymphony.xwork2.ActionSupport;
import dao.DataDAO;
import dao.DataDAOImp;

public class InforAdd extends ActionSupport {
    private CarInfo cared;
    private int flags;

    public CarInfo getCared() {
        return cared;
    }

    public void setCared(CarInfo cared) {
        this.cared = cared;
    }

    public String execute() throws Exception {
        DataDAO data = new DataDAOImp();
        flags =data.addinfor(cared);
        if(flags!=0)
            return ERROR;
        else
            return SUCCESS;
    }
}
