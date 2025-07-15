package org.cicababba.replybe.model;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.Date;

@Data
@AllArgsConstructor
public class Request {

    private String title;
    private String description;
    private Date creationDate;

}
