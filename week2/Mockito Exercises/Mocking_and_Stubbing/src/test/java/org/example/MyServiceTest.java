package org.example;

import org.junit.jupiter.api.Test;
import static org.mockito.Mockito.*;
import static org.junit.jupiter.api.Assertions.*;

public class MyServiceTest {

    @Test
    void testExternalApiStubbed() {
        // Arrange: Create mock and stub its method
        ExternalAPI mockApi = mock(ExternalAPI.class);
        when(mockApi.getData()).thenReturn("Mock Data");

        // Act: Inject mock into service and call method
        MyService service = new MyService(mockApi);
        String result = service.fetchData();

        // Assert: Verify expected output
        assertEquals("Mock Data", result);
    }
}
