package control.Normal;

import bean.Normal;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import dao.DataDAO;
import dao.DataDAOImp;

import java.util.Map;

public class NormalUpdate extends ActionSupport {
    private Normal nora,nord,norb,nore;

    public Normal getNora() {
        return nora;
    }

    public void setNora(Normal nora) {
        this.nora = nora;
    }

    public Normal getNord() {
        return nord;
    }

    public void setNord(Normal nord) {
        this.nord = nord;
    }

    public String execute() throws Exception {
        DataDAO data = new DataDAOImp();
        Map session = ActionContext.getContext().getSession();
        String normal =(String)session.get("normal");
        String admin =(String)session.get("admin");
        System.out.println(normal+"kkk");
        System.out.println(admin+"kkk");
        //a  normal
        //d  admin
        if("normal".equals(normal) )
        {
            session.put("normal",null);
            norb=data.update(nora);
        }

        if("admin".equals(admin)){
            session.put("admin",null);
            nore=data.update(nord);
        }

        return SUCCESS;
    }
}
