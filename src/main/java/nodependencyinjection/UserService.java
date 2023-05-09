package nodependencyinjection;

public class UserService {
    private UserRepository userRepository;
    public UserService(){
        this.userRepository = new UserRepository();
    }
    public User getUser()
    {
        return userRepository.getUser();
    }
}
