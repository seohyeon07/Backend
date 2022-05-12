package com.j.bizcard.domain;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document(collation = "bizcard")
public class BizCard {

    @Id
    private String _id;
    private String name;
    private String phoneNumber;
    private String companyName;
    private String department;
    private String address;
    private String url;
}
