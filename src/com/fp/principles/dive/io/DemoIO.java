package com.fp.principles.dive.io;

import com.fp.principles.dive.io.cases.*;

import java.io.IOException;
import java.util.function.Function;

import static com.fp.principles.dive.io.IOGenericFunctions.IO_INPUT;
import static com.fp.principles.dive.io.IOGenericFunctions.IO_OUTPUT;

public class DemoIO {

    public static void main(String[] args) throws IOException {
        IOv1.convertToCelsius(80);//prints celsius
        IOv2.convertToCelsius(80);//prints celsius
        IOv3.convertToCelsius(80);//prints celsius

        Function<Void, Void> action4 = IOv4.convertToCelsius(80);//runs computation, but doesn't print anything!!! -> NO SIDE EFFECTS
        action4.apply(null);//prints celsius -> SIDE EFFECT

        Function<Void, Void> action5 = IOv5.convertToCelsius();
        action5.apply(null);

        Function<Void, Void> action6 = IOv6.convertToCelsius();
        action6.apply(null);

        Function<Void, Void> action7 = IOv7.convertToCelsius();
        action7.apply(null);

        Function<Void, Void> action8 = IOv8.convertToCelsius();
        action8.apply(null);

        //action9 is actually a functional service/program
        Function<Void, Void> action9 = IOv9.convertToCelsius();
        action9.apply(null);//action9 is recipe which is getting executed/performed

        //applying a "syntactic sugar"
        Runnable program10 = IOv10.convertToCelsius();
        program10.run();

        //provide IO as an argument
        Runnable program11 = IOv11.convertToCelsius(IO_INPUT, IO_OUTPUT);
        program11.run();
    }

}
