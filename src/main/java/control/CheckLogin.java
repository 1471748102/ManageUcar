package control;

import bean.Message;
import bean.User;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import dao.DataDAO;
import dao.DataDAOImp;

import java.util.Map;

public class CheckLogin extends ActionSupport {

    private User uk ;
    private Message ms;

    public User getUk() {
        return uk;
    }

    public void setUk(User uk) {
        this.uk = uk;
    }

    public Message getMs() {
        return ms;
    }

    public void setMs(Message ms) {
        this.ms = ms;
    }

    public void validate(){

        if(uk.getPassword()==null || uk.getPassword().length()==0 || uk.getName() ==  null || uk.getName().length()==0)
        {
            addFieldError("uka",this.getText("账号或者密码不能为空！"));
        }
        if(!ms.getWord().equals(ms.getYanzheng())) {
            addFieldError("uka",this.getText("验证码错误！"));
        }
        if((ms.getP1()==null || ms.getP1().length()==0) &&( ms.getP2()==null || ms.getP2().length()==0)) {
            addFieldError("uka",this.getText("您没有选择身份登录！"));
        }

    }


    public String execute() throws Exception {

        System.out.println(ms.getWord());
        System.out.println(ms.getYanzheng());
        System.out.println(ms.getP1());
        System.out.println(ms.getP2());
        System.out.println(uk.getName());
        System.out.println(uk.getPassword());


        Map session = ActionContext.getContext().getSession();
        session.put("p1",ms.getP1());
        session.put("p2",ms.getP2());
        session.put("YouName",uk.getName());


        if ("normal".equals(ms.getP1())) {
            DataDAO data = new DataDAOImp();
            boolean flag = data.inter(uk);
            return flag ? SUCCESS : ERROR;

        }
        else if("admin".equals(ms.getP2())){
            DataDAO data = new DataDAOImp();
            boolean flag = data.interadmin(uk);
            return flag ? SUCCESS : ERROR;

        }
        else
        return ERROR;

    }
}
