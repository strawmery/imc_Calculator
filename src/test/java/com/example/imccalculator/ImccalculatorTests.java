package com.example.imccalculator;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class ImccalculatorTests {
	private ImcCalculator manager;

	@BeforeEach
	public void setup() {
		manager = new ImcCalculator();
	}

	@Test
	void extremeSkinny() {
		assertEquals("Delgadez Severa", manager.calculateImc(40, 1.68));
	}

	@Test
	void moderateSkinny() {
		assertEquals("Delgadez Moderada", manager.calculateImc(44, 1.65));
	}

	@Test
	void littleSkinny() {
		assertEquals("Delgadez Leve", manager.calculateImc(50, 1.70));
	}

	@Test
	void normalWeight() {
		assertEquals("Peso Normal", manager.calculateImc(60, 1.70));
	}

	@Test
	void overWeight() {
		assertEquals("Sobrepeso", manager.calculateImc(80, 1.72));
	}

	@Test
	void litleoverWeight() {
		assertEquals("Obesidad leve", manager.calculateImc(88, 1.70));
	}

	@Test
	void moderatedoverWeight() {
		assertEquals("Obesidad Moderada", manager.calculateImc(105, 1.70));
	}

	@Test
	void morbiddoverWeight() {
		assertEquals("Obesidad Morbida", manager.calculateImc(120, 1.65));
		
	}
}
