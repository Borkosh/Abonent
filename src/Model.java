import java.util.ArrayList;
import java.util.List;

public class Model {
    List<String> logins = new ArrayList<String>();
    List<String> passwords = new ArrayList<String>();
    private View view;
    private Autorization autorization;
    private ListAbonents listAbonents;
    private List<Abonent> abonentList = new ArrayList<Abonent>();

    public Model(View view) {
        this.view = view;

        setUsers();
        setAbonentList();
    }

    private void setAbonentList(){
        abonentList.add(new Abonent(1,"32111222","Ilgiz","0555 121213"));
        abonentList.add( new Abonent(1,"32134322","Murat","0535 555555"));
        abonentList.add(new Abonent(1,"32123322","Ermek","0545 155513"));
    }

    private void setUsers(){
       logins.add("ilgiz");
       passwords.add("222");

       logins.add("murat");
       passwords.add("111");
    }


    public void checkLogin(String login,String password){
       if (logins.contains(login)){
            String pass = passwords.get(logins.indexOf(login));
           System.out.println(pass + "pass");
           System.out.println("PASSWORD INPUT= " + password);
           String passwordFromArray;
/*           for(int i = 0; i < password.length; i++) {
               passwordFromArray.
           }*/
            //char[] passwordArrayChar = pass.toCharArray();
            if (pass.equals(password)){
                setReference();
                autorization.setVisible(false);
                listAbonents.setVisible(true);

                System.out.println("okay");
            } else {
                System.out.println("Incorrect passwod");
            }
       }else{
           System.out.println("Incorrect Login");
       }
    }

    public void openDB(){

    }

    public List<Abonent> getAbonentList(){
        return abonentList;
    }

    public Abonent getAbonent(int index){
        return abonentList.get(index);
    }
    public void setReference(){
        autorization = view.getReferenceAutorization();
        listAbonents = view.getReferenceListAbonents();
    }

}
