package DesignPattens;

public class User {

    private String id;

    private String name;

    private String address;

    private String phone;

    private int age;

    private User (UserBuider buider){
        this.id = buider.id;
        this.name = buider.name;
        this.address = buider.address;
        this.phone = buider.phone;;
        this.age = buider.age;
    }

    public static UserBuider buider (){
        return new UserBuider();
    };


    public static class UserBuider{

        private String id;

        private String name;

        private String address;

        private String phone;

        private int age;

        private UserBuider(){

        }

        public UserBuider id (String id){
            this.id = id;
            return this;
        }

        public UserBuider name (String name){
            this.name = name;
            return this;
        }

        public UserBuider address (String address){
            this.address = address;
            return this;
        }

        public UserBuider phone (String phone){
            this.phone = phone;
            return this;
        }

        public UserBuider age (int age){
            this.age = age;
            return this;
        }

        public User build(){
            return new User(this);
        }

    }
}
