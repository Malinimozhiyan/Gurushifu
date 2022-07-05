package com.thoughtworks.rectangle;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.*;
import org.junit.jupiter.api.Test;
public class RectangleTest {
    @Test 
    void shouldReturnAreaWhenLengthAndBreadthAreGiven()
    {
        Rectangle rectangle= new Rectangle(2.0,3.0);
        double result=rectangle.area();
        assertThat(result,closeTo(6.0,0.1));
     }
     @Test 
     void shouldReturnPerimeterWhenLengthAndBreadthAreGiven()
     {
         Rectangle rectangle= new Rectangle(2.0,3.0);
         double perimeteranswer=rectangle.perimeter();
         assertThat(perimeteranswer,closeTo(10.0,0.1));
      }
}
