import com.opensymphony.xwork2.ActionSupport;

public class Login extends ActionSupport {

    private static final long serialVersionUID=1;

    private Person person;


    public String execute() throws Exception {

        return SUCCESS;
    }

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }
}
