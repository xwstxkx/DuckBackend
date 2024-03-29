package org.duck.duckbackend.model;

import lombok.*;

@Builder
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class CheckModel {

    private String uid;
    private String date;
    private String category;
    private String type;
    private String budgetName;
}
