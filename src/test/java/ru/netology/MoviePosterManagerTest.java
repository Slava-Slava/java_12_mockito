package ru.netology;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MoviePosterManagerTest {
    @Test
    public void showNothing() {
        MoviePosterManager manager = new MoviePosterManager();
        String[] expected = {};
        String[] actual = manager.findAll();
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void showOneMovie() {
        MoviePosterManager manager = new MoviePosterManager();
        manager.add("Film_1");
        String[] expected = {"Film_1"};
        String[] actual = manager.findAll();
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void showValidMovie() {
        MoviePosterManager manager = new MoviePosterManager();
        manager.add("Film_1");
        manager.add("Film_2");
        manager.add("Film_3");
        manager.add("Film_4");
        manager.add("Film_5");
        String[] expected = {"Film_5", "Film_4", "Film_3", "Film_2", "Film_1",};
        //    String[] expected= manager.findAll();
        String[] actual = manager.findLast();
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void showExceedingLimitMovie() {
        MoviePosterManager manager = new MoviePosterManager();
        manager.add("Film_1");
        manager.add("Film_2");
        manager.add("Film_3");
        manager.add("Film_4");
        manager.add("Film_5");
        manager.add("Film_6");
        manager.add("Film_7");
        manager.add("Film_8");
        String[] expected = {"Film_8", "Film_7", "Film_6", "Film_5", "Film_4",};
        String[] actual = manager.findLast();
        Assertions.assertArrayEquals(expected, actual);
    }
}
