package interfacesNlambda.lambda;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<User> users = List.of(new User("Murilo", 20), new User("Manuela", 17), new User("Márcia", 58));
        users.forEach((User user) -> {
            System.out.println(user);
            //Dá para usar um method reference nesse caso tb System.out::println
        });
    }
}
