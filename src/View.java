public class View {

    Autorization autorization;

    public View() {
        Controller controller = new Controller(this);
        runAutorization(controller);
    }

    public void runAutorization(Controller controller){
        autorization =new Autorization(controller);
    }

    public String getLogin(){
        return autorization.getLogin();
    }

    public String getPassword(){
        return autorization.getPassword();
    }




}
