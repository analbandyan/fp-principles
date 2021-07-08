package com.fp.principles.dive.io.cases;

import static com.fp.principles.dive.io.IOGenericFunctions.format;
import static java.lang.System.out;

public class IOv2 {

    //impure function
    public static void convertToCelsius(double fahrenheit) {
        double celsius = fahrenheitToCelsius(fahrenheit);
        out.println(celsiusMessage(celsius));
    }

    //PURE FUNCTION
    private static double fahrenheitToCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5.0 / 9.0;
    }

    //PURE FUNCTION
    private static String celsiusMessage(double celsius) {
        return "Temperature in celsius is " + format(celsius);
    }


}
