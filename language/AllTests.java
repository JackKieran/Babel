package language;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({ JavaTest.class, LanguageTest.class, PythonTest.class })
public class AllTests {

}
