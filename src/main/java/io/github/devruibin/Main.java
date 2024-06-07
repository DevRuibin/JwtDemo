package io.github.devruibin;

public class Main {
    public static void main(String[] args) {
        JwtService jwtService = new JwtService();
        User user = new User("devruibin",
           "ruibin.zhang@student.ucalouvain.be",
            12L,
            Role.ADMIN);
        String token = jwtService.generateToken(user);
        System.out.println("Token: " + token);
        User parsedUser = jwtService.parseToken(token);
        System.out.println(parsedUser);

    }
}