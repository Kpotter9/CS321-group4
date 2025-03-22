package edu.gmu.cs321;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class TestCases {
    Form form;

    @BeforeAll
    public void setUpBeforeClass() {
        form = new Form();
    }
    /* Kyle made this test
     * Test name
     */
    @Test
    public void testName() {
        form.setName("John Doe");
        assertEquals("John Doe", form.getName());
    }
    /* Kyle made this test
     * Test email
     */
    @Test
    public void testEmail() {
        form.setEmail("test@gmail.com");
        assertEquals("test@gmail.com", form.getEmail());
    }
    /* Kyle made this test
     * Test ssn
     */
    @Test
    public void testSSN() {
        form.setSSN("123-45-6789");
        assertEquals("123-45-6789", form.getSSN());
    }
    /* Kyle made this test
     * Test CitzenId
     */
    @Test
    public void testCitizenId(){
        form.setCitizenIdFromSSN("123-45-6789");
        assertEquals("0", form.getCitizenId());
    }
    /* Kyle made this test
     * Test alienNum
     */
    @Test
    public void testAlienNum(){
        form.setAlienNum("I123456789");
        assertEquals("I123456789", form.getAlienNum());
    }
    /* Kyle made this test
     * Test immagrantName
     */
    @Test
    public void testImmigrationName(){
        form.setImmigrationName("John Doe");
        assertEquals("John Doe", form.getImmigrationName());
    }
    /* Kyle made this test
     * Test immigrantId
     */
    @Test
    public void testImmigrantId(){
        form.setImmigrantIdfromAlienNum("123456789");
        assertEquals("1",form.getImmagrantId());
    }
    /* Kyle made this test
     * Test immagrantNameValid while name is valid
     */
    @Test
    public void testImmigrationNameValid(){
        assertTrue(form.isImmigrationNameValid("John Doe") );
    }
    /* Kyle made this test
     * Test immagrantNameValid while name is invalid
     */
    @Test
    public void testImmigrationNameInvalid(){
        assertFalse(form.isImmigrationNameValid("123") );
    }
    /* Kyle made this test
     * Test citizenSSNValid while ssn is valid
     */
    @Test
    public void testCitizenSSNValid(){
        assertTrue(form.isCitizenSSNValid("123-45-6789") );
    }
    /* Kyle made this test
     * Test citizenSSNValid while ssn is invalid
     */
    @Test
    public void testCitizenSSNInvalid(){
        assertFalse(form.isCitizenSSNValid("123-45-678") );
    }
    /* Kyle made this test
     * Test citizenEmailValid while citizenId is valid
     */
    @Test
    public void testCitizenEmailValid(){
        assertTrue(form.isCitizenEmailValid("A123456789@gmail.com") );
    }
    /* Kyle made this test
     * Test citizenEmailValid while citizenId is invalid
     */
    @Test
    public void testCitizenEmailInvalid(){
        assertFalse(form.isCitizenEmailValid("A123456789gmail.com") );
    }
    /* Kyle made this test
     * Test nameValid while name is valid
     */
    @Test
    public void testNameValid(){
        assertTrue(form.isNameValid("John Doe") );
    }
    /* Kyle made this test
     * Test nameValid while name is invalid
     */
    @Test
    public void testNameInvalid(){
        assertFalse(form.isNameValid("123") );
    }
    /* Kyle made this test
     * Test alienNumberValid while alienNumber is valid
     */
    @Test
    public void testAlienNumberValid(){
        assertTrue(form.isAlienNumberValid("123456789") );
    }
    /* Kyle made this test
     * Test alienNumberValid while alienNumber is invalid
     */
    @Test
    public void testAlienNumberInvalid(){
        assertFalse(form.isAlienNumberValid("123") );
    }
}
