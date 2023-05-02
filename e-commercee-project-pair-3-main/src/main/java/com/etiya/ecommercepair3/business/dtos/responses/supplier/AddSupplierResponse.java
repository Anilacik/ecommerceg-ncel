package com.etiya.ecommercepair3.business.dtos.responses.supplier;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class AddSupplierResponse {
    private Integer id;
    private String name;
}
