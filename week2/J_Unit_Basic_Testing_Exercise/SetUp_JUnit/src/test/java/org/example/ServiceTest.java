package org.example;
import org.junit.jupiter.api.Assertions;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
class ServiceTest {
    @Test
    void getNameTest(){
        Service service=new Service();
        String result=service.getName(1);

        assertEquals("a",result);
    }
}