package br.com.home.bancodedados;

import org.junit.Test;

import java.lang.String;

import static org.junit.Assert.*;

/**
 * To work on unit tests, switch the Test Artifact in the Build Variants view.
 */
public class ExampleUnitTest {
    @Test
    public void insert_isCorrect() throws Exception {
        BancoController crud = new BancoController(getBaseContext());
        String resultado = crud.insereDado("Alo", "Autor", "Ed");



    }
}