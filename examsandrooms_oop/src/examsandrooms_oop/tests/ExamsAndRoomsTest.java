package examsandrooms_oop.tests;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Set;

import org.junit.jupiter.api.Test;

import examsandrooms_oop.Exam;
import examsandrooms_oop.Room;

class ExamsAndRoomsTest {

	@Test
	void test() {
		Exam oop = new Exam();
		assertEquals(Set.of(), oop.getRooms());
		
		Room qdv03_180 = new Room();
		assertEquals(Set.of(), qdv03_180.getExams());
		
		oop.addRoom(qdv03_180);
		assertEquals(Set.of(qdv03_180), oop.getRooms());
		assertEquals(Set.of(oop), qdv03_180.getExams());
		
		oop.removeRoom(qdv03_180);
		assertEquals(Set.of(), oop.getRooms());
		assertEquals(Set.of(), qdv03_180.getExams());
	}

}
