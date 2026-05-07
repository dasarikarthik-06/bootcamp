import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {
    @Test
    void name() {
        List mockList = Mockito.mock(List.class);
        mockList.add(2);
        Mockito.verify(mockList).add(2);
    }
}