package jamesBond;
import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
public class JamesBondTest{
	JamesBond jb;
	@Before 
	public void setUp() throws Exception {
		jb = new JamesBond(); 
	}
	@After 
	public void tearDown() throws Exception {
		jb = null; 
	}
	@Test
	public void bondRegexTest0(){
		assertFalse(jb.bondRegex("("));
	}
	@Test
	public void bondRegexTest1(){
		assertFalse(jb.bondRegex("(("));
	}
	@Test
	public void bondRegexTest2(){
		assertFalse(jb.bondRegex("((("));
	}
	@Test
	public void bondRegexTest3(){
		assertFalse(jb.bondRegex("(()"));
	}
	@Test
	public void bondRegexTest4(){
		assertTrue(jb.bondRegex("((007)"));
	}
	@Test
	public void bondRegexTest5(){
		assertFalse(jb.bondRegex("((07)"));
	}
	@Test
	public void bondRegexTest6(){
		assertFalse(jb.bondRegex("((7)"));
	}
	@Test
	public void bondRegexTest7(){
		assertFalse(jb.bondRegex("()"));
	}
	@Test
	public void bondRegexTest8(){
		assertFalse(jb.bondRegex("()("));
	}
	@Test
	public void bondRegexTest9(){
		assertFalse(jb.bondRegex("())"));
	}
	@Test
	public void bondRegexTest10(){
		assertFalse(jb.bondRegex("()007)"));
	}
	@Test
	public void bondRegexTest11(){
		assertFalse(jb.bondRegex("()07)"));
	}
	@Test
	public void bondRegexTest12(){
		assertFalse(jb.bondRegex("()7)"));
	}
	@Test
	public void bondRegexTest13(){
		assertFalse(jb.bondRegex("(0("));
	}
	@Test
	public void bondRegexTest14(){
		assertFalse(jb.bondRegex("(0(("));
	}
	@Test
	public void bondRegexTest15(){
		assertFalse(jb.bondRegex("(0()"));
	}
	@Test
	public void bondRegexTest16(){
		assertTrue(jb.bondRegex("(0(007)"));
	}
	@Test
	public void bondRegexTest17(){
		assertFalse(jb.bondRegex("(0(07)"));
	}
	@Test
	public void bondRegexTest18(){
		assertFalse(jb.bondRegex("(0(7)"));
	}
	@Test
	public void bondRegexTest19(){
		assertFalse(jb.bondRegex("(0)"));
	}
	@Test
	public void bondRegexTest20(){
		assertFalse(jb.bondRegex("(0)("));
	}
	@Test
	public void bondRegexTest21(){
		assertFalse(jb.bondRegex("(0))"));
	}
	@Test
	public void bondRegexTest22(){
		assertFalse(jb.bondRegex("(0)007)"));
	}
	@Test
	public void bondRegexTest23(){
		assertFalse(jb.bondRegex("(0)07)"));
	}
	@Test
	public void bondRegexTest24(){
		assertFalse(jb.bondRegex("(0)7)"));
	}
	@Test
	public void bondRegexTest25(){
		assertFalse(jb.bondRegex("(00("));
	}
	@Test
	public void bondRegexTest26(){
		assertFalse(jb.bondRegex("(00(("));
	}
	@Test
	public void bondRegexTest27(){
		assertFalse(jb.bondRegex("(00()"));
	}
	@Test
	public void bondRegexTest28(){
		assertTrue(jb.bondRegex("(00(007)"));
	}
	@Test
	public void bondRegexTest29(){
		assertFalse(jb.bondRegex("(00(07)"));
	}
	@Test
	public void bondRegexTest30(){
		assertFalse(jb.bondRegex("(00(7)"));
	}
	@Test
	public void bondRegexTest31(){
		assertFalse(jb.bondRegex("(00)"));
	}
	@Test
	public void bondRegexTest32(){
		assertFalse(jb.bondRegex("(00)("));
	}
	@Test
	public void bondRegexTest33(){
		assertFalse(jb.bondRegex("(00))"));
	}
	@Test
	public void bondRegexTest34(){
		assertFalse(jb.bondRegex("(00)007)"));
	}
	@Test
	public void bondRegexTest35(){
		assertFalse(jb.bondRegex("(00)07)"));
	}
	@Test
	public void bondRegexTest36(){
		assertFalse(jb.bondRegex("(00)7)"));
	}
	@Test
	public void bondRegexTest37(){
		assertFalse(jb.bondRegex("(000("));
	}
	@Test
	public void bondRegexTest38(){
		assertFalse(jb.bondRegex("(000)"));
	}
	@Test
	public void bondRegexTest39(){
		assertTrue(jb.bondRegex("(000007)"));
	}
	@Test
	public void bondRegexTest40(){
		assertTrue(jb.bondRegex("(00007)"));
	}
	@Test
	public void bondRegexTest41(){
		assertTrue(jb.bondRegex("(0007)"));
	}
	@Test
	public void bondRegexTest42(){
		assertFalse(jb.bondRegex("(001("));
	}
	@Test
	public void bondRegexTest43(){
		assertFalse(jb.bondRegex("(001)"));
	}
	@Test
	public void bondRegexTest44(){
		assertTrue(jb.bondRegex("(001007)"));
	}
	@Test
	public void bondRegexTest45(){
		assertFalse(jb.bondRegex("(00107)"));
	}
	@Test
	public void bondRegexTest46(){
		assertFalse(jb.bondRegex("(0017)"));
	}
	@Test
	public void bondRegexTest47(){
		assertFalse(jb.bondRegex("(002("));
	}
	@Test
	public void bondRegexTest48(){
		assertFalse(jb.bondRegex("(002)"));
	}
	@Test
	public void bondRegexTest49(){
		assertTrue(jb.bondRegex("(002007)"));
	}
	@Test
	public void bondRegexTest50(){
		assertFalse(jb.bondRegex("(00207)"));
	}
	@Test
	public void bondRegexTest51(){
		assertFalse(jb.bondRegex("(0027)"));
	}
	@Test
	public void bondRegexTest52(){
		assertFalse(jb.bondRegex("(003("));
	}
	@Test
	public void bondRegexTest53(){
		assertFalse(jb.bondRegex("(003)"));
	}
	@Test
	public void bondRegexTest54(){
		assertTrue(jb.bondRegex("(003007)"));
	}
	@Test
	public void bondRegexTest55(){
		assertFalse(jb.bondRegex("(00307)"));
	}
	@Test
	public void bondRegexTest56(){
		assertFalse(jb.bondRegex("(0037)"));
	}
	@Test
	public void bondRegexTest57(){
		assertFalse(jb.bondRegex("(004("));
	}
	@Test
	public void bondRegexTest58(){
		assertFalse(jb.bondRegex("(004)"));
	}
	@Test
	public void bondRegexTest59(){
		assertTrue(jb.bondRegex("(004007)"));
	}
	@Test
	public void bondRegexTest60(){
		assertFalse(jb.bondRegex("(00407)"));
	}
	@Test
	public void bondRegexTest61(){
		assertFalse(jb.bondRegex("(0047)"));
	}
	@Test
	public void bondRegexTest62(){
		assertFalse(jb.bondRegex("(005("));
	}
	@Test
	public void bondRegexTest63(){
		assertFalse(jb.bondRegex("(005)"));
	}
	@Test
	public void bondRegexTest64(){
		assertTrue(jb.bondRegex("(005007)"));
	}
	@Test
	public void bondRegexTest65(){
		assertFalse(jb.bondRegex("(00507)"));
	}
	@Test
	public void bondRegexTest66(){
		assertFalse(jb.bondRegex("(0057)"));
	}
	@Test
	public void bondRegexTest67(){
		assertFalse(jb.bondRegex("(006("));
	}
	@Test
	public void bondRegexTest68(){
		assertFalse(jb.bondRegex("(006)"));
	}
	@Test
	public void bondRegexTest69(){
		assertTrue(jb.bondRegex("(006007)"));
	}
	@Test
	public void bondRegexTest70(){
		assertFalse(jb.bondRegex("(00607)"));
	}
	@Test
	public void bondRegexTest71(){
		assertFalse(jb.bondRegex("(0067)"));
	}
	@Test
	public void bondRegexTest72(){
		assertFalse(jb.bondRegex("(007("));
	}
	@Test
	public void bondRegexTest73(){
		assertFalse(jb.bondRegex("(007(("));
	}
	@Test
	public void bondRegexTest74(){
		assertFalse(jb.bondRegex("(007()"));
	}
	@Test
	public void bondRegexTest75(){
		assertTrue(jb.bondRegex("(007(007)"));
	}
	@Test
	public void bondRegexTest76(){
		assertFalse(jb.bondRegex("(007(07)"));
	}
	@Test
	public void bondRegexTest77(){
		assertFalse(jb.bondRegex("(007(7)"));
	}
	@Test
	public void bondRegexTest78(){
		assertTrue(jb.bondRegex("(007)"));
	}
	@Test
	public void bondRegexTest79(){
		assertTrue(jb.bondRegex("(007)("));
	}
	@Test
	public void bondRegexTest80(){
		assertTrue(jb.bondRegex("(007)(("));
	}
	@Test
	public void bondRegexTest81(){
		assertTrue(jb.bondRegex("(007)()"));
	}
	@Test
	public void bondRegexTest82(){
		assertTrue(jb.bondRegex("(007)(007)"));
	}
	@Test
	public void bondRegexTest83(){
		assertTrue(jb.bondRegex("(007)(07)"));
	}
	@Test
	public void bondRegexTest84(){
		assertTrue(jb.bondRegex("(007)(7)"));
	}
	@Test
	public void bondRegexTest85(){
		assertTrue(jb.bondRegex("(007))"));
	}
	@Test
	public void bondRegexTest86(){
		assertTrue(jb.bondRegex("(007))("));
	}
	@Test
	public void bondRegexTest87(){
		assertTrue(jb.bondRegex("(007)))"));
	}
	@Test
	public void bondRegexTest88(){
		assertTrue(jb.bondRegex("(007))007)"));
	}
	@Test
	public void bondRegexTest89(){
		assertTrue(jb.bondRegex("(007))07)"));
	}
	@Test
	public void bondRegexTest90(){
		assertTrue(jb.bondRegex("(007))7)"));
	}
	@Test
	public void bondRegexTest91(){
		assertTrue(jb.bondRegex("(007)0("));
	}
	@Test
	public void bondRegexTest92(){
		assertTrue(jb.bondRegex("(007)0)"));
	}
	@Test
	public void bondRegexTest93(){
		assertTrue(jb.bondRegex("(007)0007)"));
	}
	@Test
	public void bondRegexTest94(){
		assertTrue(jb.bondRegex("(007)007)"));
	}
	@Test
	public void bondRegexTest95(){
		assertTrue(jb.bondRegex("(007)07)"));
	}
	@Test
	public void bondRegexTest96(){
		assertTrue(jb.bondRegex("(007)1("));
	}
	@Test
	public void bondRegexTest97(){
		assertTrue(jb.bondRegex("(007)1)"));
	}
	@Test
	public void bondRegexTest98(){
		assertTrue(jb.bondRegex("(007)1007)"));
	}
	@Test
	public void bondRegexTest99(){
		assertTrue(jb.bondRegex("(007)107)"));
	}
	@Test
	public void bondRegexTest100(){
		assertTrue(jb.bondRegex("(007)17)"));
	}
	@Test
	public void bondRegexTest101(){
		assertTrue(jb.bondRegex("(007)2("));
	}
	@Test
	public void bondRegexTest102(){
		assertTrue(jb.bondRegex("(007)2)"));
	}
	@Test
	public void bondRegexTest103(){
		assertTrue(jb.bondRegex("(007)2007)"));
	}
	@Test
	public void bondRegexTest104(){
		assertTrue(jb.bondRegex("(007)207)"));
	}
	@Test
	public void bondRegexTest105(){
		assertTrue(jb.bondRegex("(007)27)"));
	}
	@Test
	public void bondRegexTest106(){
		assertTrue(jb.bondRegex("(007)3("));
	}
	@Test
	public void bondRegexTest107(){
		assertTrue(jb.bondRegex("(007)3)"));
	}
	@Test
	public void bondRegexTest108(){
		assertTrue(jb.bondRegex("(007)3007)"));
	}
	@Test
	public void bondRegexTest109(){
		assertTrue(jb.bondRegex("(007)307)"));
	}
	@Test
	public void bondRegexTest110(){
		assertTrue(jb.bondRegex("(007)37)"));
	}
	@Test
	public void bondRegexTest111(){
		assertTrue(jb.bondRegex("(007)4("));
	}
	@Test
	public void bondRegexTest112(){
		assertTrue(jb.bondRegex("(007)4)"));
	}
	@Test
	public void bondRegexTest113(){
		assertTrue(jb.bondRegex("(007)4007)"));
	}
	@Test
	public void bondRegexTest114(){
		assertTrue(jb.bondRegex("(007)407)"));
	}
	@Test
	public void bondRegexTest115(){
		assertTrue(jb.bondRegex("(007)47)"));
	}
	@Test
	public void bondRegexTest116(){
		assertTrue(jb.bondRegex("(007)5("));
	}
	@Test
	public void bondRegexTest117(){
		assertTrue(jb.bondRegex("(007)5)"));
	}
	@Test
	public void bondRegexTest118(){
		assertTrue(jb.bondRegex("(007)5007)"));
	}
	@Test
	public void bondRegexTest119(){
		assertTrue(jb.bondRegex("(007)507)"));
	}
	@Test
	public void bondRegexTest120(){
		assertTrue(jb.bondRegex("(007)57)"));
	}
	@Test
	public void bondRegexTest121(){
		assertTrue(jb.bondRegex("(007)6("));
	}
	@Test
	public void bondRegexTest122(){
		assertTrue(jb.bondRegex("(007)6)"));
	}
	@Test
	public void bondRegexTest123(){
		assertTrue(jb.bondRegex("(007)6007)"));
	}
	@Test
	public void bondRegexTest124(){
		assertTrue(jb.bondRegex("(007)607)"));
	}
	@Test
	public void bondRegexTest125(){
		assertTrue(jb.bondRegex("(007)67)"));
	}
	@Test
	public void bondRegexTest126(){
		assertTrue(jb.bondRegex("(007)7("));
	}
	@Test
	public void bondRegexTest127(){
		assertTrue(jb.bondRegex("(007)7)"));
	}
	@Test
	public void bondRegexTest128(){
		assertTrue(jb.bondRegex("(007)7007)"));
	}
	@Test
	public void bondRegexTest129(){
		assertTrue(jb.bondRegex("(007)707)"));
	}
	@Test
	public void bondRegexTest130(){
		assertTrue(jb.bondRegex("(007)77)"));
	}
	@Test
	public void bondRegexTest131(){
		assertTrue(jb.bondRegex("(007)8("));
	}
	@Test
	public void bondRegexTest132(){
		assertTrue(jb.bondRegex("(007)8)"));
	}
	@Test
	public void bondRegexTest133(){
		assertTrue(jb.bondRegex("(007)8007)"));
	}
	@Test
	public void bondRegexTest134(){
		assertTrue(jb.bondRegex("(007)807)"));
	}
	@Test
	public void bondRegexTest135(){
		assertTrue(jb.bondRegex("(007)87)"));
	}
	@Test
	public void bondRegexTest136(){
		assertTrue(jb.bondRegex("(007)9("));
	}
	@Test
	public void bondRegexTest137(){
		assertTrue(jb.bondRegex("(007)9)"));
	}
	@Test
	public void bondRegexTest138(){
		assertTrue(jb.bondRegex("(007)9007)"));
	}
	@Test
	public void bondRegexTest139(){
		assertTrue(jb.bondRegex("(007)907)"));
	}
	@Test
	public void bondRegexTest140(){
		assertTrue(jb.bondRegex("(007)97)"));
	}
	@Test
	public void bondRegexTest141(){
		assertFalse(jb.bondRegex("(0070("));
	}
	@Test
	public void bondRegexTest142(){
		assertTrue(jb.bondRegex("(0070)"));
	}
	@Test
	public void bondRegexTest143(){
		assertTrue(jb.bondRegex("(0070007)"));
	}
	@Test
	public void bondRegexTest144(){
		assertTrue(jb.bondRegex("(007007)"));
	}
	@Test
	public void bondRegexTest145(){
		assertTrue(jb.bondRegex("(00707)"));
	}
	@Test
	public void bondRegexTest146(){
		assertFalse(jb.bondRegex("(0071("));
	}
	@Test
	public void bondRegexTest147(){
		assertTrue(jb.bondRegex("(0071)"));
	}
	@Test
	public void bondRegexTest148(){
		assertTrue(jb.bondRegex("(0071007)"));
	}
	@Test
	public void bondRegexTest149(){
		assertTrue(jb.bondRegex("(007107)"));
	}
	@Test
	public void bondRegexTest150(){
		assertTrue(jb.bondRegex("(00717)"));
	}
	@Test
	public void bondRegexTest151(){
		assertFalse(jb.bondRegex("(0072("));
	}
	@Test
	public void bondRegexTest152(){
		assertTrue(jb.bondRegex("(0072)"));
	}
	@Test
	public void bondRegexTest153(){
		assertTrue(jb.bondRegex("(0072007)"));
	}
	@Test
	public void bondRegexTest154(){
		assertTrue(jb.bondRegex("(007207)"));
	}
	@Test
	public void bondRegexTest155(){
		assertTrue(jb.bondRegex("(00727)"));
	}
	@Test
	public void bondRegexTest156(){
		assertFalse(jb.bondRegex("(0073("));
	}
	@Test
	public void bondRegexTest157(){
		assertTrue(jb.bondRegex("(0073)"));
	}
	@Test
	public void bondRegexTest158(){
		assertTrue(jb.bondRegex("(0073007)"));
	}
	@Test
	public void bondRegexTest159(){
		assertTrue(jb.bondRegex("(007307)"));
	}
	@Test
	public void bondRegexTest160(){
		assertTrue(jb.bondRegex("(00737)"));
	}
	@Test
	public void bondRegexTest161(){
		assertFalse(jb.bondRegex("(0074("));
	}
	@Test
	public void bondRegexTest162(){
		assertTrue(jb.bondRegex("(0074)"));
	}
	@Test
	public void bondRegexTest163(){
		assertTrue(jb.bondRegex("(0074007)"));
	}
	@Test
	public void bondRegexTest164(){
		assertTrue(jb.bondRegex("(007407)"));
	}
	@Test
	public void bondRegexTest165(){
		assertTrue(jb.bondRegex("(00747)"));
	}
	@Test
	public void bondRegexTest166(){
		assertFalse(jb.bondRegex("(0075("));
	}
	@Test
	public void bondRegexTest167(){
		assertTrue(jb.bondRegex("(0075)"));
	}
	@Test
	public void bondRegexTest168(){
		assertTrue(jb.bondRegex("(0075007)"));
	}
	@Test
	public void bondRegexTest169(){
		assertTrue(jb.bondRegex("(007507)"));
	}
	@Test
	public void bondRegexTest170(){
		assertTrue(jb.bondRegex("(00757)"));
	}
	@Test
	public void bondRegexTest171(){
		assertFalse(jb.bondRegex("(0076("));
	}
	@Test
	public void bondRegexTest172(){
		assertTrue(jb.bondRegex("(0076)"));
	}
	@Test
	public void bondRegexTest173(){
		assertTrue(jb.bondRegex("(0076007)"));
	}
	@Test
	public void bondRegexTest174(){
		assertTrue(jb.bondRegex("(007607)"));
	}
	@Test
	public void bondRegexTest175(){
		assertTrue(jb.bondRegex("(00767)"));
	}
	@Test
	public void bondRegexTest176(){
		assertFalse(jb.bondRegex("(0077("));
	}
	@Test
	public void bondRegexTest177(){
		assertTrue(jb.bondRegex("(0077)"));
	}
	@Test
	public void bondRegexTest178(){
		assertTrue(jb.bondRegex("(0077007)"));
	}
	@Test
	public void bondRegexTest179(){
		assertTrue(jb.bondRegex("(007707)"));
	}
	@Test
	public void bondRegexTest180(){
		assertTrue(jb.bondRegex("(00777)"));
	}
	@Test
	public void bondRegexTest181(){
		assertFalse(jb.bondRegex("(0078("));
	}
	@Test
	public void bondRegexTest182(){
		assertTrue(jb.bondRegex("(0078)"));
	}
	@Test
	public void bondRegexTest183(){
		assertTrue(jb.bondRegex("(0078007)"));
	}
	@Test
	public void bondRegexTest184(){
		assertTrue(jb.bondRegex("(007807)"));
	}
	@Test
	public void bondRegexTest185(){
		assertTrue(jb.bondRegex("(00787)"));
	}
	@Test
	public void bondRegexTest186(){
		assertFalse(jb.bondRegex("(0079("));
	}
	@Test
	public void bondRegexTest187(){
		assertTrue(jb.bondRegex("(0079)"));
	}
	@Test
	public void bondRegexTest188(){
		assertTrue(jb.bondRegex("(0079007)"));
	}
	@Test
	public void bondRegexTest189(){
		assertTrue(jb.bondRegex("(007907)"));
	}
	@Test
	public void bondRegexTest190(){
		assertTrue(jb.bondRegex("(00797)"));
	}
	@Test
	public void bondRegexTest191(){
		assertFalse(jb.bondRegex("(008("));
	}
	@Test
	public void bondRegexTest192(){
		assertFalse(jb.bondRegex("(008)"));
	}
	@Test
	public void bondRegexTest193(){
		assertTrue(jb.bondRegex("(008007)"));
	}
	@Test
	public void bondRegexTest194(){
		assertFalse(jb.bondRegex("(00807)"));
	}
	@Test
	public void bondRegexTest195(){
		assertFalse(jb.bondRegex("(0087)"));
	}
	@Test
	public void bondRegexTest196(){
		assertFalse(jb.bondRegex("(009("));
	}
	@Test
	public void bondRegexTest197(){
		assertFalse(jb.bondRegex("(009)"));
	}
	@Test
	public void bondRegexTest198(){
		assertTrue(jb.bondRegex("(009007)"));
	}
	@Test
	public void bondRegexTest199(){
		assertFalse(jb.bondRegex("(00907)"));
	}
	@Test
	public void bondRegexTest200(){
		assertFalse(jb.bondRegex("(0097)"));
	}
	@Test
	public void bondRegexTest201(){
		assertFalse(jb.bondRegex("(01("));
	}
	@Test
	public void bondRegexTest202(){
		assertFalse(jb.bondRegex("(01)"));
	}
	@Test
	public void bondRegexTest203(){
		assertTrue(jb.bondRegex("(01007)"));
	}
	@Test
	public void bondRegexTest204(){
		assertFalse(jb.bondRegex("(0107)"));
	}
	@Test
	public void bondRegexTest205(){
		assertFalse(jb.bondRegex("(017)"));
	}
	@Test
	public void bondRegexTest206(){
		assertFalse(jb.bondRegex("(02("));
	}
	@Test
	public void bondRegexTest207(){
		assertFalse(jb.bondRegex("(02)"));
	}
	@Test
	public void bondRegexTest208(){
		assertTrue(jb.bondRegex("(02007)"));
	}
	@Test
	public void bondRegexTest209(){
		assertFalse(jb.bondRegex("(0207)"));
	}
	@Test
	public void bondRegexTest210(){
		assertFalse(jb.bondRegex("(027)"));
	}
	@Test
	public void bondRegexTest211(){
		assertFalse(jb.bondRegex("(03("));
	}
	@Test
	public void bondRegexTest212(){
		assertFalse(jb.bondRegex("(03)"));
	}
	@Test
	public void bondRegexTest213(){
		assertTrue(jb.bondRegex("(03007)"));
	}
	@Test
	public void bondRegexTest214(){
		assertFalse(jb.bondRegex("(0307)"));
	}
	@Test
	public void bondRegexTest215(){
		assertFalse(jb.bondRegex("(037)"));
	}
	@Test
	public void bondRegexTest216(){
		assertFalse(jb.bondRegex("(04("));
	}
	@Test
	public void bondRegexTest217(){
		assertFalse(jb.bondRegex("(04)"));
	}
	@Test
	public void bondRegexTest218(){
		assertTrue(jb.bondRegex("(04007)"));
	}
	@Test
	public void bondRegexTest219(){
		assertFalse(jb.bondRegex("(0407)"));
	}
	@Test
	public void bondRegexTest220(){
		assertFalse(jb.bondRegex("(047)"));
	}
	@Test
	public void bondRegexTest221(){
		assertFalse(jb.bondRegex("(05("));
	}
	@Test
	public void bondRegexTest222(){
		assertFalse(jb.bondRegex("(05)"));
	}
	@Test
	public void bondRegexTest223(){
		assertTrue(jb.bondRegex("(05007)"));
	}
	@Test
	public void bondRegexTest224(){
		assertFalse(jb.bondRegex("(0507)"));
	}
	@Test
	public void bondRegexTest225(){
		assertFalse(jb.bondRegex("(057)"));
	}
	@Test
	public void bondRegexTest226(){
		assertFalse(jb.bondRegex("(06("));
	}
	@Test
	public void bondRegexTest227(){
		assertFalse(jb.bondRegex("(06)"));
	}
	@Test
	public void bondRegexTest228(){
		assertTrue(jb.bondRegex("(06007)"));
	}
	@Test
	public void bondRegexTest229(){
		assertFalse(jb.bondRegex("(0607)"));
	}
	@Test
	public void bondRegexTest230(){
		assertFalse(jb.bondRegex("(067)"));
	}
	@Test
	public void bondRegexTest231(){
		assertFalse(jb.bondRegex("(07("));
	}
	@Test
	public void bondRegexTest232(){
		assertFalse(jb.bondRegex("(07)"));
	}
	@Test
	public void bondRegexTest233(){
		assertTrue(jb.bondRegex("(07007)"));
	}
	@Test
	public void bondRegexTest234(){
		assertFalse(jb.bondRegex("(0707)"));
	}
	@Test
	public void bondRegexTest235(){
		assertFalse(jb.bondRegex("(077)"));
	}
	@Test
	public void bondRegexTest236(){
		assertFalse(jb.bondRegex("(08("));
	}
	@Test
	public void bondRegexTest237(){
		assertFalse(jb.bondRegex("(08)"));
	}
	@Test
	public void bondRegexTest238(){
		assertTrue(jb.bondRegex("(08007)"));
	}
	@Test
	public void bondRegexTest239(){
		assertFalse(jb.bondRegex("(0807)"));
	}
	@Test
	public void bondRegexTest240(){
		assertFalse(jb.bondRegex("(087)"));
	}
	@Test
	public void bondRegexTest241(){
		assertFalse(jb.bondRegex("(09("));
	}
	@Test
	public void bondRegexTest242(){
		assertFalse(jb.bondRegex("(09)"));
	}
	@Test
	public void bondRegexTest243(){
		assertTrue(jb.bondRegex("(09007)"));
	}
	@Test
	public void bondRegexTest244(){
		assertFalse(jb.bondRegex("(0907)"));
	}
	@Test
	public void bondRegexTest245(){
		assertFalse(jb.bondRegex("(097)"));
	}
	@Test
	public void bondRegexTest246(){
		assertFalse(jb.bondRegex("(1("));
	}
	@Test
	public void bondRegexTest247(){
		assertFalse(jb.bondRegex("(1)"));
	}
	@Test
	public void bondRegexTest248(){
		assertTrue(jb.bondRegex("(1007)"));
	}
	@Test
	public void bondRegexTest249(){
		assertFalse(jb.bondRegex("(107)"));
	}
	@Test
	public void bondRegexTest250(){
		assertFalse(jb.bondRegex("(17)"));
	}
	@Test
	public void bondRegexTest251(){
		assertFalse(jb.bondRegex("(2("));
	}
	@Test
	public void bondRegexTest252(){
		assertFalse(jb.bondRegex("(2)"));
	}
	@Test
	public void bondRegexTest253(){
		assertTrue(jb.bondRegex("(2007)"));
	}
	@Test
	public void bondRegexTest254(){
		assertFalse(jb.bondRegex("(207)"));
	}
	@Test
	public void bondRegexTest255(){
		assertFalse(jb.bondRegex("(27)"));
	}
	@Test
	public void bondRegexTest256(){
		assertFalse(jb.bondRegex("(3("));
	}
	@Test
	public void bondRegexTest257(){
		assertFalse(jb.bondRegex("(3)"));
	}
	@Test
	public void bondRegexTest258(){
		assertTrue(jb.bondRegex("(3007)"));
	}
	@Test
	public void bondRegexTest259(){
		assertFalse(jb.bondRegex("(307)"));
	}
	@Test
	public void bondRegexTest260(){
		assertFalse(jb.bondRegex("(37)"));
	}
	@Test
	public void bondRegexTest261(){
		assertFalse(jb.bondRegex("(4("));
	}
	@Test
	public void bondRegexTest262(){
		assertFalse(jb.bondRegex("(4)"));
	}
	@Test
	public void bondRegexTest263(){
		assertTrue(jb.bondRegex("(4007)"));
	}
	@Test
	public void bondRegexTest264(){
		assertFalse(jb.bondRegex("(407)"));
	}
	@Test
	public void bondRegexTest265(){
		assertFalse(jb.bondRegex("(47)"));
	}
	@Test
	public void bondRegexTest266(){
		assertFalse(jb.bondRegex("(5("));
	}
	@Test
	public void bondRegexTest267(){
		assertFalse(jb.bondRegex("(5)"));
	}
	@Test
	public void bondRegexTest268(){
		assertTrue(jb.bondRegex("(5007)"));
	}
	@Test
	public void bondRegexTest269(){
		assertFalse(jb.bondRegex("(507)"));
	}
	@Test
	public void bondRegexTest270(){
		assertFalse(jb.bondRegex("(57)"));
	}
	@Test
	public void bondRegexTest271(){
		assertFalse(jb.bondRegex("(6("));
	}
	@Test
	public void bondRegexTest272(){
		assertFalse(jb.bondRegex("(6)"));
	}
	@Test
	public void bondRegexTest273(){
		assertTrue(jb.bondRegex("(6007)"));
	}
	@Test
	public void bondRegexTest274(){
		assertFalse(jb.bondRegex("(607)"));
	}
	@Test
	public void bondRegexTest275(){
		assertFalse(jb.bondRegex("(67)"));
	}
	@Test
	public void bondRegexTest276(){
		assertFalse(jb.bondRegex("(7("));
	}
	@Test
	public void bondRegexTest277(){
		assertFalse(jb.bondRegex("(7)"));
	}
	@Test
	public void bondRegexTest278(){
		assertTrue(jb.bondRegex("(7007)"));
	}
	@Test
	public void bondRegexTest279(){
		assertFalse(jb.bondRegex("(707)"));
	}
	@Test
	public void bondRegexTest280(){
		assertFalse(jb.bondRegex("(77)"));
	}
	@Test
	public void bondRegexTest281(){
		assertFalse(jb.bondRegex("(8("));
	}
	@Test
	public void bondRegexTest282(){
		assertFalse(jb.bondRegex("(8)"));
	}
	@Test
	public void bondRegexTest283(){
		assertTrue(jb.bondRegex("(8007)"));
	}
	@Test
	public void bondRegexTest284(){
		assertFalse(jb.bondRegex("(807)"));
	}
	@Test
	public void bondRegexTest285(){
		assertFalse(jb.bondRegex("(87)"));
	}
	@Test
	public void bondRegexTest286(){
		assertFalse(jb.bondRegex("(9("));
	}
	@Test
	public void bondRegexTest287(){
		assertFalse(jb.bondRegex("(9)"));
	}
	@Test
	public void bondRegexTest288(){
		assertTrue(jb.bondRegex("(9007)"));
	}
	@Test
	public void bondRegexTest289(){
		assertFalse(jb.bondRegex("(907)"));
	}
	@Test
	public void bondRegexTest290(){
		assertFalse(jb.bondRegex("(97)"));
	}
	@Test
	public void bondRegexTest291(){
		assertFalse(jb.bondRegex(")"));
	}
	@Test
	public void bondRegexTest292(){
		assertFalse(jb.bondRegex(")("));
	}
	@Test
	public void bondRegexTest293(){
		assertFalse(jb.bondRegex("))"));
	}
	@Test
	public void bondRegexTest294(){
		assertFalse(jb.bondRegex(")007)"));
	}
	@Test
	public void bondRegexTest295(){
		assertFalse(jb.bondRegex(")07)"));
	}
	@Test
	public void bondRegexTest296(){
		assertFalse(jb.bondRegex(")7)"));
	}
	@Test
	public void bondRegexTest297(){
		assertFalse(jb.bondRegex("0("));
	}
	@Test
	public void bondRegexTest298(){
		assertFalse(jb.bondRegex("0)"));
	}
	@Test
	public void bondRegexTest299(){
		assertFalse(jb.bondRegex("0007)"));
	}
	@Test
	public void bondRegexTest300(){
		assertFalse(jb.bondRegex("007)"));
	}
	@Test
	public void bondRegexTest301(){
		assertFalse(jb.bondRegex("07)"));
	}
	@Test
	public void bondRegexTest302(){
		assertFalse(jb.bondRegex("1("));
	}
	@Test
	public void bondRegexTest303(){
		assertFalse(jb.bondRegex("1)"));
	}
	@Test
	public void bondRegexTest304(){
		assertFalse(jb.bondRegex("1007)"));
	}
	@Test
	public void bondRegexTest305(){
		assertFalse(jb.bondRegex("107)"));
	}
	@Test
	public void bondRegexTest306(){
		assertFalse(jb.bondRegex("17)"));
	}
	@Test
	public void bondRegexTest307(){
		assertFalse(jb.bondRegex("2("));
	}
	@Test
	public void bondRegexTest308(){
		assertFalse(jb.bondRegex("2)"));
	}
	@Test
	public void bondRegexTest309(){
		assertFalse(jb.bondRegex("2007)"));
	}
	@Test
	public void bondRegexTest310(){
		assertFalse(jb.bondRegex("207)"));
	}
	@Test
	public void bondRegexTest311(){
		assertFalse(jb.bondRegex("27)"));
	}
	@Test
	public void bondRegexTest312(){
		assertFalse(jb.bondRegex("3("));
	}
	@Test
	public void bondRegexTest313(){
		assertFalse(jb.bondRegex("3)"));
	}
	@Test
	public void bondRegexTest314(){
		assertFalse(jb.bondRegex("3007)"));
	}
	@Test
	public void bondRegexTest315(){
		assertFalse(jb.bondRegex("307)"));
	}
	@Test
	public void bondRegexTest316(){
		assertFalse(jb.bondRegex("37)"));
	}
	@Test
	public void bondRegexTest317(){
		assertFalse(jb.bondRegex("4("));
	}
	@Test
	public void bondRegexTest318(){
		assertFalse(jb.bondRegex("4)"));
	}
	@Test
	public void bondRegexTest319(){
		assertFalse(jb.bondRegex("4007)"));
	}
	@Test
	public void bondRegexTest320(){
		assertFalse(jb.bondRegex("407)"));
	}
	@Test
	public void bondRegexTest321(){
		assertFalse(jb.bondRegex("47)"));
	}
	@Test
	public void bondRegexTest322(){
		assertFalse(jb.bondRegex("5("));
	}
	@Test
	public void bondRegexTest323(){
		assertFalse(jb.bondRegex("5)"));
	}
	@Test
	public void bondRegexTest324(){
		assertFalse(jb.bondRegex("5007)"));
	}
	@Test
	public void bondRegexTest325(){
		assertFalse(jb.bondRegex("507)"));
	}
	@Test
	public void bondRegexTest326(){
		assertFalse(jb.bondRegex("57)"));
	}
	@Test
	public void bondRegexTest327(){
		assertFalse(jb.bondRegex("6("));
	}
	@Test
	public void bondRegexTest328(){
		assertFalse(jb.bondRegex("6)"));
	}
	@Test
	public void bondRegexTest329(){
		assertFalse(jb.bondRegex("6007)"));
	}
	@Test
	public void bondRegexTest330(){
		assertFalse(jb.bondRegex("607)"));
	}
	@Test
	public void bondRegexTest331(){
		assertFalse(jb.bondRegex("67)"));
	}
	@Test
	public void bondRegexTest332(){
		assertFalse(jb.bondRegex("7("));
	}
	@Test
	public void bondRegexTest333(){
		assertFalse(jb.bondRegex("7)"));
	}
	@Test
	public void bondRegexTest334(){
		assertFalse(jb.bondRegex("7007)"));
	}
	@Test
	public void bondRegexTest335(){
		assertFalse(jb.bondRegex("707)"));
	}
	@Test
	public void bondRegexTest336(){
		assertFalse(jb.bondRegex("77)"));
	}
	@Test
	public void bondRegexTest337(){
		assertFalse(jb.bondRegex("8("));
	}
	@Test
	public void bondRegexTest338(){
		assertFalse(jb.bondRegex("8)"));
	}
	@Test
	public void bondRegexTest339(){
		assertFalse(jb.bondRegex("8007)"));
	}
	@Test
	public void bondRegexTest340(){
		assertFalse(jb.bondRegex("807)"));
	}
	@Test
	public void bondRegexTest341(){
		assertFalse(jb.bondRegex("87)"));
	}
	@Test
	public void bondRegexTest342(){
		assertFalse(jb.bondRegex("9("));
	}
	@Test
	public void bondRegexTest343(){
		assertFalse(jb.bondRegex("9)"));
	}
	@Test
	public void bondRegexTest344(){
		assertFalse(jb.bondRegex("9007)"));
	}
	@Test
	public void bondRegexTest345(){
		assertFalse(jb.bondRegex("907)"));
	}
	@Test
	public void bondRegexTest346(){
		assertFalse(jb.bondRegex("97)"));
	}
}
