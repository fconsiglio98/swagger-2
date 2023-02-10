package co.develhope.swagger2.controllers;

import co.develhope.swagger2.entities.ArithmeticOperation;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.*;

@RequestMapping(value = "/math")
@RestController
@Api(value = "The API for math operations")
public class MathController {

    @GetMapping(value = "")
    @ApiOperation("Prints a welcome message")
    public String welcomeMathMsg() {
        return "Welcome to Math API!";
    }

    @GetMapping(value = "/division-info")
    @ApiOperation("Returns a new ArithmeticOperation object with all the details about the division")
    public ArithmeticOperation getDivisionInfo() {
        return new ArithmeticOperation("Division", 2, "dividend / divisor = quotient", new String[]{"Invariant property", "Distributive property"});
    }

    @GetMapping(value = "/multiplication")
    @ApiOperation("Takes two int parameters and returns the multiplication value")
    public Integer multiplication(@RequestParam int factor1, @RequestParam int factor2) {
        return factor1 * factor2;
    }


    @GetMapping(value = "/square/{n}")
    @ApiOperation("Takes an 'n' as path variable and returns the square of the 'n'")
    public Integer square(@PathVariable(value = "n") int n){
        return n * n;
    }
}