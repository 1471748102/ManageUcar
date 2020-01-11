package control;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

import java.util.Map;

public class Bunding extends ActionSupport {

    private String uid;

    public String getUid() {
        return uid;
    }

    public void setUid(String uid) {
        this.uid = uid;
    }

    public String execute() throws Exception {
        Map session = ActionContext.getContext().getSession();
        session.put("uid",uid);
        System.out.println(uid);
        return SUCCESS;
    }
}
