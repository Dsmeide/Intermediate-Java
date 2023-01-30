package original;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class InterfaceExampleTwoTest {

	@Test
	void powerButton_On_ReturnOn() {
		computer i = new InterfaceExampleTwo();
		String s = i.powerButton("On");
		assertEquals("On", s);
	}
	@Test
	void powerButton_Off_ReturnOff() {
		InterfaceExampleTwo i = new InterfaceExampleTwo();
		String s = i.powerButton("Off");
		assertEquals("Off", s);
	}
	@Test
	void powerButton_Reset_ReturnReset() {
		InterfaceExampleTwo i = new InterfaceExampleTwo();
		String s = i.powerButton("Reset");
		assertEquals("Reset", s);
	}
	@Test
	void powerButton_InvalidInput_ReturnInvalid() {
		InterfaceExampleTwo i = new InterfaceExampleTwo();
		String s = i.powerButton("asdf");
		assertEquals("invalid", s);
	}

}
