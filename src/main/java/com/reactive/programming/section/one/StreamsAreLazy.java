package com.reactive.programming.section.one;

import java.util.stream.Stream;
public class StreamsAreLazy {

    public static void main(String[] args) {
        Stream<Integer> integerStream = Stream.of(1)
                                              .map(i->{
                                                  try {
                                                      Thread.sleep(2000);
                                                  } catch (InterruptedException e) {
                                                      e.printStackTrace();
                                                  }
                                                  return i*2;
        });

        //System.out.println(integerStream);

        integerStream.forEach(System.out::println);
    }
}
