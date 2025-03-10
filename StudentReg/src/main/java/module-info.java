module StudentReg {
    requires java.desktop;
    exports org.student;
    requires jcalendar;
    requires org.testng;
    requires org.junit.jupiter.api;
    requires org.junit.platform.commons;
    requires org.junit.jupiter.engine;
    requires org.junit.platform.engine;
    requires org.junit.platform.launcher;

    opens org.student to org.junit.platform.commons,org.junit.jupiter.api;





}