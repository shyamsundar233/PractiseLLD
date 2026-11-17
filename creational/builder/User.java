package creational.builder;

public class User {
    private Long id;
    private String name;
    private String email;
    private int enabled;

    public User() {}

    @Override
    public String toString() {
        return "User [id=" + id + ", name=" + name + ", email=" + email + ", enabled=" + enabled + "]";
    }

    public static class Builder{
        private User user = new User();

        public Builder id(Long id){
            user.id = id;
            return this;
        }
        public Builder name(String name){
            user.name = name;
            return this;
        }
        public Builder email(String email){
            user.email = email;
            return this;
        }
        public Builder enabled(int enabled){
            user.enabled = enabled;
            return this;
        }
        public User build(){
            return user;
        }
    }
}
