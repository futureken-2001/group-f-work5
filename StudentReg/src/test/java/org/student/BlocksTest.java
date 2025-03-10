package org.student;
import com.toedter.calendar.JCalendar;
import org.junit.jupiter.api.Test;
import javax.swing.*;
import static org.junit.jupiter.api.Assertions.*;

public class BlocksTest {
    @Test
    void testWestPanel() {
        JPanel panel = Blocks.west();
        assertNotNull(panel);
        assertEquals(150, panel.getPreferredSize().width);

    }

    @Test
    void testEastPanel() {
        JPanel panel = Blocks.east();
        assertNotNull(panel);
        assertEquals(100, panel.getPreferredSize().width);
    }

    @Test
    void testSouthPanel() {
        JPanel panel = Blocks.south();
        assertNotNull(panel);
        assertEquals(100, panel.getPreferredSize().width);
    }

    @Test
    void testLabel() {
        JLabel label = Blocks.label("Hello");
        assertNotNull(label);
        assertEquals("Hello", label.getText());
    }

    @Test
    void testCalendar() {
        JCalendar calendar = Blocks.calendar();
        assertNotNull(calendar);
    }
}