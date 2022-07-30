package com.example.ead.entity;

import lombok.*;
import javax.persistence.*;
import java.time.LocalDateTime;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Builder
@Entity
@Table(name = "products")
public class Product{
    @Id
    private String id;
    private String ProdName;
    private String description;
    private LocalDateTime dateOfManf;
    private double price;
}
