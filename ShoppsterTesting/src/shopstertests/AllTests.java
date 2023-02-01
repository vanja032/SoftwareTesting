package shopstertests;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({RegistracijaTest.class, PrijavaTest.class, IspravnaRegistracijaTest.class, KorpaTest.class, UkupnaCenaTest.class, 
	PerfomanseTest.class, KompanijaTest.class, NewsletterTest.class, ListaZeljaTest.class, PretragaTest.class})
public class AllTests {

}
