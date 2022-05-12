package com.j.bizcard.web.dto;

import com.j.bizcard.domain.BizCard;
import lombok.Data;

@Data
public class BizCardSaveDto {
    private String name;
    private String phoneNumber;
    private String companyName;
    private String department;
    private String address;
    private String url;

    public BizCard toEntity(){
        BizCard bizCard = new BizCard();
        bizCard.setName(name);
        bizCard.setPhoneNumber(phoneNumber);
        bizCard.setCompanyName(companyName);
        bizCard.setDepartment(department);
        bizCard.setAddress(address);
        bizCard.setUrl(url);

        return bizCard;
    }
}
