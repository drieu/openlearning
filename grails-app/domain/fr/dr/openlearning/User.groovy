package fr.dr.openlearning

class User {

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

    static hasMany = [courses : Course]


    @Override
    String toString() {
        return "User{" +
                "id=" + id +
                ", version=" + version +
                ", courses=" + courses +
                ", name='" + name + '\'' +
                ", login='" + login + '\'' +
                ", password='" + password + '\'' +
                ", org_grails_datastore_mapping_dirty_checking_DirtyCheckable__$changedProperties=" + org_grails_datastore_mapping_dirty_checking_DirtyCheckable__$changedProperties +
                ", org_grails_datastore_gorm_GormValidateable__skipValidate=" + org_grails_datastore_gorm_GormValidateable__skipValidate +
                ", org_grails_datastore_gorm_GormValidateable__errors=" + org_grails_datastore_gorm_GormValidateable__errors +
                '}'
    }
}
