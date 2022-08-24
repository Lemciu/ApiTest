package pl.ml;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class UserService {

    private static final String URL = "https://jsonplaceholder.typicode.com/posts/";

    public static String getPosts() {
        String result = "";
        RestTemplate restTemplate = new RestTemplate();
        User[] users = restTemplate.getForObject(URL, User[].class);
        for (User user : users) {
            result += user.toString() + "\n";
        }
        return result;
    }
}
