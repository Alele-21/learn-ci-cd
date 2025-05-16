package Constants;

import java.util.ArrayList;
import java.util.List;

public class Constants {
    public static class Waits {
        public static final int EXPLICIT_WAIT = 10;
    }

    public static class TheInternetMainPage{
        public static class MainPageConstants{
            public static final String MAIN_PAGE_URL = "https://the-internet.herokuapp.com/";
            public static final String MAIN_PAGE_HEADER = "Welcome to the-internet";
            public static final List<String> MAIN_PAGE_LINKS = List.of(
                    "A/B Testing",
                    "Add/Remove Elements",
                    "Basic Auth (user and pass: admin)",
                    "Broken Images",
                    "Challenging DOM",
                    "Checkboxes",
                    "Context Menu",
                    "Digest Authentication (user and pass: admin)",
                    "Disappearing Elements",
                    "Drag and Drop",
                    "Dropdown",
                    "Dynamic Content",
                    "Dynamic Controls",
                    "Dynamic Loading",
                    "Entry Ad",
                    "Exit Intent",
                    "File Download",
                    "File Upload",
                    "Floating Menu",
                    "Forgot Password",
                    "Form Authentication",
                    "Frames",
                    "Geolocation",
                    "Horizontal Slider",
                    "Hovers",
                    "Infinite Scroll",
                    "Inputs",
                    "JQuery UI Menus",
                    "JavaScript Alerts",
                    "JavaScript onload event error",
                    "Key Presses",
                    "Large & Deep DOM",
                    "Multiple Windows",
                    "Nested Frames",
                    "Notification Messages",
                    "Redirect Link",
                    "Secure File Download",
                    "Shadow DOM",
                    "Shifting Content",
                    "Slow Resources",
                    "Sortable Data Tables",
                    "Status Codes",
                    "Typos",
                    "WYSIWYG Editor"
            );
        }

    }
}