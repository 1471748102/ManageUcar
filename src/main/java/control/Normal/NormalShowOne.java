package control.Normal;

import bean.CarInfo;
import bean.Normal;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import dao.DataDAO;
import dao.DataDAOImp;

import java.util.List;
import java.util.Map;

public class NormalShowOne extends ActionSupport {

    private List<Normal> nso;
    private  String showone;

    public List<Normal> getNso() {
        return nso;
    }

    public String getShowone() {
        return showone;
    }

    public void setNso(List<Normal> nso) {
        this.nso = nso;
    }

    public void setShowone(String showone) {
        this.showone = showone;
    }

    public String execute() throws Exception {

        //取出Session的值
        Map session = ActionContext.getContext().getSession();
        String showone =(String)session.get("uid");
        System.out.println(showone);
        DataDAO data = new DataDAOImp();
        nso=data.normalshowone(showone);
        ActionContext.getContext().put("nso",nso);
        return SUCCESS;
    }
}
