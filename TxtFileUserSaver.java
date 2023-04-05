
public class TxtFileUserSaver implements Persister{
    @Override
    public void save(User user) {
        System.out.println("Save user: " + user.getName());
    }
}
