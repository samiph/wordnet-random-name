package org.kohsuke.randname;

import org.junit.Test;

import static junit.framework.TestCase.assertTrue;

/**
 * @author Kohsuke Kawaguchi
 */
public class DictionaryTest {
    @Test
    public void size() {
        Dictionary d = new Dictionary();
        System.out.println(d.size());
    }

    @Test
    public void testDefaultSeparatorIsUnderScore() throws Exception {
        Dictionary d = new Dictionary();
        String word = d.word(1);
        assertTrue(word.matches("^.+_.+$"));
    }
}
