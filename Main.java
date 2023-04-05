public class Main{
    public static void main(String[] args){
        Persister saveInTxt = new TxtFileUserSaver();
        User user = new User("Bob", saveInTxt);
        user.report();
        user.save();
    }
}
