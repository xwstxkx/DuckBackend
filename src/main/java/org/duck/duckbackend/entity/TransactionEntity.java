package org.duck.duckbackend.entity;

import jakarta.persistence.*;
import lombok.*;
import org.duck.duckbackend.enums.CategoryEnum;
import org.duck.duckbackend.enums.TypeEnum;

@Entity
@Table(name = "transactions")
@Builder
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class TransactionEntity {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "name")
    private String name;
    @Column(name = "uid")
    private String UID;
    @Column(name = "date")
    private String date;
    @Column(name = "type")
    private TypeEnum type;
    @Column(name = "category")
    private CategoryEnum category;
    @Column(name = "sum")
    private Long sum; //!!!В копейках
    @ManyToOne
    @JoinColumn(name = "user_id")
    private UserEntity user;
}
