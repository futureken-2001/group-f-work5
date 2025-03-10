package org.student;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import com.toedter.calendar.JCalendar;
import javax.swing.*;

public class BlocksTest {

    @Test
    void testWestPanel() {
        JPanel panel = Blocks.createWestPanel();
        assertNotNull(panel);
        assertEquals(150, panel.getPreferredSize().width);
    }

    @Test
    void testEastPanel() {
        JPanel panel = Blocks.createEastPanel();
        assertNotNull(panel);
        assertEquals(100, panel.getPreferredSize().width);
    }

    @Test
    void testSouthPanel() {
        JPanel panel = Blocks.createSouthPanel();
        assertNotNull(panel);
        assertEquals(100, panel.getPreferredSize().width);
    }

    @Test
    void testLabel() {
        JLabel label = Blocks.createLabel("Hello");
        assertNotNull(label);
        assertEquals("Hello", label.getText());
    }

    @Test
    void testCalendar() {
        JCalendar calendar = Blocks.createCalendar();
        assertNotNull(calendar);
    }
}
