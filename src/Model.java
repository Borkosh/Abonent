import java.util.ArrayList;
import java.util.List;

public class Model {
    List<String> logins = new ArrayList<String>();
    List<String> passwords = new ArrayList<String>();

    public Model(View view) {
        setUsers();

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

}
