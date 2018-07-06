import javax.swing.table.AbstractTableModel;
import java.util.List;

public class AbonentTableModel extends AbstractTableModel {

    private List<Abonent> listAbonents;

    public AbonentTableModel(List<Abonent> listAbonents) {
        super();
        this.listAbonents = listAbonents;
    }

    @Override
    public int getRowCount() {
        return listAbonents.size();
    }

    @Override
    public int getColumnCount() {
        return 4;
    }

    @Override
    public String getColumnName(int c) {
        String result = "";
        switch (c) {
            case 0:
                result = "id";
                break;
            case 1:
                result = "Name";
                break;
            case 2:
                result = "Account";
                break;
            case 3:
                result = "Telephone";
                break;
        }
        return result;
    }
    @Override
    public Object getValueAt(int r, int c) {
        switch (c) {
            case 0:
                return listAbonents.get(r).getId();
            case 1:
                return listAbonents.get(r).getName();
            case 2:
                return listAbonents.get(r).getAccount();
            case 3:
                return listAbonents.get(r).getTelephone();
            default:
                return "";
        }
    }
}
