package com.codegym.model;

import lombok.*;

import javax.persistence.*;
import java.sql.Date;


@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
@Table(name = "products")
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String productName;
    private String description;
    private double price;
    private Date createDate;
    @ManyToOne
    private Category category;
}
