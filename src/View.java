public class View {

    private Autorization autorization;
    private ListAbonents listAbonents;

    public View() {
        Controller controller = new Controller(this);
        runAutorizationFrame(controller);
        runListAbonensFrame(controller);
    }

    public void runAutorizationFrame(Controller controller){
        autorization =new Autorization(controller);
    }

    public void runListAbonensFrame(Controller controller){
        listAbonents =new ListAbonents(controller);
    }


    public String getLogin(){
        return autorization.getLogin();
    }

    public String getPassword(){
        return autorization.getPassword();
    }

    public Autorization getReferenceAutorization(){
        System.out.println(autorization + " link");
        return autorization;
    }

    public ListAbonents getReferenceListAbonents(){
        return listAbonents;
    }




}
