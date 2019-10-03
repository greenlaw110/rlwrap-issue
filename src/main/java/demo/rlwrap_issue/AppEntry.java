package demo.rlwrap_issue;

import act.Act;
import act.cli.Command;
import act.cli.ReportProgress;
import act.util.Async;
import act.util.ProgressGauge;
import org.osgl.logging.LogManager;
import org.osgl.logging.Logger;
import osgl.version.Version;
import osgl.version.Versioned;

/**
 * A simple hello world service app entry
 *
 * Run this app, try to update some of the code, then
 * press F5 in the browser to watch the immediate change
 * in the browser!
 */
@SuppressWarnings("unused")
@Versioned
public class AppEntry {

    /**
     * Version of this application
     */
    public static final Version VERSION = Version.of(AppEntry.class);

    /**
     * A logger instance that could be used through out the application
     */
    public static final Logger LOGGER = LogManager.get(AppEntry.class);

    @Command("bar")
    @Async
    @ReportProgress
    public void bar(ProgressGauge gauge) throws Exception {
        gauge.updateMaxHint(80);
        for (int i = 0; i < 80; ++i) {
            gauge.step();
            Thread.sleep(100);
        }
    }


    public static void main(String[] args) throws Exception {
        Act.start();
    }

}
