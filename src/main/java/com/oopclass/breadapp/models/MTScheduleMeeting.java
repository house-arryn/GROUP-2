package com.oopclass.breadapp.models;

import java.time.LocalDate;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "appointment")
public class MTScheduleMeeting {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", updatable = false, nullable = false)
    private long id;

    private String full_name;
    private String contact_number;
    private String address;
    private LocalDate doa;
    private String answer;   
   

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getFullName() {
        return full_name;
    }

    public void setFullName(String full_name) {
        this.full_name = full_name;
    }
     
      public String getContactNumber() {
        return contact_number;
    }

    public void setContactNumber(String contact_number) {
        this.contact_number = contact_number;
    }
    
      public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
    
      public LocalDate getDoa() {
        return doa;
    }

    public void setDoa(LocalDate doa) {
        this.doa = doa;
    }
    
    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }
     
    

    @Override
    public String toString() {
        return "Mightytea [id=" + id + ", fullName=" + full_name + "]";
    }

}