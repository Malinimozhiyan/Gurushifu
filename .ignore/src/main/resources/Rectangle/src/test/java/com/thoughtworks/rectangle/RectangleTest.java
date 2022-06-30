package com.thoughtworks.rectangle;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;

import org.junit.jupiter.api.Test;
public class RectangleTest {
    @Test 
    void Should_Return_Area_When_Length_And_Breadth_Are_Given()
    {
        Rectangle rectangle= new Rectangle();
        int Result=rectangle.FindArea(2, 3);
        assertThat(Result,equalTo(6));
     }
}
