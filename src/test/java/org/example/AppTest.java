package org.example;

import org.junit.jupiter.api.Test;

import org.example.App;

import java.util.ArrayList;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class AppTest {

    @Test
    public void testReverse1() {
        var left = "word";
        var middle = 1;
        var right = 5.5;

        var tr = new SimpleTriple(left, middle, right);
        var reversed = tr.reverse();

        var actualLeft = reversed.getLeft();
        assertThat(actualLeft).isEqualTo(right);
        assertThat(actualLeft).isInstanceOf(Double.class);

        var actualMiddle = reversed.getMiddle();
        assertThat(actualMiddle).isEqualTo(middle);
        assertThat(actualMiddle).isInstanceOf(Integer.class);

        var actualRight = reversed.getRight();
        assertThat(actualRight).isEqualTo(left);
        assertThat(actualRight).isInstanceOf(String.class);

        assertThat(reversed).isNotSameAs(tr);
    }

    @Test
    public void testMergeWithIntegers() {

        var util = new ListUtils<Integer>();

        var coll1 = new ArrayList<>(List.of(1, 2, 3));
        var coll2 = new ArrayList<>(List.of(3, 4, 5));
        var expected = new ArrayList<>(List.of(1, 2, 3, 3, 4, 5));
        var actual = util.merge(coll1, coll2);

        assertThat(actual).isEqualTo(expected);
        assertThat(actual).isNotSameAs(coll1);
        assertThat(actual).isNotSameAs(coll2);
    }

    @Test
    public void testMergeWithStrings() {

        var util = new ListUtils<String>();

        var coll1 = new ArrayList<>(List.of("apple", "pear"));
        var coll2 = new ArrayList<>(List.of("lemon", "mango"));
        var expected = new ArrayList<>(List.of("apple", "pear", "lemon", "mango"));
        var actual = util.merge(coll1, coll2);

        assertThat(actual).isEqualTo(expected);
        assertThat(actual).isNotSameAs(coll1);
        assertThat(actual).isNotSameAs(coll2);
    }

    @Test
    public void testMergeWithChars() {

        var util = new ListUtils<Character>();

        var coll1 = new ArrayList<>(List.of('a', 'b', 'c'));
        var coll2 = new ArrayList<>(List.of('d', 'e'));
        var expected = new ArrayList<>(List.of('a', 'b', 'c', 'd', 'e'));
        var actual = util.merge(coll1, coll2);

        assertThat(actual).isEqualTo(expected);
        assertThat(actual).isNotSameAs(coll1);
        assertThat(actual).isNotSameAs(coll2);
    }

    @Test
    public void testDuplicate() {
        var coll = new ArrayList<>(List.of(1, 2, 3, 4, 5));
        var expected = new ArrayList<>(List.of(2, 4, 6, 8, 10));
        var actual = App.duplicate(coll);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    public void testDuplicate2() {

        var coll = new ArrayList<>(List.of(0, -2, 5, 10));
        var expected = new ArrayList<>(List.of(0, -4, 10, 20));
        var actual = App.duplicate(coll);

        assertThat(actual).isEqualTo(expected);
        assertThat(actual).isNotSameAs(expected);
    }

    @Test
    public void testDuplicateWithEmpty() {

        var coll = new ArrayList<Integer>();
        var expected = new ArrayList<Integer>();
        var actual = App.duplicate(coll);

        assertThat(actual).isEqualTo(expected);
        assertThat(actual).isNotSameAs(expected);
    }
}
