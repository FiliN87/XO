package org.filin;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UsersQueue {
    List listA = new ArrayList();
    private final List<String> users = new ArrayList<>();

    public void addList() {
        listA.add("element 1");
        listA.add("element 2");
        listA.add("element 3");
        listA.add("element 4");
        System.out.println(listA);
    }
//    public void addUsers() {
//        addUsers("user_1");
//
//    }
    public class User {
        private String name;
        private String password;

        public User() {
        }
        public User(String name, String password) {
            this.name = name;
            this.password = password;
        }
        public String getName() {
            return name;
        }
        public void setName(String name) {
            this.name = name;
        }
        public String getPassword() {
            return password;
        }
        public void setPassword(String password) {
            this.password = password;
        }
        @Override
        public String toString() {
            return "User{" +
                    "name='" + name + '\'' +
                    ", password='" + password + '\'' +
                    '}';
        }
        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            User user = (User) o;
            if (name != null ? !name.equals(user.name) : user.name != null) return false;
            return password != null ? password.equals(user.password) : user.password == null;
        }
        @Override
        public int hashCode() {
            int result = name != null ? name.hashCode() : 0;
            result = 31 * result + (password != null ? password.hashCode() : 0);
            return result;
        }
    }
//    public class Model {
//        private static Model instance = new Model();
//
//        private List<User> model;
//
//        public static Model getInstance() {
//            return instance;
//        }
//
//        private Model() {
//            model = new ArrayList<>();
//        }
//
//        public void add(User user) {
//            model.add(user);
//        }
//
//        public List<String> list() {
//            return model.stream()
//                    .map(User::getName)
//                    .collect(Collectors.toList());
//        }
//    }
}
