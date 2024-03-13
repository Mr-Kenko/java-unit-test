@Test
public void checkIsAdultWhenAgeIsMoreThan18True() {
    Program program = new Program();
    boolean isAdult = program.checkIsAdult(19);
	assertEquals("Переменная isAdult должна содержать значение true", true, isAdult);// Напиши код здесь
}
