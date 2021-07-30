package com.fp.principles.principles;

import java.util.List;
import java.util.Optional;
import java.util.function.Function;

import static com.fp.principles.principles.BasicGenericFunctions.print;

public class DemoFunctionsAsFirstClassEntities {

    public static void main(String[] args) {
        //assignment to variable
        Function<Integer, Integer> f = DemoFunctionsAsFirstClassEntities::square;
        print(f);

        //call through assigned variable
        Integer result1 = f.apply(5); //result1 = 25
        print(result1);

        //pass variable to other function
        Integer result2 = Optional.of(10).map(f).get(); //result2 = 100
        print(result2);

        //pass function reference to other function
        Integer result3 = Optional.of(2).map(DemoFunctionsAsFirstClassEntities::square).get(); //result3 = 4
        print(result3);


        //get the function as a result of other function call, and call/use it
        Integer result4 = getSquareFunction().apply(5); //result4 = 25
        print(result4);

        //pass the function returned as a result of other function call to function
        Integer result5 = Optional.of(10).map(getSquareFunction()).get(); //result5 = 100
        print(result5);


        //store functions in a data structure
        List<Function<Integer, Integer>> functions = List.of(DemoFunctionsAsFirstClassEntities::square, getSquareFunction());
        print(functions);
    }

    //get the function as a result of other function call
    static Function<Integer, Integer> getSquareFunction() {
        return DemoFunctionsAsFirstClassEntities::square;
    }

    static Integer square(Integer i) {
        return i * i;
    }

}
