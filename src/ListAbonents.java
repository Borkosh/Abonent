import javax.swing.*;

public class ListAbonents {
    JFrame listAbonentsFrame,listAbonent;
    JTextField textLogin;
    JPasswordField textPassword;
    private Model model;
    private AbonentTableModel abonentTableModel;

    public ListAbonents(Controller controller) {
        model = controller.getLinkModel();
        abonentTableModel = new AbonentTableModel(model.getAbonentList());
        createListAbonentsFrame(controller);
    }

    private void createListAbonentsFrame(Controller controller){
        listAbonentsFrame = new JFrame();
        JTable tableAbonents = new JTable(abonentTableModel);
        JPanel panel = new JPanel();

        panel.add(tableAbonents);

        listAbonentsFrame.add(panel);

        listAbonentsFrame.setResizable(true);
        listAbonentsFrame.setBounds(200,200,400,200);
        listAbonentsFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        listAbonentsFrame.setVisible(false);

    }

    public void setVisible(Boolean value){
        listAbonentsFrame.setVisible(value);
    }

}
