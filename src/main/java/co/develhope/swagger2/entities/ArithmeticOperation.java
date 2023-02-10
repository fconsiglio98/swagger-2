package co.develhope.swagger2.entities;

import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ArithmeticOperation {
    @ApiModelProperty(value = "The name of the arithmetic operation", example = "Addition")
    private String name;
    @ApiModelProperty(value = "Minimum number of operands that are necessary to computer the operation ", example = "2")
    private int minNumberOfOperands;
    @ApiModelProperty(value = "The description of the operation", example = "addend + addend = sum")
    private String description;
    @ApiModelProperty(value = "A list of properties of the specific operation",
            example = "['Anti-commutativity', 'Non-associativity', 'Predecessor']")
    private String[] properties;
}
