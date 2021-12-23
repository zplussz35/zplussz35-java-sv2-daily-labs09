package day02;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class StringListsTest {

    @Test
    void testShortestWords() {
        StringLists sList = new StringLists();
        List<String> words = Arrays.asList("alma","aaa","bbb","asdfwe","adsdfwrherh","a","bgggth","b","c","3457782");
        assertEquals(List.of("a","b","c"),sList.shortestWords(words));
    }
}