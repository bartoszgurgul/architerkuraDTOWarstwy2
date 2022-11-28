package main.structuralpattern.adapter.dto;

import java.util.StringTokenizer;

public class EmpoyeeCSVDto {
    private int id;
    private String firstName;
    private String lastName;
    private String emailAdress;

    public EmpoyeeCSVDto(String value){
        StringTokenizer stringTokenizer = new StringTokenizer(value, ",");
        if (stringTokenizer.hasMoreTokens()){
            id = Integer.parseInt(stringTokenizer.nextToken());
        }
        if (stringTokenizer.hasMoreTokens()){
            firstName = stringTokenizer.nextToken();
        }
        if (stringTokenizer.hasMoreTokens()){
            lastName = stringTokenizer.nextToken();
        }
        if (stringTokenizer.hasMoreTokens()){
            emailAdress = stringTokenizer.nextToken();
        }

    }

    public int getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getEmailAdress() {
        return emailAdress;
    }
}
