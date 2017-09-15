package fr.dr.openlearning

class User {

    static mapping = {
        table name: "openuser"
    }

    static constraints = {
    }

    /**
     * User name.
     */
    String name

    /**
     * User login ( email ).
     */
    String login

    /**
     * User Password.
     */
    String password

    //static hasMany = [courses : Course]


    @Override
    String toString() {
        return "User{" +
                "id=" + id +
                ", version=" + version +
                ", courses=" + courses +
                ", name='" + name + '\'' +
                ", login='" + login + '\'' +
                ", password='" + password + '\'' +
                '}'
    }
}
