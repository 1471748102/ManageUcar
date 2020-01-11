package control.Normal;

import com.opensymphony.xwork2.ActionSupport;
import dao.DataDAO;
import dao.DataDAOImp;


public class UpdatePassword extends ActionSupport {

    private String NewPassword;
    private String name;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public String getNewPassword() {
        return NewPassword;
    }

    public void setNewPassword(String newPassword) {
        NewPassword = newPassword;
    }

    public String execute() throws Exception {
        System.out.println(name);
        DataDAO data = new DataDAOImp();
        data.updatepassword(name,NewPassword);
        return SUCCESS;
    }
}
