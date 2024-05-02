package ua.edu.duan.dto;


import javax.persistence.*;
import java.util.Date;

import jakarta.persistence.*;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;


@Entity
@Table(name = "documents")
@Getter
@Setter
public class Document {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String name;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private DocumentType type;

    @Column(nullable = false, columnDefinition = "TEXT")
    private String body;

    @Column(nullable = false)
    private Date creationDate;

    @Column(nullable = true)
    private Date signatureDate;

    @Column(nullable = false)
    private String userLogin;

    // Constructors, getters, setters
    public Document() {
    }

    public Document(String name, DocumentType type, String body, Date creationDate, Date signatureDate, String userLogin) {
        this.name = name;
        this.type = type;
        this.body = body;
        this.creationDate = creationDate;
        this.signatureDate = signatureDate;
        this.userLogin = userLogin;
    }


}

enum DocumentType {
    LEAVE_APPLICATION,
    JOB_APPLICATION

}