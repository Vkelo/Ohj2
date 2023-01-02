package kanta.test;
// Generated by ComTest BEGIN
import static org.junit.Assert.*;
import org.junit.*;
import kansallispuistot.Kommentti;
import kanta.*;
// Generated by ComTest END

/**
 * Test class made by ComTest
 * @version 2022.12.13 22:03:39 // Generated by ComTest
 *
 */
@SuppressWarnings({ "all" })
public class TietueTest {


  // Generated by ComTest BEGIN
  /** testInt15 */
  @Test
  public void testInt15() {    // Tietue: 15
    //Kommentti har = new Kommentti(); 
    //assertEquals("From: Tietue line: 18", 5, har.getKenttia()); 
  } // Generated by ComTest END


  // Generated by ComTest BEGIN
  /** testInt27 */
  @Test
  public void testInt27() {    // Tietue: 27
    Kommentti har = new Kommentti(); 
    assertEquals("From: Tietue line: 29", 2, har.ekaKentta()); 
  } // Generated by ComTest END




  // Generated by ComTest BEGIN
  /** 
   * testTietue87 
   * @throws CloneNotSupportedException when error
   */
  @Test
  public void testTietue87() throws CloneNotSupportedException {    // Tietue: 87
    Kommentti har = new Kommentti(); 
    har.parse("   2   |  10  |   Kalastus  | 1949 | 22 t "); 
    Object kopio = har.clone(); 
    assertEquals("From: Tietue line: 92", har.toString(), kopio.toString()); 
    har.parse("   1   |  11  |   Uinti  | 1949 | 22 t "); 
    assertEquals("From: Tietue line: 94", false, kopio.toString().equals(har.toString())); 
    assertEquals("From: Tietue line: 95", true, kopio instanceof Kommentti); 
  } // Generated by ComTest END


  // Generated by ComTest BEGIN
  /** testString105 */
  @Test
  public void testString105() {    // Tietue: 105
    Kommentti harrastus = new Kommentti(); 
    harrastus.parse("   2   |  10  |   Kalastus  | 1949 | 22 t "); 
     
  } // Generated by ComTest END
}