public class Abonent {

    private int id;
    private String account;
    private String name;
    private String telephone;


    public Abonent(int id, String account, String name, String telephone) {

        this.id = id;
        this.account = account;
        this.name = name;
        this.telephone = telephone;
    }

    public int getId() {
        return id;
    }

    public String getAccount() {
        return account;
    }

    public String getName() {
        return name;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }


}
