package br.com.BeerStock.api.model;

import br.com.BeerStock.api.enums.BeerType;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;


import javax.validation.constraints.NotBlank;

@Data
@Document
@NoArgsConstructor
@AllArgsConstructor
public class Beer {

    @Id
    private Long id;

    @NotBlank
    private String name;

    @NotBlank
    private String brand;

    @NotBlank
    private int max;

    @NotBlank
    private int quantity;

    @NotBlank
    private BeerType type;


}
