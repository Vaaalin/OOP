
interface DataSource {
    void execute();
}
class Update implements DataSource {
    public void execute() {
        System.out.println("Updating data...");
    }
}
class View implements DataSource {
    public void execute() {
        System.out.println("Viewing data...");
    }
}
class Delete implements DataSource {
    public void execute() {
        System.out.println("Deleting data...");
    }
}

class Account {
    int id;
    String name;
    DataSource myData;

    public Account(int id, String name, DataSource myData) {
        this.id = id;
        this.name = name;
        this.myData = myData;
    }

    public void performOperation() {
        myData.execute();
    }
}
class Admin extends Account {
    String AuthPassword;

    public Admin(int id, String name, DataSource myData, String AuthPassword) {
        super(id, name, myData);
        this.AuthPassword = AuthPassword;
    }
}
class User extends Account {
    public User(int id, String name, DataSource myData) {
        super(id, name, myData);
    }
}
