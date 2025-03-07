
import org.example.SportsTimeTracker;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SportsTimeTrackerTest {

    private SportsTimeTracker tracker;

    @BeforeEach
    public void setUp() {
        tracker = new SportsTimeTracker();
    }

    @Test
    public void testLogSportsActivity() {
        tracker.logSportsActivity("Swimming", 120);
        assertEquals(120, tracker.activities.get("Swimming"));
    }

    @Test
    public void testTotalTimeSpent() {
        tracker.logSportsActivity("Swimming", 120);
        tracker.logSportsActivity("Running", 60);
        tracker.logSportsActivity("Cycling", 90);
        assertEquals(270, tracker.totalTimeSpent());
    }

    @Test
    public void testViewLoggedActivities() {
        tracker.logSportsActivity("Swimming", 120);
        tracker.logSportsActivity("Running", 60);
        tracker.logSportsActivity("Cycling", 90);
        tracker.viewLoggedActivities();
        // This test is for visual verification, you might want to capture the output for automated testing
    }
}