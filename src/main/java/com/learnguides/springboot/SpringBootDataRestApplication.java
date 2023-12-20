package com.learnguides.springboot;

import com.learnguides.springboot.model.User;
import com.learnguides.springboot.respository.UserRepository;
import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.stream.Collectors;
import java.util.stream.Stream;

@SpringBootApplication
public class SpringBootDataRestApplication implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(SpringBootDataRestApplication.class, args);
    }

    @Autowired(required = true)
    UserRepository userRepository;

    @PostConstruct
    public void init() {
        userRepository.saveAll(Stream.of(
                        new User(1001, "A", "a", "a@gmail.com"),
                        new User(1002, "B", "b", "b@gmail.com"),
                        new User(1003, "C", "c", "c@gmail.com"),
                        new User(1004, "D", "d", "d@gmail.com"),
                        new User(1005, "E", "e", "e@gmail.com"))
                .collect(Collectors.toList()));
    }

    @Override
    public void run(String... args) throws Exception {

        // Builder Design Pattern Used to Insert Data

        /*User user = User.builder()
                .firstName("Abuthagir")
                .lastName("Ismail")
                .email("abu@gmail.com")
                .build();
        userRepository.save(user);

        User user1 = User.builder()
                .firstName("Riaz")
                .lastName("Rafik")
                .email("riaz@gmail.com")
                .build();
        userRepository.save(user1);

        User user2 = User.builder()
                .firstName("Bareeth")
                .lastName("Naina")
                .email("bareeth@gmail.com")
                .build();
        userRepository.save(user2);

        User user3 = User.builder()
                .firstName("Zakir")
                .lastName("Hussain")
                .email("zakir@gmail.com")
                .build();
        userRepository.save(user3);

        User user4 = User.builder()
                .firstName("Azees")
                .lastName("Farath")
                .email("azees@gmail.com")
                .build();
        userRepository.save(user4);*/

    }
}
