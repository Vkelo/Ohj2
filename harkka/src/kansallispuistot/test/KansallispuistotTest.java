package kansallispuistot.test;
import org.junit.*;

// Generated by ComTest BEGIN
import kansallispuistot.*;
// Generated by ComTest END

/**
 * Test class made by ComTest
 * @version 2022.12.13 22:52:11 // Generated by ComTest
 *
 */
public class KansallispuistotTest {


  private Reitti aku1; 
   private Reitti aku2; 
   private int jid1; 
   private int jid2; 
   private Kommentti pitsi21; 
   private Kommentti pitsi11; 
   private Kommentti pitsi22; 
   private Kommentti pitsi12; 
   private Kommentti pitsi23; 

   @SuppressWarnings("javadoc")
   public void alustaKerho() {
     Kansallispuistot kansallispuisto1 = new Kansallispuistot(); 
     aku1 = new Reitti(); aku1.taytaKarhunkierrosTiedoilla(); aku1.rekisteroi(); 
     aku2 = new Reitti(); aku2.taytaKarhunkierrosTiedoilla(); aku2.rekisteroi(); 
     jid1 = aku1.getId(); 
     jid2 = aku2.getId(); 
     pitsi21 = new Kommentti(jid2); pitsi21.vastaaPitsinNyplays(jid2); 
     pitsi11 = new Kommentti(jid1); pitsi11.vastaaPitsinNyplays(jid1); 
     pitsi22 = new Kommentti(jid2); pitsi22.vastaaPitsinNyplays(jid2); 
     pitsi12 = new Kommentti(jid1); pitsi12.vastaaPitsinNyplays(jid1); 
     pitsi23 = new Kommentti(jid2); pitsi23.vastaaPitsinNyplays(jid2); 
     try {
     kansallispuisto1.lisaa(aku1); 
     kansallispuisto1.lisaa(aku2); 
     kansallispuisto1.lisaa(pitsi21); 
     kansallispuisto1.lisaa(pitsi11); 
     kansallispuisto1.lisaa(pitsi22); 
     kansallispuisto1.lisaa(pitsi12); 
     kansallispuisto1.lisaa(pitsi23); 
     } catch ( Exception e) {
        System.err.println(e.getMessage()); 
     }
   }
  // Generated by ComTest END


  // Generated by ComTest BEGIN
  /** 
   * testEtsi116 
   * @throws CloneNotSupportedException when error
   * @throws SailoException when error
   */
  @Test
  public void testEtsi116() throws CloneNotSupportedException, SailoException {    // Kansallispuistot: 116
    /*alustaKerho(); 
    Reitti jasen3 = new Reitti(); jasen3.rekisteroi(); 
    jasen3.aseta(1,"Susi Sepe"); 
    kansallispuisto.lisaa(jasen3); 
    Collection<Reitti> loytyneet = kansallispuisto.etsi("*Susi*",1); 
    assertEquals("From: Kansallispuistot line: 123", 1, loytyneet.size()); 
    Iterator<Reitti> it = loytyneet.iterator(); 
    assertEquals("From: Kansallispuistot line: 125", true, it.next() == jasen3); */
  } // Generated by ComTest END


  // Generated by ComTest BEGIN
  /** 
   * testLisaa159 
   * @throws SailoException when error
   */
  @Test
  public void testLisaa159() throws SailoException {    // Kansallispuistot: 159
    /*alustaKerho(); 
    assertEquals("From: Kansallispuistot line: 162", 2, kansallispuisto.etsi("*",0).size()); 
    kansallispuisto.lisaa(aku1); 
    assertEquals("From: Kansallispuistot line: 164", 3, kansallispuisto.etsi("*",0).size());*/ 
  } // Generated by ComTest END


  // Generated by ComTest BEGIN
  /** 
   * testKorvaaTaiLisaa182 
   * @throws SailoException when error
   */
  @Test
  public void testKorvaaTaiLisaa182() throws SailoException {    // Kansallispuistot: 182
    /*alustaKerho(); 
    assertEquals("From: Kansallispuistot line: 185", 2, kansallispuisto.etsi("*",0).size()); 
    kansallispuisto.korvaaTaiLisaa(aku1); 
    assertEquals("From: Kansallispuistot line: 187", 2, kansallispuisto.etsi("*",0).size());*/ 
  } // Generated by ComTest END


  // Generated by ComTest BEGIN
  /** 
   * testAnnaKommentit210 
   * @throws SailoException when error
   */
  @Test
  public void testAnnaKommentit210() throws SailoException {    // Kansallispuistot: 210
    /*alustaKerho(); 
    Reitti aku3 = new Reitti(); 
    aku3.rekisteroi(); 
    kansallispuisto.lisaa(aku3); 
    List<Kommentti> loytyneet; 
    loytyneet = kansallispuisto.annaKommentit(aku3); 
    assertEquals("From: Kansallispuistot line: 221", 0, loytyneet.size()); 
    loytyneet = kansallispuisto.annaKommentit(aku1); 
    assertEquals("From: Kansallispuistot line: 223", 2, loytyneet.size()); 
    assertEquals("From: Kansallispuistot line: 224", true, loytyneet.get(0) == pitsi11); 
    assertEquals("From: Kansallispuistot line: 225", true, loytyneet.get(1) == pitsi12); 
    loytyneet = kansallispuisto.annaKommentit(aku2); 
    assertEquals("From: Kansallispuistot line: 227", 3, loytyneet.size()); 
    assertEquals("From: Kansallispuistot line: 228", true, loytyneet.get(0) == pitsi21);*/ 
  } // Generated by ComTest END
}