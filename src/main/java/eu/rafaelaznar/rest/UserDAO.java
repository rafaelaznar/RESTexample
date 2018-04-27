package eu.rafaelaznar.rest;

public class UserDAO {

    public User get() {
        User oUser = new User();
        oUser.setFirstName("Rafael");
        oUser.setLastName("Aznar");
        return oUser;
    }
}
