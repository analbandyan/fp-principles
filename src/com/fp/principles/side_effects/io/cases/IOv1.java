package com.fp.principles.side_effects.io.cases;

import static com.fp.principles.side_effects.io.IOGenericFunctions.format;
import static java.lang.System.out;

public class IOv1 {

    //impure function
    public static void convertToCelsius(double fahrenheit) {
        double celsius = (fahrenheit - 32) * 5.0 / 9.0;
        out.println("Temperature in celsius is " + format(celsius));
    }

}
