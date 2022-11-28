package main.structuralpattern.adapter.dto;

public class EmpoyeeDtoLDAP {
   private String cn;
   private String surname;
   private String givenName;
   private String mail;

    public EmpoyeeDtoLDAP(String cn, String surname, String givenName, String mail) {
        this.cn = cn;
        this.surname = surname;
        this.givenName = givenName;
        this.mail = mail;
    }

    @Override
    public String toString() {
        return "EmpoyeeDtoLDAP{" +
                "cn='" + cn + '\'' +
                ", surname='" + surname + '\'' +
                ", givenName='" + givenName + '\'' +
                ", mail='" + mail + '\'' +
                '}';
    }

    public String getCn() {
        return cn;
    }

    public EmpoyeeDtoLDAP setCn(String cn) {
        this.cn = cn;
        return this;
    }

    public String getSurname() {
        return surname;
    }

    public EmpoyeeDtoLDAP setSurname(String surname) {
        this.surname = surname;
        return this;
    }

    public String getGivenName() {
        return givenName;
    }

    public EmpoyeeDtoLDAP setGivenName(String givenName) {
        this.givenName = givenName;
        return this;
    }

    public String getMail() {
        return mail;
    }

    public EmpoyeeDtoLDAP setMail(String mail) {
        this.mail = mail;
        return this;
    }
}
