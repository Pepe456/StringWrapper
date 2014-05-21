import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;

import org.junit.Test;

public class StringWrapperTest {

	@Test
	public void emptyStringShouldReturnEmptyString() throws Exception {
		assertThat(StringWrapper.wrap(""), is(equalTo("")));
	}

	@Test
	public void oneCharacterStirngShouldReturnSameCHaracter() throws Exception {
		assertThat(StringWrapper.wrap("a"), is(equalTo("a")));
	}
}
