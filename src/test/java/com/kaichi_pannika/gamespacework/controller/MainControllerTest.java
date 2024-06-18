package com.kaichi_pannika.gamespacework.controller;

import com.kaichi_pannika.gamespacework.BaseUnitTest;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.view;

@WebMvcTest
public class MainControllerTest extends BaseUnitTest {

    @Autowired
    private MockMvc mockMvc;

    @Test
    @DisplayName("возвращение стартовой страницы")
    public void testMainPage() throws Exception {
        mockMvc.perform(get("/mainPage"))
                .andExpect(status().isOk())
                .andExpect(view().name("startpage"));
    }

    @Test
    @DisplayName("возвращение страницы авторов")
    public void authorsPage() throws Exception {
        mockMvc.perform(get("/authors"))
                .andExpect(status().isOk())
                .andExpect(view().name("game-authors"));
    }

    @Test
    @DisplayName("возвращение страницы авторов")
    public void gameBeginPage() throws Exception {
        mockMvc.perform(get("/newGame"))
                .andExpect(status().isOk())
                .andExpect(view().name("new-game-page"));
    }

    @Test
    @DisplayName("негативный тест для стартовой страницы")
    public void testMainPageNotFound() throws Exception {
        mockMvc.perform(get("/invalidMainPage"))
                .andExpect(status().isNotFound());
    }

    @Test
    @DisplayName("негативный тест для страницы авторов")
    public void authorsPageNotFound() throws Exception {
        mockMvc.perform(get("/invalidAuthors"))
                .andExpect(status().isNotFound());
    }

    @Test
    @DisplayName("негативный тест для страницы новой игры")
    public void gameBeginPageNotFound() throws Exception {
        mockMvc.perform(get("/invalidNewGame"))
                .andExpect(status().isNotFound());
    }
}
