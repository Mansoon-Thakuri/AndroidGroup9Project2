package jlin2.examples.localtesting

import org.junit.Assert
import org.junit.Test

class EmailValidatorTest {
    @Test
    fun testValidEmailFormat() {
        Assert.assertTrue(EmailValidator.isValidEmail("123@abc.com"))
    }

    @Test
    fun testValidEmailSubdomainFormat() {
        Assert.assertTrue(EmailValidator.isValidEmail("123@abc.co.ca"))
    }

    @Test
    fun testInvalidEmailWithIncorrectDomain() {
        Assert.assertFalse(EmailValidator.isValidEmail("123@abc"))
    }

    @Test
    fun testInvalidEmailWithDoubleDots() {
        Assert.assertFalse(EmailValidator.isValidEmail("123@abc..com"))
    }

    @Test
    fun testInvalidEmailWithoutUsername() {
        Assert.assertFalse(EmailValidator.isValidEmail("@abc.com"))
    }

    @Test
    fun testInvalidEmailWithoutDomain() {
        Assert.assertFalse(EmailValidator.isValidEmail("testing123"))
    }

    @Test
    fun testInvalidEmailWithEmptyString() {
        Assert.assertFalse(EmailValidator.isValidEmail( ""))
    }

    @Test
    fun testIncorrectEmailWithNull() {
        val email: String? = null
        Assert.assertFalse(EmailValidator.isValidEmail(email))
    }
}