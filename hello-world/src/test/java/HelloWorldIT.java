import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.mule.functional.junit4.ArtifactFunctionalTestCase;

public class HelloWorldIT extends ArtifactFunctionalTestCase {
	
	@Override
    protected String getConfigFile()
    {
        return "hello-world.xml";
    }
	
	@Test
	public void test () throws Exception {
		assertEquals(true, true);
	}
}
