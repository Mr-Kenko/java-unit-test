@RunWith(Parameterized.class) 
public class CheckIsAdultTest {
	
  private final int age;
  private final boolean expected;

  public CheckIsAdultTest(int age, boolean expected) {
	this.age = age;
    this.expected = expected;
  }

  @Parameterized.Parameters
  public static Object[][] getTextData() {
	return new Object[][] {
        {19, true},
        {17, false},
        {18, true},
        {21, true},
    };
  }

  @Test
  public void checkIsAdultWhenAgeThenResult() {
	Program program = new Program();
    boolean isAdult = program.checkIsAdult(age);
	// Сравни полученный и ожидаемый результаты, не забудь про сообщение об ошибке
    assertEquals("Результат метода checkIsAdult для возраста " + age + " должен быть " + expected, expected, isAdult);
	}
}
