import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Controller implements ActionListener {
    View view;
    private Model model;
    public Controller(View view) {
        model = new Model(view);
        this.view=view;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String command = e.getActionCommand();
        System.out.println("ACtion = " + command);
        switch (command){
            case "OK":
                String login = view.getLogin();
                String password = view.getPassword();
                model.checkLogin(login,password);
                break;

        }

    }
    public Model getLinkModel(){
        return model;
    }
}
